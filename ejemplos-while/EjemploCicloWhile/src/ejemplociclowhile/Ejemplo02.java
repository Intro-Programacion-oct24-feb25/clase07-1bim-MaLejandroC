/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Ejemplo02 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // PARA QUE LOS DECIMALES SE
        //CAMBIE LA COMA POR EL PUNTO 
        int limite;
        int contador = 1;
        System.out.println("Ingrese el Límite");
        limite = entrada.nextInt(); 
        while (contador <= limite){
            
            if (contador%2!=0) { // la condicion indica que si contador MOD (%) 
                //2 ES DIFERENTE DE 0. SE ENTRA A LO QUE HAY EN EL CONDICIONAL 
                System.out.printf("Contador %d\n", 
                    contador);
            }
            
            contador = contador + 1;
        }
        
    }
}
