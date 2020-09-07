/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author David
 */
public class Repositorios {
    //Atributos
    private String nombreRepo;
    private String autorRepo;
    private Workspace w;
    private Index i;
    private LocalRepository lr;
    private RemoteRepository rr;
    
    //Constructor
    public Repositorios(){};

    //Metodos
    //Getter and Setter
    /**
     * 
     * @return el workspace del repositorio
     */
    public Workspace getW(){    
        return w;
    }
    /**
     * 
     * @return el index del repositorio
     */
    public Index getI() {
        return i;
    }
    /**
     * 
     * @param w define el workspace del repositorio
     */
    public void setW(Workspace w) {
        this.w = w;
    }
    /**
     * 
     * @param i define el index del repositorio
     */
    public void setI(Index i) {
        this.i = i;
    }
    /**
     * 
     * @return el nombre del repositorio
     */
    public String getNombreRepo() {
        return nombreRepo;
    }
    /**
     * 
     * @param nombreRepo define el nombre del repositorio
     */
    public void setNombreRepo(String nombreRepo) {
        this.nombreRepo = nombreRepo;
    }
    /**
     * 
     * @return el autor del repositorio
     */
    public String getAutorRepo() {
        return autorRepo;
    }
    /**
     * 
     * @param autorRepo define el autor del repositorio
     */
    public void setAutorRepo(String autorRepo) {
        this.autorRepo = autorRepo;
    }
    /**
     * 
     * @return el local repositorio del repositorio
     */
    public LocalRepository getLr() {
        return lr;
    }
    /**
     * 
     * @param lr define el local repositorio del repositorio
     */
    public void setLr(LocalRepository lr) {
        this.lr = lr;
    }
    /**
     * 
     * @return el remote repositorio del repositorio
     */
    public RemoteRepository getRr() {
        return rr;
    }
    /**
     * 
     * @param rr define el remote repositorio del repositorio
     */
    public void setRr(RemoteRepository rr) {
        this.rr = rr;
    }

    //init
    /**
     * Metodo que inicializa un repositorio
     */
    public void init() {    
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el nombre de su repositorio: ");
        this.nombreRepo = in.nextLine();
        System.out.println("Ingrese el autor del repositorio: ");
        this.autorRepo = in.nextLine();
        
        w = new Workspace();
        i = new Index();
        lr = new LocalRepository();
        rr = new RemoteRepository();
    }
    
    //add
    /**
     * metodo que realiza un add al repositorio, pasa los archivos del workspace al index
     */
    public void add(){
        for (Archivo archivo: this.getW().getArchivos()){
            if (this.getI().contains(archivo)==false){
                this.getI().add(archivo);                
            }
        }
    }
    
    //commit
    /**
     * metodo que realiza un commit en el LR con los archivos del index, añadiendo fecha, nombre y autor
     */
    public void commit(){
        Commit c1 = new Commit();
        ArrayList<Archivo> archivosCommit = new ArrayList<Archivo>();    
        
        for (Archivo archivo: this.getI().getArchivos()){
            archivosCommit.add(archivo);                
        }
        c1.crearCommit(archivosCommit);
        this.getLr().add(c1);
        
        Index ni = new Index();
        this.setI(ni);
    }
    
    //push
    /**
     * 
     * @return true si el remote es igual al local repository, false en caso contrario
     */
    public boolean situacionRemote(){
        return this.getRr().getCommits().containsAll(this.getLr().getCommits());
    }
    /**
     * metodo que realiza un push, envia los commit del LR al RR solo cuando este ultimo no se encuentre al dia 
     */
    public void push(){
        if (this.situacionRemote() == false){
            for(Commit commit:this.getLr().getCommits()){     
                if (this.getRr().getCommits().contains(commit) == false){
                    this.getRr().getCommits().add(commit);
                }    
            }
        }   
    }
    
    //pull
    /**
     * metodo que manda los archivos de los commit del RR al workspace
     */
    public void pull(){
        for(Commit commit: this.getRr().getCommits()){
            for(Archivo archivo: commit.getArchivos()){
                if(this.getW().getArchivos().contains(archivo) == false){
                    this.getW().getArchivos().add(archivo);
                }
            }
        }
    }    
    //status
    /**
     * 
     * @return un string con el status del repositorio, primero es hecho un string para luego ser impreso en pantalla
     */
    public String determinarStatus(){
        return "Repositorio{Nombre Repositorio: " + this.getNombreRepo() + ", autorRepositorio: " + this.getAutorRepo()+ "}\n Archivos en Workspace:" + (w.size()+"") + "\n Archivos en Index:" + (i.size()+"") + "\n Commits en Local Repository:" + (lr.size()+"") + "\n Se encuentra actualizado el Remote Repository?: ";
    }
    public void status(){
        System.out.println(this.determinarStatus() + situacionRemote() + "\n");

    }
    
    //agregarArchivo 
    /**
     * metodo que agrega un archivo a previamente creado al workspace
     * @param a archivo que sera añadido al workspace
     */
    public void agregarArchivo(Archivo a){
        Workspace nw = this.getW();
        nw.add(a);
        this.setW(nw);
    }
    
    //toString
    /**
     * 
     * @return un string del repositorio en el cual se pueden ver sus atributos 
     */
    @Override
    public String toString() {
        return "Repositorios{\n" + "w=" + w + ",\ni=" + i + ",\nlr=" + lr + ",\n rr=" + rr + "}\n";
    }
}
