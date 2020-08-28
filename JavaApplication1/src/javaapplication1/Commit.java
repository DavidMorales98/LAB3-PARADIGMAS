/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class Commit {
    public String autor;
    private String fechaC;
    private String mensaje;
    private ArrayList archivos[];
    
    public Commit crearCommit(Commit c){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el autor:");
        c.autor = in.nextLine();
        
        System.out.println("Ingrese un mensaje:");
        c.mensaje = in.nextLine();
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	Date fecha = new Date();		
	c.fechaC=df.format(fecha);
        
        
        return c;
    }
    
}
