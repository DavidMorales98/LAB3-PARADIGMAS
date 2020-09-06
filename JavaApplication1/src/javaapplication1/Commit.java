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
/**
 *
 * @author David
 */
public class Commit {
    //Atributos
    public String autor;
    public String fechaC;
    public String mensaje;
    public Archivo archivos[];
    
    //Constructor
    public void crearCommit(){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el autor:");
        this.autor = in.nextLine();
        
        System.out.println("Ingrese un mensaje:");
        this.mensaje = in.nextLine();
        
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	Date fecha = new Date();		
	this.fechaC=df.format(fecha);
    }
    public void crearCommit(String autor, String mensaje){
        this.autor = autor;
        this.mensaje = mensaje;
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	Date fecha = new Date();		
	this.fechaC=df.format(fecha);
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

    public Archivo[] getArchivos() {
        return archivos;
    }

    public void setArchivos(Archivo[] archivos) {
        this.archivos = archivos;
    }
    
    
    @Override
    public String toString(){
        return "Commit{" + "fechaC=" + fechaC + ", autor=" + autor + ", mensaje=" + mensaje + "archivos=" + archivos + "}";
    }    
}
