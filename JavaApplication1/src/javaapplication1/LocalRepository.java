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
public class LocalRepository {
    //Atributos
    private ArrayList<Commit> localRepo = new ArrayList<Commit>();
    
    //Constructor 
    public LocalRepository(){}
    
    //Metodos
    //Getter and Setter
    /**
     * 
     * @param localRepo corresponde a una lista de commit
     */
    public void setLocalRepo(ArrayList<Commit> localRepo) {
        this.localRepo = localRepo;
    }
    /**
     * 
     * @return lista de commits del index
     */
    public ArrayList<Commit> getCommits(){    
        return localRepo;
    }
    //add
    /**
     * 
     * @param c commit que se añadira el LR
     */
    public void add(Commit c) {
        localRepo.add(c);
    }
    //size
    /**
     * 
     * @return la cantidad de commits presentes en el LR
     */
    public int size(){
        return localRepo.size();
    }
    //contains
    /**
     * 
     * @param c un commit que se verifica si existe en el LR
     * @return true si existe false en caso contrario
     */
    public boolean contains(Commit c){
        return localRepo.contains(c);
    }
    /**
     * 
     * @return un string que permite imprimir el LR
     */
    @Override
    public String toString() {
        return "LocalRepository{" + "LocalRepository=" + localRepo + "}\n";
    }    
}
