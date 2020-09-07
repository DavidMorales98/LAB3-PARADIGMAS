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
public class LocalRepository {
    //Atributos
    public ArrayList<Commit> localRepo = new ArrayList<Commit>();
    
    //Constructor 
    public LocalRepository(){}
    
    //Metodos
    //Getter and Setter
    public void setLocalRepo(ArrayList<Commit> localRepo) {
        this.localRepo = localRepo;
    }
    public ArrayList<Commit> getCommits(){    
        return localRepo;
    }
    //add
    public void add(Commit c) {
        localRepo.add(c);
    }
    //size
    public int size(){
        return localRepo.size();
    }    
    @Override
    public String toString() {
        return "LocalRepository{" + "LocalRepository=" + localRepo + "}\n";
    }    
}
