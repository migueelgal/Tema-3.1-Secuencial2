
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author miguel.galera
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner (System.in);
        
        double calfinal;
        double calparcial1, calparcial2, calparcial3;
        double notaparciales;
        double calexamenfinal;
        double caltrabajofinal;
        
        System.out.print("Calificación del primer parcial: ");
        calparcial1=teclado.nextDouble();
        System.out.print("Calificación del segundo parcial: ");
        calparcial2=teclado.nextDouble();
        System.out.print("Calificación del tercer parcial: ");
        calparcial3=teclado.nextDouble();
        
        System.out.print("Calificación del examen final: ");
        calexamenfinal=teclado.nextDouble();
        
        System.out.print("Calificación del trabajo final: ");
        caltrabajofinal=teclado.nextDouble();
        
        notaparciales = ((calparcial1+calparcial2+calparcial3)/3)*55/100;
        
        calfinal= notaparciales+calexamenfinal*30/100+caltrabajofinal*15/100;
        
        System.out.println("La nota final es: "+calfinal);
        
        
        //NOTA REDONDEADA
        long notaRedondeada=Math.round(calfinal);
        System.out.println("Nota redondeada: "+notaRedondeada);
        
        
        
        
        
    }
    
}
