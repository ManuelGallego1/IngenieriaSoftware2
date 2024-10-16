package taller2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Factura y Cliente
        Factura factura1 = new Factura("F001", new Date(), "Juan Pérez", 1234.56, "Calle Falsa 123");
        Cliente cliente1 = new Cliente("Juan Pérez", "Calle Falsa 123", "+34 123 456 789", "juan.perez@example.com");

        // Instanciar las clases de gestión
        IGuardar<Factura> guardarFactura = new GuardarFactura();
        IEnviarEmail enviarEmailFactura = new EnviarEmailFactura();
        IGuardar<Cliente> guardarCliente = new GuardarCliente();
        IGenerarReporte<Factura> generarReporteFacturas = new GenerarReporteFacturas();
        IEnviarEmail emailFacturaDian = new EmailFacturaDian();

        // Agregar y almacenar facturas y clientes
        guardarFactura.agregar(factura1);
        guardarCliente.agregar(cliente1);

        // Enviar factura por email
        enviarEmailFactura.enviar(factura1, cliente1.getCorreoElectronico());

        // Enviar factura a la DIAN
        emailFacturaDian.enviar(factura1);

        // Generar reporte de facturas
        generarReporteFacturas.generarReporte(guardarFactura.listar());

        // Buscar un cliente
        Cliente clienteBuscado = ((GuardarCliente)guardarCliente).buscarClientePorNombre("Juan Pérez");
        System.out.println("Cliente buscado: " + clienteBuscado);
    }
}

// Interfaz para guardar objetos
interface IGuardar<T> {
    void agregar(T t);
    List<T> listar();
}

// Interfaz para enviar emails
interface IEnviarEmail {
    void enviar(Factura factura, String correoDestinatario);
}

// Interfaz para generar reportes
interface IGenerarReporte<T> {
    void generarReporte(List<T> items);
}

// Clase Factura
public class Factura {
    private String numeroFactura;
    private Date fecha;
    private String cliente;
    private double montoTotal;
    private String direccion;

    public Factura(String numeroFactura, Date fecha, String cliente, double montoTotal, String direccion) {
        this.numeroFactura = numeroFactura;
        this.fecha = fecha;
        this.cliente = cliente;
        this.montoTotal = montoTotal;
        this.direccion = direccion;
    }

    public String getNumeroFactura() { return numeroFactura; }
    public Date getFecha() { return fecha; }
    public String getCliente() { return cliente; }
    public double getMontoTotal() { return montoTotal; }
    public String getDireccion() { return direccion; }
}

// Clase Cliente
public class Cliente {
    private String nombre;
    private String direccion;
    private String telefono;
    private String correoElectronico;

    public Cliente(String nombre, String direccion, String telefono, String correoElectronico) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
    public String getTelefono() { return telefono; }
    public String getCorreoElectronico() { return correoElectronico; }
}

// Clase para guardar facturas
public class GuardarFactura implements IGuardar<Factura> {
    private List<Factura> facturas;

    public GuardarFactura() {
        this.facturas = new ArrayList<>();
    }

    public void agregar(Factura factura) {
        facturas.add(factura);
    }

    public List<Factura> listar() {
        return new ArrayList<>(facturas);
    }

    public Factura buscarFacturaPorNumero(String numeroFactura) {
        Optional<Factura> factura = facturas.stream()
                .filter(f -> f.getNumeroFactura().equals(numeroFactura))
                .findFirst();
        return factura.orElse(null);
    }

    public boolean eliminarFacturaPorNumero(String numeroFactura) {
        return facturas.removeIf(f -> f.getNumeroFactura().equals(numeroFactura));
    }
}

// Clase para enviar factura por email
public class EnviarEmailFactura implements IEnviarEmail {
    public void enviar(Factura factura, String correoDestinatario) {
        System.out.println("Enviando email a: " + correoDestinatario);
        System.out.println("Asunto: Factura " + factura.getNumeroFactura());
        System.out.println("Contenido del email:\n" +
                "Factura No: " + factura.getNumeroFactura() + "\n" +
                "Fecha: " + factura.getFecha() + "\n" +
                "Cliente: " + factura.getCliente() + "\n" +
                "Monto Total: " + factura.getMontoTotal() + "\n" +
                "Dirección: " + factura.getDireccion());
        System.out.println("Email enviado exitosamente.");
    }
}

// Clase para guardar clientes
public class GuardarCliente implements IGuardar<Cliente> {
    private List<Cliente> clientes;

    public GuardarCliente() {
        this.clientes = new ArrayList<>();
    }

    public void agregar(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> listar() {
        return new ArrayList<>(clientes);
    }

    public Cliente buscarClientePorNombre(String nombre) {
        Optional<Cliente> cliente = clientes.stream()
                .filter(c -> c.getNombre().equalsIgnoreCase(nombre))
                .findFirst();
        return cliente.orElse(null);
    }
}

// Clase para generar reporte de facturas
public class GenerarReporteFacturas implements IGenerarReporte<Factura> {
    public void generarReporte(List<Factura> facturas) {
        System.out.println("Reporte de Facturas:");
        for (Factura factura : facturas) {
            System.out.println("Factura No: " + factura.getNumeroFactura());
            System.out.println("Fecha: " + factura.getFecha());
            System.out.println("Cliente: " + factura.getCliente());
            System.out.println("Monto Total: " + factura.getMontoTotal());
            System.out.println("Dirección: " + factura.getDireccion());
            System.out.println("--------------");
        }
    }
}

// Clase para enviar factura a la DIAN
public class EmailFacturaDian implements IEnviarEmail {
    public void enviar(Factura factura, String correoDestinatario) {
        System.out.println("Enviando factura a la DIAN:");
        System.out.println("Factura No: " + factura.getNumeroFactura());
        System.out.println("Fecha: " + factura.getFecha());
        System.out.println("Cliente: " + factura.getCliente());
        System.out.println("Monto Total: " + factura.getMontoTotal());
        System.out.println("Dirección: " + factura.getDireccion());
        System.out.println("Factura enviada exitosamente a la DIAN.");
    }
}
