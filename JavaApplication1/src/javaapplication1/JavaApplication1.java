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
        b.crearArchivo("B","aaa");       
        Archivo c = new Archivo();
        c.crearArchivo("C","aaaa");  
        
        git.agregarArchivo(a);
        git.agregarArchivo(b);
        git.add();
        git.commit();
        git.agregarArchivo(c);
        git.add();      
        git.commit();
        git.push();
        System.out.print(git);
        
        Workspace nw = new Workspace();
        git.setW(nw);
        System.out.print(git);
        
        git.pull();
        System.out.print(git);        
    }    
}


