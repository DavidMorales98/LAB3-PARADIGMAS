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
public class Repositorios {
    //Atributos
    public Workspace w;
    public Index i;
    
    //Constructor
    public Repositorios(){};

    //Metodos
    //Getter and Setter
    public Workspace getW(){    
        return w;
    }
    
    public Index getI() {
        return i;
    }

    public void setW(Workspace w) {
        this.w = w;
    }

    public void setI(Index i) {
        this.i = i;
    }

    //init
    public void init() {
        w = new Workspace();
        i = new Index();
    }
    
    //agregarArchivo 
    public void agregarArchivo(Archivo a){
        Workspace nw = this.getW();
        nw.add(a);
        this.setW(nw);
    }
    
    @Override
    public String toString() {
        return "Repositorios{" + "w=" + w + ", i=" + i + '}';
    }
    

}
