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
public class Repositorio {
    public ArrayList[] repositorio = new ArrayList[4]; 
    
    public void imprimir(){
        for (int j = 0; j < repositorio.length; j++){
            System.out.println(repositorio[j]);
        }
    } 
}
