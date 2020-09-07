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
public class Index {
    //Atributos
    private ArrayList<Archivo> index = new ArrayList<Archivo>();
    
    //Constructor
    public Index(){}
    
    //Metodos
    //Getter and Setter
    /**
     * 
     * @param index corresponde a una lista de archivos
     */
    public void setIndex(ArrayList<Archivo> index) {
        this.index = index;
    }
    /**
     * 
     * @return Lista de archivos del index
     */
    public ArrayList<Archivo> getArchivos(){    
        return index;
    }
    //add
    /**
     * 
     * @param a corresponde a un archivo que se añadira al index
     */
    public void add(Archivo a){
        index.add(a);
    }
    //size
    /**
     * 
     * @return la cantidad de archivos que tiene el index
     */
    public int size(){
        return index.size();
    }
    //contains
    /**
     * 
     * @param a corresponde a un archivo que se verificara si existe en el index
     * @return true en caso de que exista y false en caso contrario
     */
    public boolean contains(Archivo a){
        return index.contains(a);
    }
    //toString
    /**
     * 
     * @return un string el cual muestra los archivos que se encuentran en el index
     */
    @Override
    public String toString() {
        return "Index{" + "index=" + index + "}\n";
    }
}
