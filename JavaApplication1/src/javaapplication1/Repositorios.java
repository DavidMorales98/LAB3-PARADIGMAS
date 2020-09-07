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
    public LocalRepository lr;
    public RemoteRepository rr;
    public boolean sR;
    
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

    public LocalRepository getLr() {
        return lr;
    }

    public void setLr(LocalRepository lr) {
        this.lr = lr;
    }

    public RemoteRepository getRr() {
        return rr;
    }

    public void setRr(RemoteRepository rr) {
        this.rr = rr;
    }

    //init
    public void init() {        
        w = new Workspace();
        i = new Index();
        lr = new LocalRepository();
        rr = new RemoteRepository();
    }
    public void init(String nombreRepo, String autorRepo) {
        this.nombreRepo = nombreRepo;
        this.autorRepo = autorRepo;
        w = new Workspace();
        i = new Index();
        lr = new LocalRepository();
        rr = new RemoteRepository();
    }
    //add
    public void add(){
        for (Archivo archivo: this.getW().getArchivos()){
            if (this.getI().contains(archivo)==false){
                this.getI().add(archivo);                
            }
        }
    }
    //commit
    public void commit(){
        Commit c1 = new Commit();
        ArrayList<Archivo> archivosCommit = new ArrayList<Archivo>();    
        
        for (Archivo archivo: this.getI().getArchivos()){
            archivosCommit.add(archivo);                
        }
        c1.crearCommit("David","MiCommit",archivosCommit);
        this.getLr().add(c1);
        
        Index ni = new Index();
        this.setI(ni);
    }
    
    //status
    public boolean situacionRemote(){
        return this.getRr().getCommits().containsAll(this.getLr().getCommits());
    }
    public String determinarStatus(){
        return "Repositorio{Nombre Repositorio: " + this.getNombreRepo() + ", autorRepositorio: " + this.getAutorRepo()+ "}\n Archivos en Workspace:" + (w.size()+"") + "\n Archivos en Index:" + (i.size()+"") + "\n Commits en Local Repository:" + (lr.size()+"") + "\n ¿Se encuentra actualizado el Remote Repository?: ";
    }
    public void status(){
        System.out.println(this.determinarStatus() + situacionRemote() + "\n");

    }
    //agregarArchivo 
    public void agregarArchivo(Archivo a){
        Workspace nw = this.getW();
        nw.add(a);
        this.setW(nw);
    }
    //toString
    @Override
    public String toString() {
        return "Repositorios{\n" + "w=" + w + ",\ni=" + i + ",\nlr=" + lr + ",\n rr=" + rr + "}\n";
    }
}
