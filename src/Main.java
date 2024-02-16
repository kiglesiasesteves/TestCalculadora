import com.DAM2024.librerias.Entrada;
import com.DAM2024.librerias.Salida;

import javax.swing.*;

public class Main {
        public static void main(String[] args) {

               Float retorno = Calculadora.Calculadora(Entrada.entrada_ventana_consola_float("Tecle el primer numero",Entrada.VENTANA),Entrada.entrada_ventana_consola_float("Tecle el segundo numero",Entrada.VENTANA));

               //Comprobacion del retorno
               if(retorno == null){
                   Salida.salida_ventana_consola("Algo fallo",Salida.CONSOLA);
               }else{
                   Salida.salida_float("Resultado: ",retorno,Salida.CONSOLA);
               }
           }
       }


    

    

    
    
 


