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
        boolean menuSimulador = true;
        boolean repositorioInicializado = false;
        while (menuSimulador == true){
            System.out.println("### SIMULACIÓN DE GIT ###");
            System.out.println("Escoja su opción:");
            System.out.println("1. add");
            System.out.println("2. commit");
            System.out.println("3. pull");
            System.out.println("4. push");
            System.out.println("5. status");
            System.out.println("6. Crear nuevo archivo");
            System.out.println("INTRODUZCA SU OPCIÓN");
            
            Scanner in = new Scanner(System.in);
            int opcion = in.nextInt();
            if (repositorioInicializado == true){
                if (opcion == 1){
                        System.out.println("gitAdd");
                }
                else if (opcion == 2){
                        System.out.println("gitCommit");
                }
                else if (opcion == 3){
                        System.out.println("gitPush");
                }
                else if (opcion == 4){
                        System.out.println("gitPull");
                }
                else if (opcion == 5){
                        System.out.println("gitStatus");
                }
                else if (opcion == 6){
                        Archivo a = new Archivo();
                        a.crearArchivo(a);
                        System.out.println(a);
                }
                else{
                        System.out.println("El valor no es válido.");
                }
            }
            else{
                System.out.println("Para realizar esta accion debe inicializar un nuevo repositorio.");
            }
        }
    }
}

