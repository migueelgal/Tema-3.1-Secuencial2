
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author miguel.galera
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        double gradosF, gradosC;
                
        System.out.print("Dime la temperatura en grados fahrenheit");
        
        gradosF=entrada.nextDouble();
        
        gradosC=(gradosF-32)*5/9;
       
       System.out.println(gradosF+ "Fahrenheit son "+gradosC+" Celsius");
       
    }
    
}
