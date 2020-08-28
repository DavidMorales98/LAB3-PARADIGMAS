package javaapplication1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Archivo{
    public String nombre ;
    private String fechaA ;
    private String contenido ;
	
    public Archivo crearArchivo(Archivo a){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese nombre de archivo");
		a.nombre = in.nextLine();
		
		System.out.println("Ingrese el contenido");
		a.contenido = in.nextLine();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Date fecha = new Date();		
		a.fechaA=df.format(fecha);		
		return a;
	}
    public void setNombre(String nombre){
               this.nombre = nombre;
        }        
    public void setContenido(String contenido){
               this.contenido = contenido;
  		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Date fecha = new Date();		
		this.fechaA=df.format(fecha);             
        }
    @Override
    public String toString() {
        return "Archivo{" + "nombre=" + nombre + ", fechaA=" + fechaA + ", contenido=" + contenido + '}';
    }      
}
