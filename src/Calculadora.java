import com.DAM2024.librerias.Entrada;
import com.DAM2024.librerias.Salida;

import javax.swing.*;


public class Calculadora{
    public final static int SUMA = 1;
    public final static int MULTIPLICACION = 3;

    public final static int DIVISION = 4;

    public final static int RESTA = 2;


    public int Calculadora(float dato1, float dato2) {
        /**
         * @param float dato1
         * @param float dato2
         *
         * @return número entero
         *
         */


        int opcion= Integer.parseInt(JOptionPane.showInputDialog("Qué operación queres realizar \n 1. Suma \n 2. Multiplicación \n 3. Resta \n 4. División\""));
        float resultado = 0;
        String mensaje;

        switch (opcion) {
            case SUMA:
                resultado = dato1 + dato2;
                mensaje="Suma";
                break;
            case MULTIPLICACION:
                resultado = dato1 * dato2;
                mensaje="Multiplication";

                break;
            case RESTA:
                resultado = dato1 - dato2;
                mensaje="Resta";

                break;
            case DIVISION:
                if (dato2 != 0) {
                    resultado = dato1 / dato2;
                } else {
                    JOptionPane.showMessageDialog(null, "No es posible dividir por cero", "Error", JOptionPane.ERROR_MESSAGE);
                }
                mensaje="División";

                break;
            default:
                JOptionPane.showMessageDialog(null, "Operación no válida", "Error", JOptionPane.ERROR_MESSAGE);
                mensaje=null;
        }
        int resultadoInt = Math.round(resultado);
        JOptionPane.showMessageDialog(null,"EL resultado entero de "+mensaje+" con los datos "+dato1+ " y "+dato2 +"es: ");
        Salida.Seleccion_salida(resultadoInt,1);
        return resultadoInt;

    }


}
