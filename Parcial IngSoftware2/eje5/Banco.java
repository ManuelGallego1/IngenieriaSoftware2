package eje5;

import java.util.List;

public class Banco {
    List<Cuenta> cuentas;

    public Banco(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public Banco() {
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public void depositar(String numeroCuenta, double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor a 0");
        }

        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumeroCuenta().equals(numeroCuenta)) {
                double saldo = cuenta.getSaldo() + cantidad;
                cuenta.setSaldo(saldo);
                return;
            }
        }
        throw new IllegalArgumentException("NO EXISTE EL NUMERO DE CUENTA");
    }

    public void retirar(String numeroCuenta, double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor a 0");
        }
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumeroCuenta().equals(numeroCuenta)) {
                if (cantidad > cuenta.getSaldo()) {
                    throw new IllegalArgumentException("Fondos Insuficientes");
                }
                double saldo = cantidad - cuenta.getSaldo();
                cuenta.setSaldo(saldo);
                return;
            }
            throw new IllegalArgumentException("NO EXISTE EL NUMERO DE CUENTA");
        }
    }

    public boolean existeCuenta(String titular){
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getTitular().equals(titular)) {
                return true;
            }
        }
        return false;
    }
}
