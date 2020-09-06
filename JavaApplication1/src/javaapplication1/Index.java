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
public class Index {
    //Atributos
    public ArrayList<Archivo> index = new ArrayList<Archivo>();
    
    //Constructor
    public Index(){}
    
    //Metodos
    //add
    public void add(Archivo a){
        index.add(a);
    }
    //size
    public int size(){
        return index.size();
    }
    //contains
    public boolean contains(Archivo a){
        return index.contains(a);
    }
    //toString
    @Override
    public String toString() {
        return "Index{" + "index=" + index + "}\n";
    }
}
