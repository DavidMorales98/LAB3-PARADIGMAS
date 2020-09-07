/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author David
 */
public class LAB3main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        boolean menuSimulador = true;
        boolean repositorioInicializado = false;
        Repositorios git = new Repositorios();
        Scanner in = new Scanner(System.in);
        while (repositorioInicializado == false){
            System.out.println("Desea inicializar su repositorio?(1.-Si/2.-No)");
        
            int resp = in.nextInt();
            if (resp == 1){
                git.init();    
                repositorioInicializado = true;
                menuSimulador = true;
            }
            while (menuSimulador == true){
                System.out.println("### SIMULACION DE GIT ###");
                System.out.println("Escoja su opcion:");
                System.out.println("1. add");
                System.out.println("2. commit");
                System.out.println("3. push");
                System.out.println("4. pull");
                System.out.println("5. status");
                System.out.println("6. Crear nuevo archivo");
                System.out.println("7. Salir");
                System.out.println("INTRODUZCA SU OPCION");    
            
                int opcion = in.nextInt();
                if (repositorioInicializado == true){
                    if (opcion == 1){
                            git.add();
                    }
                    else if (opcion == 2){
                            git.commit();
                    }
                    else if (opcion == 3){
                            git.push();
                    }
                    else if (opcion == 4){
                            git.pull();
                    }
                    else if (opcion == 5){
                            git.status();
                    }
                    else if (opcion == 6){
                            Archivo a = new Archivo();
                            a.crearArchivo();
                            git.agregarArchivo(a);
                                
                    }
                    else if (opcion == 7){
                        System.out.println("Adios, hasta pronto.");
                        break;
                                
                    }
                    else{
                            System.out.println("El valor no es valido.");
                    }
                }
                else{
                    System.out.println("Para realizar esta accion debe inicializar un nuevo repositorio.");
                    menuSimulador = false;
                }
            }
        }
    }    
}


