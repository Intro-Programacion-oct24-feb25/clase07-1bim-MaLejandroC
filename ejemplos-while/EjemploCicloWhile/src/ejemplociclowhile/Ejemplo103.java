/*
 Generar una solución que permita ingresar y presentar por teclado las operaciones básicas de suma, resta, multiplicación.
El usuario ingresará por teclado el número de la tabla a generar, el límite de la tabla.

Ejemplo:

Si el usuario ingresa el número de tabla: 4
Si el usuario ingresa el límite de tabla: 5

El programa debe presentar:

Tabla de sumar

4 + 1 = 5
4 + 2 = 6
4 + 3 = 7
4 + 4 = 8
4 + 5 = 9

Tabla de restar

4 - 1 = 3
4 - 2 = 2
4 - 3 = 1
4 - 4 = 0
4 - 5 = -1

Tabla de multiplicar

4 * 1 = 4
4 * 2 = 8
4 * 3 = 12
4 * 4 = 16
4 * 5 = 20
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo103 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite_tabla;
        int contador = 1;
        int operacion;
        int resta;
        int suma;
        int tabla;
        String titulo = "";
        String mostrar= "";
        String realizar;
        String cadenam = "";
        String cadenar = "";
        String cadenas = "";
        
        
        System.out.println("Ingrese el número de tabla a generar: ");
        tabla = entrada.nextInt();
       
        System.out.println("Ingrese el limite de tabla a generar: ");
        limite_tabla = entrada.nextInt();
        
        entrada.nextLine();
        
        System.out.printf("Ingrese la operacion de la tabla a generar \nTipo 1: +\nTipo 2: -\nTipo 3: *\n");
        realizar = entrada.nextLine();
        
        realizar=realizar.toLowerCase();

        
        while (contador <= limite_tabla){
            resta = tabla - contador;
            operacion = tabla * contador;
            suma = tabla + contador;
            
            cadenam = String.format("%s%d*%d = %d\n", 
                    cadenam,
                    tabla, 
                    contador,
                    operacion);
            cadenas = String.format("%s%d+%d = %d\n", 
                    cadenas,
                    tabla, 
                    contador,
                    suma);
            cadenar = String.format("%s%d-%d = %d\n", 
                    cadenar,
                    tabla, 
                    contador,
                    resta);
            contador = contador + 1;
        }
                
            switch (realizar) {
                case "+":
                case "suma":
                case "1":
                    titulo = String.format("Tabla de sumar del %s",tabla);
                    mostrar=cadenas;
                    break;
                case "-":
                case "resta":
                case "2":
                    titulo = String.format("Tabla de restar del %s", tabla);
                    mostrar=cadenar;
                    break;
                case "*":
                case "multiplicacion":
                case "3":
                    titulo = String.format("Tabla de multiplicar del %s", tabla);
                    mostrar=cadenam;
                    break;
                default:
                    titulo = String.format("Operador: %s",realizar);
                    mostrar="NO DISPONIBLE";
            }
                
           
                
        System.out.printf("\n%s\n%s\n",titulo,mostrar);
        
    }
}
