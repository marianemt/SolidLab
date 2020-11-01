package dip;

import java.util.HashMap;
import java.util.Map;

public class CalcAfection {

	
	public double calculateSympomsAfection(Covid19Pacient covid19Pacient) {
		// TODO Auto-generated method stub
		double afection=0;
		double elem =0;
		for (Symtoms s : covid19Pacient.sym.keySet()) {
			if(s.getCovidImpact()>50) {
				elem = elem+1;
				afection = afection+ s.getSeverityIndex()*covid19Pacient.sym.get(s);
				
			}
			
		}
		afection = afection / elem;
		
		return afection;
	}

}
