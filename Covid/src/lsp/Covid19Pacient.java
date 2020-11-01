package lsp;

import java.util.HashMap;
import java.util.Map;

public class Covid19Pacient extends Pacient{

	public Covid19Pacient(String name, int years) {
		super(name, years);
		// TODO Auto-generated constructor stub
	}
	
	Map<Symptom,Integer> symptoms=new HashMap<Symptom,Integer>();
	
	
	public void addSymptom(Symptom p, Integer w){
		symptoms.put(p,w);
	}
	public void showSymptoms(){
		for (Symptom s: symptoms.keySet()) {
			s.show();
		}		
	}
	public void curecovid(){
		
		
		for (Symptom s: symptoms.keySet()) {
			if(!(s instanceof IncurableSymptom)) {
				s.cure();
			}
				
		}
		
		
	}
	
}
