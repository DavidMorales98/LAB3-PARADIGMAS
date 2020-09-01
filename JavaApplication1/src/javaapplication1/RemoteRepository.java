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
public class RemoteRepository {
    public Commit commitRemoteRepository[];
    
    public RemoteRepository(int n){
        commitRemoteRepository = new Commit[n];
    }
    public boolean añadirCommit( Commit c){
        for (int i = 0; i < commitRemoteRepository.length; i++){
            if (commitRemoteRepository[i] == null){
                commitRemoteRepository[i] = c;
                return true;
            }
        }
        return false;
    }
    
    public void imprimir(){
        for (int j = 0; j < commitRemoteRepository.length; j++){
            System.out.println(commitRemoteRepository[j]);
        }
    }    
}
