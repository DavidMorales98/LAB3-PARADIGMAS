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
public class LocalRepository {
    public Commit commitLocalRepository[];
    
    public LocalRepository(int n){
        commitLocalRepository = new Commit[n];
    }
    public boolean añadirCommit( Commit c){
        for (int i = 0; i < commitLocalRepository.length; i++){
            if (commitLocalRepository[i] == null){
                commitLocalRepository[i] = c;
                return true;
            }
        }
        return false;
    }
    
    public void imprimir(){
        for (int j = 0; j < commitLocalRepository.length; j++){
            System.out.println(commitLocalRepository[j]);
        }
    }    
}
