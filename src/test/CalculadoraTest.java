
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculadoraTest {

    @Test
    public void testSumaPositivos() {
        Assertions.assertEquals(5, Calculadora.getSuma(2, 3));
    }
    @Test
    public void testSumaNegativos() {
        Assertions.assertEquals(-5, Calculadora.getSuma(-2, -3));
    }
    @Test
    public void testSumaNegativoMasPositivo() {
        Assertions.assertEquals(1, Calculadora.getSuma(-2, 3));
    }

    @Test
    public void testRestaPositivos() {
        Assertions.assertEquals(2, Calculadora.getResta(5, 3));
    }
    @Test
    public void testRestaNegativos() {
        Assertions.assertEquals(-2, Calculadora.getResta(-5, -3));
    }
    @Test
    public void testRestaPositivoMenosNegativo() {
        Assertions.assertEquals(8, Calculadora.getResta(5, -3));
    }
    @Test
    public void testMultiplicacionPositivos() {
        Assertions.assertEquals(6, Calculadora.getMultiplicacion(2, 3));
    }
    @Test
    public void testMultiplicacionNegativos() {
        Assertions.assertEquals(6, Calculadora.getMultiplicacion(-2, -3));
    }
    @Test
    public void testMultiplicacionNegativoYPositivo() {
        Assertions.assertEquals(-6, Calculadora.getMultiplicacion(-2, 3));
    }

    @Test
    public void testDivisionPositivos() {
        Assertions.assertEquals(2, Calculadora.getDivision(6, 3));
    }
    @Test
    public void testDivisionNegativos() {
        Assertions.assertEquals(2, Calculadora.getDivision(-6, -3));
    }
    @Test
    public void testDivisionNegativoYPositivo() {
        Assertions.assertEquals(-2, Calculadora.getDivision(-6, 3));
    }

    @Test
    public void testRaiz() {
        Assertions.assertEquals(4, Calculadora.getRaiz(2, 16));
    }
}
