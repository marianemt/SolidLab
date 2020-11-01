package srp;

import java.util.HashMap;
import java.util.Map;

public class KalkAfection {
	
	
	public double calculateAfection(Covid19Pacient covid19Pacient) {
		double afection=0;
		double elem =0;
		for(Symtoms s: covid19Pacient.sym.keySet()) {
			if(s.getCovidImpact()>50) {
				afection = afection+ s.getSeverityIndex()*covid19Pacient.sym.get(s);
				elem = elem+1;
			}
			
		}
		
		afection = afection / elem;
		
		return afection;
	}

}
