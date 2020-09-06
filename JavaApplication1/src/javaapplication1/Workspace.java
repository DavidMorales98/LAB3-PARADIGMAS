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
    //Setter and Getter
    public void setWorkspace(ArrayList<Archivo> workspace) {
        this.workspace = workspace;
    }
    public ArrayList<Archivo> getArchivos(){    
        return workspace;
    }
    //add
    public void add(Archivo a) {
        workspace.add(a);
    }
    //size
    public int size(){
        return workspace.size();
    }
    //contains
    public boolean contains(Archivo a){
        return workspace.contains(a);
    }
    //toString
    @Override
    public String toString() {
        return "Workspace{" + "workspace=" + workspace + "}\n";
    }
    
    

}

