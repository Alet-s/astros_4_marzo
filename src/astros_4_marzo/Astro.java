package astros_4_marzo;

public class Astro {
	// Atributos de clase
	String nombre;
	double masa;
	double tempMedia;
	//Métodos
	public void muestra(){
		System.out.println(nombre);
		System.out.println(masa);
		System.out.println(tempMedia);
		
		
	}

	public Astro(String nombre, double masa, double tempMedia) {
		this.nombre = nombre;
		this.masa = masa;
		this.tempMedia = tempMedia;
	}
}
