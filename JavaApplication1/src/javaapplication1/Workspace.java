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
    //Atributos
    public ArrayList<Archivo> workspace = new ArrayList<Archivo>();
    
    //Constructor 
    public Workspace(){}
    
    //Metodos
    public void add(Archivo a){
        workspace.add(a);
    }
    //toString
    @Override
    public String toString() {
        return "Workspace{" + "workspace=" + workspace + '}';
    }
    
    

}

