package eje5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BancoTest {
    private static Banco banco;

    @BeforeAll
    static void cuentas() {
        Cuenta cuenta1 = new Cuenta("Felipe Gomez", "100C", 200);
        Cuenta cuenta2 = new Cuenta("Sofia Galeano", "200C", 100);
        Cuenta cuenta3 = new Cuenta("Alejandro Gallego", "300C", 50);
        List<Cuenta> cuentasList = new ArrayList<>();
        cuentasList.add(cuenta1);
        cuentasList.add(cuenta2);
        cuentasList.add(cuenta3);

        banco = new Banco(cuentasList);
    }

    @Test
    void testExisteCuenta() {
        assertTrue(banco.existeCuenta("Felipe Gomez"));
    }

    @Test
    void testExisteCuentaFallido() {
        assertFalse(banco.existeCuenta("Gonzalo Fuentes"));
    }

    @Test
    void testDepositar() {
        banco.depositar("100C", 100);
        assertEquals(300, banco.getCuentas().get(0).getSaldo());
    }

    @Test
    void testRetirar() {
        banco.retirar("100C", 50);
        assertEquals(100, banco.getCuentas().get(1).getSaldo());
    }

    @Test
    void testDepositarFallido() {
        assertThrows(IllegalArgumentException.class, () -> {
            banco.depositar("400C", 100);
        });
    }

    @Test
    void testRetirarFallido() {
        assertThrows(IllegalArgumentException.class, () -> {
            banco.retirar("300C", 100);
        });
    }
}
