/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
/**
 *
 * @author David
 */
public class Workspace {
    //Atributos
    private ArrayList<Archivo> workspace = new ArrayList<Archivo>();
    
    //Constructor 
    public Workspace(){}

    //Metodos
    //Setter and Getter
    /**
     * 
     * @param workspace El parametro workspace corresponda a una lista de archivos 
     */
    public void setWorkspace(ArrayList<Archivo> workspace) {
        this.workspace = workspace;
    }
    /**
     * 
     * @return Lista de archivos del Workspace
     */
    public ArrayList<Archivo> getArchivos(){    
        return workspace;
    }
    //add
    /**
     * 
     * @param a El parametro a corresponde a un archivo que se añadira al workspace
     */
    public void add(Archivo a) {
        workspace.add(a);
    }
    //size
    /**
     * 
     * @return cuantos archivos tiene el workspace
     */
    public int size(){
        return workspace.size();
    }
    //contains
    /**
     * 
     * @param a El parametro a corresponde a un archivo que se buscara en el Workspace
     * @return Corresponde a true si a se encuentra o false en caso contrario
     */
    public boolean contains(Archivo a){
        return workspace.contains(a);
    }
    //toString
    /**
     * 
     * @return Corresponde a un string para poder imprimir el workspace
     */
    @Override
    public String toString() {
        return "Workspace{" + "workspace=" + workspace + "}\n";
    }
    
    

}

