/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;
/**
 *
 * @author David
 */
public class Commit {
    //Atributos
    private String autor;
    private String fechaC;
    private String mensaje;
    private ArrayList<Archivo> archivosCommit;
    
    //Constructor
    public void crearCommit(ArrayList<Archivo> archivos){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el autor:");
        this.autor = in.nextLine();
        
        System.out.println("Ingrese un mensaje:");
        this.mensaje = in.nextLine();
        
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	Date fecha = new Date();		
	this.fechaC=df.format(fecha);
        
        this.archivosCommit = archivos;
                
    }   
    //Metodos
    //Getter and Setter
    /**
     * 
     * @return el autor del commit
     */
    public String getAutor() {
        return autor;
    }
    /**
     * 
     * @param autor cambiar el autor del commit
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
    /**
     * 
     * @return obtener la fecha del commit
     */
    public String getFechaC() {
        return fechaC;
    }
    /**
     * 
     * @param fechaC cambiar la fecha del commit
     */
    public void setFechaC(String fechaC) {
        this.fechaC = fechaC;
    }
    /**
     * 
     * @return obtener el mensaje del commit
     */
    public String getMensaje() {
        return mensaje;
    }
    /**
     * 
     * @param mensaje define el mensaje que tendra el commit
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    /**
     * 
     * @return una lista de archivos que tiene el commit
     */
    public ArrayList<Archivo> getArchivos() {
        return archivosCommit;
    }
    /**
     * 
     * @param archivos define la lista de archivos que tendra el commit
     */
    public void setArchivos(ArrayList<Archivo> archivos) {
        this.archivosCommit = archivos;
    }
    /**
     * 
     * @param o un objeto que se comparara con otro
     * @return true si son iguales false en caso contrario
     */
    public boolean equals(Object o) {
        if (o == null) return false;        
        Commit c =(Commit)o;
        return (mensaje.equalsIgnoreCase(c.mensaje));
    }
    //toString
    /**
     * 
     * @return un string el cual puede imprimir un commit identificando claramente sus atributos
     */
    @Override
    public String toString(){
        return "Commit{" + "fechaC=" + fechaC + ", autor=" + autor + ", mensaje= " + mensaje + ", archivos=" + archivosCommit + "}\n";
    }    
}
