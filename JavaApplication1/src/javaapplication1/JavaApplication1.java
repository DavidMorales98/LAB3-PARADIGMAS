/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author David
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Repositorios git = new Repositorios();
        git.init();
        System.out.println(git);
        
        Archivo a = new Archivo();
        a.crearArchivo("A","aa");
        git.agregarArchivo(a);
        System.out.println(git);
    }    
}


