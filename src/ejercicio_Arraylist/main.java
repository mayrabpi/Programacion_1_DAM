package ejercicio_Arraylist;

/**
 * 
 */
public class main {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
	  Biblioteca biblioteca = new Biblioteca();
	  
	  Libro libro1 = new Libro("java for Beginners", "John Doe");
	  Libro libro2 = new Libro("clean code ", "Robert C. Martin");
	  
	  biblioteca.agregarLibro(libro1);
	  biblioteca.agregarLibro(libro2);
	  
	  Usuario usuario1 = new Usuario ("Alice");
	  
	  usuario1.solicitarLibro(libro1);
	  usuario1.solicitarLibro(libro2);
	  usuario1.mostrarLibroSolicitados();
	  
	  libro1.devolver();
	  usuario1.mostrarLibroSolicitados();
	  
	  System.out.println("\n Estado actual de la biblioteca: ");
	 
	  
	  
	 
	  

	}

}
