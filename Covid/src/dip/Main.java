package dip;

public class Main {
	
	public static void main(String args[]) {
		
		//covid pacientea
		Covid19Pacient mariane = new Covid19Pacient("Mariane", 67);
		
		
		//
		CardioVascularSymptom c = new CardioVascularSymptom();
		c.setCovidImpact(57);
		c.setSeverityIndex(3);
		c.setAffectedDays(4);
		
		
		NeuroMuscularSymptom n = new NeuroMuscularSymptom();
		n.setCovidImpact(70);
		n.setSeverityIndex(3);
		n.setAffectedDays(2);
		
		
		RespiratorySymptom r = new RespiratorySymptom();
		r.setCovidImpact(3);
		r.setSeverityIndex(3);
		r.setAffectedDays(4);
		
		
		mariane.addSymptom(c, 1);
		mariane.addSymptom(n, 1);
		mariane.addSymptom(r,1);
		
		mariane.showSymptoms();
		
		
		System.out.println("CalcCovid19Impact" + mariane.calcCovid19Impact());
		
	
		
	}

}