import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculadoraTest {

    @Test
    public void testSumaPositivos() {
        assertEquals(5, Calculadora.getSuma(2, 3));
    }
    @Test
    public void testSumaNegativos() {
        assertEquals(-5, Calculadora.getSuma(-2, -3));
    }
    @Test
    public void testSumaNegativoMasPositivo() {
        assertEquals(1,Calculadora.getSuma(-2, 3));
    }

    @Test
    public void testRestaPositivos() {
        assertEquals(2, Calculadora.getResta(5, 3));
    }
    @Test
    public void testRestaNegativos() {
        assertEquals(-2, Calculadora.getResta(-5, -3));
    }
    @Test
    public void testRestaPositivoMenosNegativo() {
        assertEquals(8, Calculadora.getResta(5, -3));
    }
    @Test
    public void testMultiplicacionPositivos() {
        assertEquals(6,Calculadora.getMultiplicacion(2, 3));
    }
    @Test
    public void testMultiplicacionNegativos() {
        assertEquals(6, Calculadora.getMultiplicacion(-2, -3));
    }
    @Test
    public void testMultiplicacionNegativoYPositivo() {
        assertEquals(-6, Calculadora.getMultiplicacion(-2, 3));
    }

    @Test
    public void testDivisionPositivos() {
        assertEquals(2, Calculadora.getDivision(6, 3));
    }
    @Test
    public void testDivisionNegativos() {
        assertEquals(2, Calculadora.getDivision(-6, -3));
    }
    @Test
    public void testDivisionNegativoYPositivo() {
        assertEquals(-2,Calculadora.getDivision(-6, 3));
    }

    @Test
    public void testRaiz() {
        assertEquals(4, Calculadora.getRaiz(2, 16));
    }
}
