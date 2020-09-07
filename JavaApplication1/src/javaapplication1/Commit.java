/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

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
    public String autor;
    public String fechaC;
    public String mensaje;
    public ArrayList<Archivo> archivosCommit;
    
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
    public void crearCommit(String autor, String mensaje,ArrayList<Archivo> archivos){
        this.autor = autor;
        this.mensaje = mensaje;
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	Date fecha = new Date();		
	this.fechaC=df.format(fecha);
        this.archivosCommit = archivos;
    }
    
    //Metodos
    //Getter and Setter
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFechaC() {
        return fechaC;
    }

    public void setFechaC(String fechaC) {
        this.fechaC = fechaC;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public ArrayList<Archivo> getArchivos() {
        return archivosCommit;
    }

    public void setArchivos(ArrayList<Archivo> archivos) {
        this.archivosCommit = archivos;
    }
    public boolean equals(Object o) {
        if (o == null) return false;        
        Commit c =(Commit)o;
        return (mensaje.equalsIgnoreCase(c.mensaje));
    }
    
    @Override
    public String toString(){
        return "Commit{" + "fechaC=" + fechaC + ", autor=" + autor + ", mensaje= " + mensaje + ", archivos=" + archivosCommit + "}\n";
    }    
}
