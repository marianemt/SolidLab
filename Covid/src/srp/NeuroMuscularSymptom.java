package srp;

import java.util.HashMap;
import java.util.Map;

public class NeuroMuscularSymptom extends Symtoms {

	 int covidImpact;
	 int severityIndex;
	 int affectedDays;
	// Map<NeuroMuscularSymptom, Integer> neuros = new HashMap<NeuroMuscularSymptom, Integer>();
	 
	public NeuroMuscularSymptom() {
		super();
		
	}
	public int getCovidImpact() {
		return covidImpact;
	}
	public void setCovidImpact(int covidImpact) {
		this.covidImpact = covidImpact;
	}
	public int getSeverityIndex() {
		return severityIndex;
	}
	public void setSeverityIndex(int severityIndex) {
		this.severityIndex = severityIndex;
	}
	
	public void setAffectedDays(int affectedDays) {
		this.affectedDays=affectedDays;
	}
	
	@Override
	public int getAffectedDays() {
		// TODO Auto-generated method stub
		return affectedDays;
	}
}

