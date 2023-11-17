package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    static Seguro s1, s2;

    @BeforeAll public static void setUp() {
        s1 = new SeguroVida("XYZ", "", 0.0);
        s2 = new SeguroMedico("ABC", "", 0.0);
    }

    @Test public void testTipo1() {
        assertTrue(s1.getTipo().equals("Vida"));
    }

    @Test public void testTipo2() {
        assertTrue(s2.getTipo().equals("Medico"));
    }

    @Test public void testCosto1() {
        assertTrue(s1.getCostoMensual() == 150.0);
    }

    @Test public void testCosto2() {
        assertTrue(s2.getCostoMensual() == 450.0);
    }
}