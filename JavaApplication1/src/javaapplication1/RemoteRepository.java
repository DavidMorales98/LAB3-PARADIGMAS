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
public class RemoteRepository {
    //Atributos
    public ArrayList<Commit> remoteRepo = new ArrayList<Commit>();   
    
    //Constructor 
    public RemoteRepository(){}  
    
    //Metodos
    //Getter and Setter
    public ArrayList<Commit> getCommits() {
        return remoteRepo;
    }
    public void setRemoteRepo(ArrayList<Commit> remoteRepo) {
        this.remoteRepo = remoteRepo;
    }
    //add
    public void add(Commit c) {
        remoteRepo.add(c);
    }
    //size
    public int size(){
        return remoteRepo.size();
    }

    @Override
    public String toString() {
        return "RemoteRepository{" + "remoteRepo=" + remoteRepo + "}\n";
    }
}
