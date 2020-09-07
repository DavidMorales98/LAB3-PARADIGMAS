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
public class RemoteRepository {
    //Atributos
    private ArrayList<Commit> remoteRepo = new ArrayList<Commit>();   
    
    //Constructor 
    public RemoteRepository(){}  
    
    //Metodos
    //Getter and Setter
    /**
     * 
     * @return la lista de commit del RR
     */
    public ArrayList<Commit> getCommits() {
        return remoteRepo;
    }
    /**
     * 
     * @param remoteRepo corresponde a una lista de commit
     */
    public void setRemoteRepo(ArrayList<Commit> remoteRepo) {
        this.remoteRepo = remoteRepo;
    }
    //add
    /**
     * 
     * @param c es un commit que se añadira a RR
     */
    public void add(Commit c) {
        remoteRepo.add(c);
    }
    //contains
    /**
     * 
     * @param c es un commit que se verificara si existe en el RR
     * @return true si se encuentra false en caso contrario
     */
    public boolean contains(Commit c){
        return remoteRepo.contains(c);
    }  
    @Override
    /**
     * @return un string que permite ver el contenido del RR
     */
    public String toString() {
        return "RemoteRepository{" + "RemoteRepository=" + remoteRepo + "}\n";
    }
}
