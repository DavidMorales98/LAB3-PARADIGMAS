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
        
        Commit c1 = new Commit();
        ArrayList<Archivo> archivosCommit = new ArrayList<Archivo>();    
        
        for (Archivo archivo: git.getI().getArchivos()){
            archivosCommit.add(archivo);                
        }
        c1.crearCommit("David", "commit", archivosCommit);
        System.out.println(c1);
        git.getLr().add(c1);
        System.out.print(git.getLr());        
    }    
}


