package dip;

import java.util.HashMap;
import java.util.Map;


public class Covid19Pacient extends Pacient {
	
	private CalcAfection ca;
	private CalcIncrement incr;
	
	Map<Symtoms,Integer> sym=new HashMap<Symtoms,Integer>();
	public Covid19Pacient(String name, int years) {
		super(name, years);
		// TODO Auto-generated constructor stub
	}

	public void addSymptom(Symtoms c, Integer w){
		sym.put(c,w);
	}
	
	public void showSymptoms(){
		for (Symtoms s: sym.keySet()) {
			s.show();
		}		
	}
	
	double calcCovid19Impact() {
		double afection;
		double increment=0;
		double impact;
		//calculate afection
		
		afection=ca.calculateSympomsAfection(this);
		//calculate increment
		increment=incr.calculateIncrementPerYear (this, afection);
		//calculate impact
		impact=afection+increment;
		return impact;
		}
}
