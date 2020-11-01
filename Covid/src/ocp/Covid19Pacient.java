package ocp;

import java.util.HashMap;
import java.util.Map;


public class Covid19Pacient extends Pacient {
	

	public Covid19Pacient(String name, int years) {
		super(name, years);
		// TODO Auto-generated constructor stub
	}
	
	Map<Symtoms, Integer> sym = new HashMap<Symtoms,Integer>();
	
	
	public void putSymtoms(Symtoms s, Integer z) {
		sym.put(s, z);
	}

	double calcCovid19Impact() {
		double afection = 0;
		double increment = 0;
		double impact;
		// calculate afection
		for (Symtoms s : sym.keySet()) {
			afection = afection + s.getSeverityIndex()*sym.get(s);
		}
		
		afection = afection / (sym.size());
		// calculate increment
		if (getYears() > 65)
			increment = afection * 0.5;
		// calculate impact
		impact = afection + increment;
		return impact;
	}
	
	public int sanatedDays() {
		int egunak=0;
		for (Symtoms s : sym.keySet())
			if(egunak< s.getAffectedDays()) {
				egunak= s.getAffectedDays();
			}
		return egunak;
	
	}

}
