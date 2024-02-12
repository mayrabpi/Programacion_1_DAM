package ejercicio_Arraylist;

import java.util.ArrayList;

public class Usuario {
	private ArrayList<Libro> librosSolicitados = new ArrayList<Libro>();
	private String nombre;
	
	public Usuario() {
		this.librosSolicitados = new ArrayList<Libro>();
	}
	
	public Usuario (String nombre) {
	  this.nombre = nombre;
	}
	public void solicitarLibro (Libro libro) {
		if(libro.disponible()) 
		this.librosSolicitados.add(libro);	
		else 
		System.out.println("El libro no está disponible para prestamo");	
	}
	public void mostrarLibroSolicitados() {
		for(int i=0;i<this.librosSolicitados.size(); i++) {
		System.out.println("Los libros solicitados por " + this.nombre + " son " + this.librosSolicitados.get(i).getTitulo() );
		}
		
	}
	


}
