package isp;

import java.util.HashMap;
import java.util.Map;



public class Covid19Pacient extends Pertsona{

	
	public Covid19Pacient(Pertsona p) {
		super();
		// TODO Auto-generated constructor stub
	}
	
	Map<Symptom, Integer> sym = new HashMap<Symptom,Integer>();
	
	public void putSymtoms(Symptom s, Integer z) {
		sym.put(s, z);
	}

	double calcCovid19Impact() {
		double afection = 0;
		double increment = 0;
		double impact;
		// calculate afection
		for (Symptom s : sym.keySet()) {
			afection = afection + s.getSeverityIndex()*sym.get(s);
		}
		
		afection = afection / (sym.size());
	
		// calculate increment
		
		CalcIncrement incr=new CalcIncrement();
		increment=incr.getIncrementByYear(this.getYears(), afection);
		
			
		// calculate impact
		impact = afection + increment;
		return impact;
	}
	
}
