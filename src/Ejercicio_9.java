
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author miguel.galera
 */
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            Scanner teclado = new Scanner (System.in);
        
            String nombre;
            String apellido1;
            String apellido2;
                    
            
            
            
        System.out.print( "Introduce un nombre: " );
        nombre=teclado.nextLine();
        System.out.print( "Introduce un primer apellido: " );
        apellido1=teclado.nextLine();
        System.out.print( "Introduce un segundo apellido: " );
        apellido2=teclado.nextLine();
        
        
        char inicial01=nombre.charAt(0);
        char inicial02=apellido1.charAt(0);
        char inicial03=apellido2.charAt(0);
        
        System.out.print( "Las iniciales del nombre son: "+inicial01+inicial02+inicial03);
        apellido2=teclado.nextLine();
        
   
    }
    
}
