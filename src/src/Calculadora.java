import com.DAM2024.librerias.Entrada;
import com.DAM2024.librerias.Salida;

import javax.swing.*;

/**
 * Esta clase proporciona métodos para realizar operaciones matemáticas básicas, como suma, resta, multiplicación, división y raíz cuadrada.
 */
public class Calculadora {
    /**
     * Constante para la operación de suma.
     */
    public final static int SUMA = 1;
    /**
     * Constante para la operación de resta.
     */
    public final static int RESTA = 2;
    /**
     * Constante para la operación de multiplicación.
     */
    public final static int MULTIPLICACION = 3;
    /**
     * Constante para la operación de división.
     */
    public final static int DIVISION = 4;
    /**
     * Constante para la operación de raíz cuadrada.
     */
    public final static int RAIZ = 5;

    /**
     * Realiza la operación matemática especificada con los dos datos dados.
     *
     * @param dato1 El primer número para la operación.
     * @param dato2 El segundo número para la operación.
     * @return El resultado de la operación matemática.
     */
    public static Float Calculadora(float dato1, float dato2,int opcion) {
        Float resultado = 0.0f;

        String mensaje = getMensaje(opcion);

        resultado = switch (opcion) {
            case SUMA -> getSuma(dato1, dato2);
            case MULTIPLICACION -> getMultiplicacion(dato1, dato2);
            case RESTA -> getResta(dato1, dato2);
            case DIVISION -> getDivision(dato1, dato2);
            case RAIZ -> getRaiz(dato1, dato2);
            default -> null;
        };

        JOptionPane.showMessageDialog(null, "El resultado de " + getMensaje(opcion) + " con los datos " + dato1 + " y " + dato2 + " es: ");
        return resultado;
    }

    /**
     * Calcula la raíz cuadrada del segundo dato elevado a la inversa del primer dato.
     *
     * @param dato1 El primer número para la operación.
     * @param dato2 El segundo número para la operación.
     * @return La raíz cuadrada del segundo dato elevado a la inversa del primer dato.
     */
    public static Float getRaiz(float dato1, float dato2) {
        float resultado;
        if (dato1 == 0) {
            resultado = 1F;
        } else {
            resultado = (float) Math.pow(dato2, 1 / dato1);
        }
        return resultado;
    }

    /**
     * Realiza la división de los dos datos.
     *
     * @param dato1 El dividendo.
     * @param dato2 El divisor.
     * @return El resultado de la división.
     */
    public static float getDivision(float dato1, float dato2) {
        try {
            return dato1 / dato2;
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "No se puede dividir por cero");
        }
        return dato1 / dato2;
    }

    /**
     * Realiza la resta de los dos datos.
     *
     * @param dato1 El primer número.
     * @param dato2 El segundo número.
     * @return El resultado de la resta.
     */
    public static Float getResta(float dato1, float dato2) {
        float resultado;
        resultado = dato1 - dato2;
        return resultado;
    }

    /**
     * Realiza la multiplicación de los dos datos.
     *
     * @param dato1 El primer número.
     * @param dato2 El segundo número.
     * @return El resultado de la multiplicación.
     */
    public static Float getMultiplicacion(float dato1, float dato2) {
        float resultado;
        resultado = dato1 * dato2;
        return resultado;
    }

    /**
     * Realiza la suma de los dos datos.
     *
     * @param dato1 El primer número.
     * @param dato2 El segundo número.
     * @return El resultado de la suma.
     */
    public static Float getSuma(float dato1, float dato2) {
        float resultado;
        resultado = dato1 + dato2;
        return resultado;
    }

    /**
     * Devuelve el mensaje correspondiente a la opción seleccionada.
     *
     * @param opcion La opción seleccionada.
     * @return El mensaje correspondiente a la opción seleccionada.
     */
    private static String getMensaje(int opcion) {
        return switch (opcion) {
            case SUMA -> "Suma";
            case MULTIPLICACION -> "Multiplicación";
            case RESTA -> "Resta";
            case DIVISION -> "División";
            case RAIZ -> "Raíz";
            default -> null;
        };
    }

    /**
     * Solicita al usuario que ingrese la opción deseada.
     *
     * @return La opción seleccionada por el usuario.
     */
    static int getOpcion() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Qué operación quieres realizar?\n 1. Suma\n 2. Resta\n 3. Multiplicación\n 4. División\n 5. Raíz"));
        return opcion;
    }
}
