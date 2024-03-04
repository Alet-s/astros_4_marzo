package astros_4_marzo;

public class Planeta extends Astro {
	//Atributos de clase
	double distSol;
	double orbSol;
	int numStat;
	//Constructor
	public Planeta(String nombre, double masa, double tempMedia, double distSol, double orbSol, int numStat) {
		super(nombre, masa, tempMedia);
		this.distSol = distSol;
		this.orbSol = orbSol;
		this.numStat = numStat;
	}
	//Métodos
	public void muestra() {
		System.out.println(nombre);
		System.out.println(masa);
		System.out.println(tempMedia);
		System.out.println(distSol);
		System.out.println(orbSol);
		System.out.println(numStat);
	}
}
