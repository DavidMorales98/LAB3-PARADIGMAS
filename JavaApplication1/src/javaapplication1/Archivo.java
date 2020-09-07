
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Archivo{
    //Atributos
    private String nombre ;
    private String fechaA ;
    private String contenido ;
	
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
    
    //Metodos
    //Setter and Getter
    /**
     * 
     * @param nombre corresponde al nombre del archivo
     */
    public void setNombre(String nombre){
               this.nombre = nombre;
        }
    
    /**
     * 
     * @param contenido corresponde al contenido del archivo
     */
    public void setContenido(String contenido){
               this.contenido = contenido;
  		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Date fecha = new Date();		
		this.fechaA=df.format(fecha);             
        }
    
    /**
     * 
     * @return un string del nombre del archivo
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @return un string de la fecha de cuando fue creado el archivo
     */
    public String getFechaA() {
        return fechaA;
    }
    /**
     * 
     * @return un string del contenido del archivo
     */
    public String getContenido() {
        return contenido;
    }    
    
    //equals
    /**
     * 
     * @param o Es un objeto en especifico que se comparara con otro
     * @return Retorna true si ambos objetos son iguales o false en caso contrario
     */
    @Override
    public boolean equals(Object o) {
        if (o == null) return false;        
        Archivo a =(Archivo)o;
        return (nombre.equalsIgnoreCase(a.nombre));
    }
    //toString
    /**
     * 
     * @return Retorna un String el cual se puede imprimir un archivo identificando claramente sus atributos
     */
    @Override    
    public String toString() {
        return "Archivo{" + "nombre=" + nombre + ", fechaA=" + fechaA + ", contenido=" + contenido + '}';
    }   
}
