package ejercicio_Arraylist;

import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Libro> inventario = new ArrayList<Libro>();
	
	public Biblioteca () {
		this.inventario = new ArrayList<Libro>();		
	}
	
	public void agregarLibro (Libro libro) {
		inventario.add(libro);
		System.out.println ("libro agregado al inventario ");	
	}
	public Libro buscarLibroPorTitulo (String titulo) {
		boolean encontrado=false;
		int i=0;
		Libro a=null;
		while(!encontrado && i  <this.inventario.size()) {
			if(encontrado == true);
			i++;
		if(this.inventario.get(i).getTitulo() == titulo);
		  encontrado=true;
		  a=this.inventario.get(i);
		 
		}
		return a;
		
	}  


}


