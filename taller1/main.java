package taller1;

class Main {

    public class Usuario {

        private String usuario;
        private String contrasena;
        private String id;
        private String salario;
        private String email;

        //SRP Usuario:
        //Responsabilidad: Maneja la información del usuario, como el nombre, la contraseña, el ID y el salario.
        //Comentario: según el SRP, esta clase solo se va a encarga de gestionar la información del usuario.
        public Usuario(String usuario, String contrasena, String id, String salario, String email) {
            this.usuario = usuario;
            this.contrasena = contrasena;
            this.id = id;
            this.salario = salario;
            this.email = email;
        }

        public String getUsuario() {
            return usuario;
        }

        public String getEmail() {
            return email;
        }

        public String getContrasena() {
            return contrasena;
        }

        public String getId() {
            return id;
        }

        public String getSalario() {
            return salario;
        }

        public void setUsuario(String usuario) {
            this.usuario = usuario;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setContrasena(String contrasena) {
            this.contrasena = contrasena;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setSalario(String salario) {
            this.salario = salario;
        }
    }

    //SRP enviarCorreos:
    //Responsabilidad: Sistema para enviar correos.
    //Comentario: Según el SRP, esta clase solo se de gestionar el envio de correos.
    public class enviarCorreos {

        public void enviar(String destinatario, String asunto, String cuerpo, String correoUsuario) {
            System.out.println("================================================");
            System.out.println("Correo");
            System.out.println("De: " + correoUsuario);
            System.out.println("Enviando correo a: " + destinatario);
            System.out.println("Asunto: " + asunto);
            System.out.println("Cuerpo: " + cuerpo);
            System.out.println("Correo enviado exitosamente.");
            System.out.println("================================================");
        }
    }

    //SRP validarContrasena:
    //Responsabilidad: Se encarga de validar que la contraseña del usuario sea correcta.
    //Comentario: Según el SRP, esta clase solo se de gestionar el envio de correos.
    public class validarContrasena {

        public boolean esContrasenaValida(String contrasena) {
            // Validar longitud mínima de 8 caracteres
            if (contrasena.length() < 8) {
                return false;
            }

            // Validar que contenga al menos un número
            if (!contrasena.matches(".*\\d.*")) {
                return false;
            }

            // Validar que contenga al menos una letra
            if (!contrasena.matches(".*[a-zA-Z].*")) {
                return false;
            }

            return true;
        }
    }

    //SRP validarContrasena:
    //Responsabilidad: Se encarga de validar que la contraseña del usuario sea correcta.
    //Comentario: Según el SRP, esta clase solo se de gestionar el envio de correos.
    public class calcularSalario {

        public double calcularSalarioAnual(double salarioMensual) {
            return salarioMensual * 12;
        }

        public double aplicarBono(double salarioMensual, double porcentajeBono) {
            return salarioMensual + (salarioMensual * porcentajeBono / 100);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();

        // Ejemplo de uso de Usuario
        Usuario usuario = main.new Usuario("Alejo", "Contrasena123", "1", "1500000","alejo@test.com");
        System.out.println("Usuario creado exitosamente");

        // Enviar correo
        enviarCorreos correo = main.new enviarCorreos();
        correo.enviar("test@test.com", "Hola", "Este es un correo de prueba.",usuario.getEmail());

        // Validar COntraseña
        validarContrasena validador = main.new validarContrasena();
        boolean esValida = validador.esContrasenaValida(usuario.getContrasena());
        System.out.println("¿Es válida la contraseña?: " + esValida);

        // Calcular salario
        calcularSalario calculador = main.new calcularSalario();
        double salarioAnual = calculador.calcularSalarioAnual(Double.parseDouble(usuario.getSalario()));
        System.out.println("Salario anual: " + salarioAnual);

        double salarioConBono = calculador.aplicarBono(Double.parseDouble(usuario.getSalario()), 10);
        System.out.println("Salario con bono del 10%: " + salarioConBono);
    }
}



