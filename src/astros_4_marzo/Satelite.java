package astros_4_marzo;

public class Satelite extends Astro{
	//Atributos de clase
	double distPlaneta;
	double orbPlaneta;
	String nomPlaneta;
	//Constructor
	public Satelite(String nombre, double masa, double tempMedia, double distPlaneta, double orbPlaneta,
			String nomPlaneta) {
		super(nombre, masa, tempMedia);
		this.distPlaneta = distPlaneta;
		this.orbPlaneta = orbPlaneta;
		this.nomPlaneta = nomPlaneta;
	}
	//Métodos
	public void muestra() {
		System.out.println(nombre);
		System.out.println(masa);
		System.out.println(tempMedia);
		System.out.println(distPlaneta);
		System.out.println(orbPlaneta);
		System.out.println(nomPlaneta);
	}

}
