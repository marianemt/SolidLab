package dip;

import java.util.HashMap;
import java.util.Map;

public class RespiratorySymptom extends Symtoms{

	 
	int covidImpact;
	 int severityIndex;
	 int affectedDays;
	// Map<RespiratorySymptom, Integer> respirs = new HashMap<RespiratorySymptom, Integer>();
	 
	 public RespiratorySymptom() {
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

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(" severityIndex :"+ severityIndex+" covidImpact:"+covidImpact);
	}
	 
}