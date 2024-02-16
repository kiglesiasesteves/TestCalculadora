import com.DAM2024.librerias.Entrada;
import com.DAM2024.librerias.Salida;

import javax.swing.*;


public class Calculadora{
    public final static int SUMA = 1;
    public final static int MULTIPLICACION = 3;

    public final static int DIVISION = 4;

    public final static int RESTA = 2;


    public static Float Calculadora(float dato1, float dato2) {
        /**
         * @param float dato1
         * @param float dato2
         *
         * @return número entero
         *
         */

        Float resultado=0.0f;

        int opcion= Integer.parseInt(JOptionPane.showInputDialog("Qué operación queres realizar \n 1. Suma \n 2. Multiplicación \n 3. Resta \n 4. División\""));
        String mensaje=null;

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
            try {
                resultado = dato1 / dato2;
            }catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null,"No se puede dividir por cero");
            }finally{
                break;
            }

            default:

                resultado = null;
        }

        JOptionPane.showMessageDialog(null,"EL resultado entero de "+mensaje+" con los datos "+dato1+ " y " +dato2 +" es: ");
       return resultado;

    }


}
