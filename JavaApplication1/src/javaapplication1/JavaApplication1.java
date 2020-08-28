/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        System.out.println("##SIMULACIÓN DE GIT##");
        System.out.println("Escoja su opción:");
        System.out.println("1. add");
        System.out.println("2. commit");
        System.out.println("3. pull");
        System.out.println("4. push");
        System.out.println("5. status");
        System.out.println("6. Crear nuevo archivo");
        System.out.println("INTRODUZCA SU OPCIÓN");
        Archivo a = new Archivo();
        a.crearArchivo(a);
        System.out.println(a);
        a.setContenido("pana miguel");
        System.out.println(a);
    }
    
}
