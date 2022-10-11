
import java.util.Scanner;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author miguel.galera
 */
public class Ejerecicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double numero1 = 3, numero2 = 5, numero3 = 7, promedio;
        String numero;
        
        System.out.println("Numero 1: ");
        numero1=teclado.nextDouble();
        
        System.out.println("Numero 2: ");
        numero1=teclado.nextDouble();
        
        System.out.println("Numero 3: ");
        numero1=teclado.nextDouble();
        
        promedio=(numero1+numero2+numero3)/3;
        System.out.println("El promedio final es = ");
                
        

    }
    
}
