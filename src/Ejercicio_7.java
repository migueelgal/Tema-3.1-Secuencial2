
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author miguel.galera
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner (System.in);
        
        int A;
        int B;
        int aux;
    
        
        System.out.print("Defina el valor de A: ");
        A=teclado.nextInt();
        
        System.out.print("Defina el valor de  B: ");
        B=teclado.nextInt();
        
        aux=A;
        A=B;
        B=aux;
        
        System.out.println("El valor de A es = " +B);
        System.out.println("El valor de B es = " +A);
        
        
        
    }
    
}
