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
        git.init("David","LAB");
        Archivo a = new Archivo();
        a.crearArchivo("A","aa");      
        Archivo b = new Archivo();
        b.crearArchivo("A","aaa");       
        Archivo c = new Archivo();
        c.crearArchivo("AA","aaa");       
        git.agregarArchivo(a);
        git.agregarArchivo(b);
        git.agregarArchivo(c); 
        git.add();
        
        System.out.print(git.getI());
        git.commit();
        System.out.print(git);        
    }    
}


