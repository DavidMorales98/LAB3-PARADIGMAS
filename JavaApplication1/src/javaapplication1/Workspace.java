/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.ArrayList;
/**
 *
 * @author David
 */
public class Workspace {
    public Archivo archivosWorkspace[];
    
    public Workspace(int n){
        archivosWorkspace = new Archivo[n];
    }
    public boolean añadirArchivo( Archivo a){
        for (int i = 0; i < archivosWorkspace.length; i++){
            if (archivosWorkspace[i] == null){
                archivosWorkspace[i] = a;
                return true;
            }
        }
        return false;
    }
    public void imprimirWorkspace(){
        for (int j = 0; j < archivosWorkspace.length; j++){
            System.out.println(archivosWorkspace[j]);
        }
    }
}

