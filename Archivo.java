import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Archivo{
	public String nombre ;
	private String fechaA ;
	private String contenido ;
	
	public static  Archivo crearArchivo(Archivo a){
		a = new Archivo();
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
}
