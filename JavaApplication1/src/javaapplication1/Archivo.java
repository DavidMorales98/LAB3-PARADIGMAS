package javaapplication1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
import java.util.Objects;

public class Archivo{
    //Atributos
    public String nombre ;
    public String fechaA ;
    public String contenido ;
	
    //Constructor.
    public void crearArchivo(){
	Scanner in = new Scanner(System.in);
		
	System.out.println("Ingrese nombre de archivo:");
	this.nombre = in.nextLine();
		
	System.out.println("Ingrese el contenido:");
	this.contenido = in.nextLine();
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	Date fecha = new Date();		
	this.fechaA=df.format(fecha);		
    }   
    public void crearArchivo(String nombre, String contenido){
        this.nombre=nombre;
        this.contenido = contenido;
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	Date fecha = new Date();		
	this.fechaA=df.format(fecha);	        
    } 
    
    //Metodos
    //Setter and Getter
    public void setNombre(String nombre){
               this.nombre = nombre;
        }
    
    public void setContenido(String contenido){
               this.contenido = contenido;
  		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Date fecha = new Date();		
		this.fechaA=df.format(fecha);             
        }
       
    public String getNombre() {
        return nombre;
    }

    public String getFechaA() {
        return fechaA;
    }

    public String getContenido() {
        return contenido;
    }    
    

    public boolean equals(Archivo obj) {
        if (obj == null) {
            return false;
        }
        Archivo a =(Archivo)obj;
        return (nombre.equalsIgnoreCase(a.nombre));
    }
    
    //toString
    @Override    
    public String toString() {
        return "Archivo{" + "nombre=" + nombre + ", fechaA=" + fechaA + ", contenido=" + contenido + '}';
    }   
}
