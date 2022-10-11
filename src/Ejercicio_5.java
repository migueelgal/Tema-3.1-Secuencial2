
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author miguel.galera
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        
        double venta1= 300, venta2= 400, venta3=1500;
        double comision;
        double total;
        int sueldobase = 1000;

        System.out.println("Dime la primera venta: ");
        venta1=teclado.nextDouble();
        System.out.println("Dime la segunda venta: ");
        venta2=teclado.nextDouble();
        System.out.println("Dime la tercera venta: ");
        venta3=teclado.nextDouble();
        
        comision= (venta1*10/100)+(venta2*10/100)+(venta3*10/100);
        System.out.println("El total de las comisiones es de " +comision+ "euros");
        System.out.printf("El total de las comisiones es: %.1f euros.\n:",comision);
        
        total= comision+sueldobase;
        System.out.print("El total de su sueldo es " +total+ "euros");
    }
    
    
   
            
    
            
    
    
    
    
    
    
    
}
