import com.DAM2024.librerias.Entrada;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        try {
            Calculadora ca = new Calculadora();
            float dato1 = Entrada.Seleccion_entrada("Escribe o primeiro número", 1);
           float  dato2 = Entrada.Seleccion_entrada("Escribe o segundo número", 2);
            ca.Calculadora(dato1,dato2);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada no válida. Debes ingresar números.", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        } catch (ArithmeticException e) {
            System.err.println("Error aritmético: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Se produjo un error inesperado: " + e.getMessage());
        }
    }
}


