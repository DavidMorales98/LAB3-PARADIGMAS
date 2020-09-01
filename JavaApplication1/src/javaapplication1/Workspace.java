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
    int nArchivos;
    public Archivo archivosWorkspace[] = new Archivo[nArchivos];
    
    public boolean añadirArchivo( Archivo a){
        for (int i = 0; i < archivosWorkspace.length; i++){
            if (archivosWorkspace[i] == null){
                archivosWorkspace[i] = a;
                return true;
            }
        }
        return false;
    }
}
