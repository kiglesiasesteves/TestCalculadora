import com.DAM2024.librerias.Entrada;
import com.DAM2024.librerias.Salida;

import javax.swing.*;

/**
 * La clase Main contiene el método principal para ejecutar el programa.
 * Toma la entrada del usuario a través de la consola o ventana, realiza cálculos usando la clase Calculadora,
 * y muestra el resultado usando la clase Salida.
 */
public class Main {

    /**
     * El método principal del programa.
     * Solicita al usuario que ingrese dos números, realiza cálculos usando la clase Calculadora,
     * y muestra el resultado o un mensaje de error usando la clase Salida.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {

        // Solicita al usuario que ingrese dos números
        Float retorno = Calculadora.Calculadora(
                Entrada.entrada_ventana_consola_float("Tecle el primer número (en caso de querer realizar una raíz, este será el radicando)", Entrada.VENTANA),
                Entrada.entrada_ventana_consola_float("Tecle el segundo número (en caso de querer realizar una raíz, este será el índice)", Entrada.VENTANA));

        // Verifica el valor de retorno y muestra el resultado o un mensaje de error
        if (retorno == null) {
            Salida.salida_ventana_consola("Algo falló", Salida.CONSOLA);
        } else {
            Salida.salida_float("Resultado: ", retorno, Salida.CONSOLA);
        }
    }
}

    

    

    
    
 


