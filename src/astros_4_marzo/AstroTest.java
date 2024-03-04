package astros_4_marzo;

import java.util.ArrayList;

public class AstroTest {

	public static void main(String[] args) {
		ArrayList<Astro> astros = new ArrayList<Astro>();
		Planeta  pla1 = new Planeta("Tierra",2000000.0,35.0,4.0,3.0,1);
		Satelite sat1 = new Satelite("Luna", 50000.0,39.0,6.0,7.0,"Tierra");
		astros.add(pla1);
		astros.add(sat1);

		Astro s=(Astro)astros.get(0);
		s.muestra();
		s=(Astro)astros.get(1);
		s.muestra();
		pla1.muestra();
		sat1.muestra();
	}

}
