import com.DAM2024.librerias.Entrada;
import com.DAM2024.librerias.Salida;

import javax.swing.*;

public class Main {
        public static void main(String[] args) {

               Float retorno = Calculadora.Calculadora(Entrada.entrada_ventana_consola_float("Tecle el primer numero (en el caso de quiera realizar una raíz este será el radicando)",Entrada.VENTANA),Entrada.entrada_ventana_consola_float("Tecle el segundo numero(en el caso de que quiera realizar una raíz este será el índice)",Entrada.VENTANA));

               //Comprobacion del retorno
               if(retorno == null){
                   Salida.salida_ventana_consola("Algo falló",Salida.CONSOLA);
               }else{
                   Salida.salida_float("Resultado: ",retorno,Salida.CONSOLA);
               }
           }
       }


    

    

    
    
 


