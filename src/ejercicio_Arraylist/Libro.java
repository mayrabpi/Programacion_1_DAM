package ejercicio_Arraylist;
/**
 * 
 * 
 */
public class Libro {
	private String titulo;
	private String autor;
	private boolean estadoDisponible;
	/**
	 * 
	 */
	public Libro( String titulo , String autor) {
		this.titulo = titulo;
		this.autor = autor;	
		this.estadoDisponible= true;
	}
	/**
	 * 
	 */
	public void prestar() {
		if (this.estadoDisponible == true) 
		System.out.println("Libro prestado " + this.titulo);
		else 
		System.out.println("Libro no disponible " + this.titulo);		
	}
	/**
	 * 
	 */
	public void devolver() {
		if(this.estadoDisponible == false) 
		System.out.println("Libro  devuelto " +this.titulo);
		else 
		System.out.println("El libro ya esta disponible "+ this.titulo);	
	}
	/**
	 * 
	 * @return
	 */
	public String getTitulo () {
		return this.titulo;
	}
	/**
	 * 
	 * @return
	 */
	public boolean disponible() {
		if(this.estadoDisponible == true) 
		return true;
		else 
		return false;		
	}
}
