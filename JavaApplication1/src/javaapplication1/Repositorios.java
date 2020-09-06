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
    public String nombreRepo;
    public String autorRepo;
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

    public String getNombreRepo() {
        return nombreRepo;
    }

    public void setNombreRepo(String nombreRepo) {
        this.nombreRepo = nombreRepo;
    }

    public String getAutorRepo() {
        return autorRepo;
    }

    public void setAutorRepo(String autorRepo) {
        this.autorRepo = autorRepo;
    }

    //init
    public void init() {
        w = new Workspace();
        i = new Index();
    }
    
    //status
    public String status(){
        return "Repositorio{Nombre Repositorio: " + this.getNombreRepo() + ", autorRepositorio: " + this.getAutorRepo()+ "}\n Archivos en Workspace:" + (w.size()+"") + "\n Archivos en Index:" + (i.size()+"");
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
