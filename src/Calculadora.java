import com.DAM2024.librerias.Entrada;
import com.DAM2024.librerias.Salida;

import javax.swing.*;


public class Calculadora{
    public final static int SUMA = 1;


    public final static int RESTA = 2;

    public final static int MULTIPLICACION = 3;

    public final static int DIVISION = 4;

        public final static int RAIZ = 5;




    public static Float Calculadora(float dato1, float dato2) {
        /**
         * @param float dato1
         * @param float dato2
         *
         * @return número entero
         *
         */

        Float resultado=0.0f;

        int opcion = getOpcion();
        String mensaje = getMensaje();

        switch (opcion) {
            case SUMA:
                resultado = dato1 + dato2;
                break;
            case MULTIPLICACION:
                resultado = dato1 * dato2;

                break;
            case RESTA:
                resultado = dato1 - dato2;

                break;
            case DIVISION:
                try {
                    resultado = dato1 / dato2;
                } catch (ArithmeticException e) {
                    JOptionPane.showMessageDialog(null, "No se puede dividir por cero");
                } finally {
                    break;
                }

            case RAIZ:
                if (dato1 == 0) {
                    resultado = 1F;
                } else {
                    resultado = (float) Math.pow(dato2, 1 / dato1);
                }
                break;


            default:

                resultado = null;
        }

        JOptionPane.showMessageDialog(null,"EL resultado entero de "+getMensaje()+" con los datos "+dato1+ " y " +dato2 +" es: ");
       return resultado;

    }

    private static String getMensaje() {
        String mensaje=null;
        switch (getOpcion()) {
            case SUMA:
                mensaje = "Suma";
                break;
            case MULTIPLICACION:
                mensaje = "Multiplicación";
                break;
            case RESTA:
                mensaje = "Resta";
                break;
            case DIVISION:
                mensaje = "División";
                break;
            case RAIZ:
                mensaje = "Raiz";
                break;
        }
        return mensaje;

    }

    private static int getOpcion() {
        int opcion= Integer.parseInt(JOptionPane.showInputDialog("Qué operación queres realizar \n 1. Suma \n 2. Multiplicación \n 3. Resta \n 4. División\""));
        return opcion;
    }


}
