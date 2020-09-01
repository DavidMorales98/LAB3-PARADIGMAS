/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author David
 */
public class Index {
    public Archivo archivosIndex[];
    
    public Index(int n){
        archivosIndex = new Archivo[n];
    }
    public boolean añadirArchivo( Archivo a){
        for (int i = 0; i < archivosIndex.length; i++){
            if (archivosIndex[i] == null){
                archivosIndex[i] = a;
                return true;
            }
        }
        return false;
    }
    
    public void imprimir(){
        for (int j = 0; j < archivosIndex.length; j++){
            System.out.println(archivosIndex[j]);
        }
    }    
}
