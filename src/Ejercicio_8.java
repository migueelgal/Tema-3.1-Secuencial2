
import java.util.Scanner;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author miguel.galera
 */
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     int numero;
     int cociente;
     int resto;
    
     //Al dividir cualquier numero sobre 10, el resto te da las unidades y el cociente te da las decenas
     
     Scanner teclado = new Scanner (System.in);
     
     System.out.print( "Introduce un número: " );
     numero=teclado.nextInt();
     
     cociente=numero/10;
     resto=numero%10;
     
    
     
     System.out.println( "El numero invertido es: "+resto+cociente);
     
     
     
     
     
     
     
     
     
   
    }
    
}
