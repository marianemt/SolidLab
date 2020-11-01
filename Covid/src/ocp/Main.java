package ocp;

public class Main {
	
	public static void main(String args[]) {
		
		//covid pacientea
		Covid19Pacient mariane = new Covid19Pacient("Mariane", 67);
		
		
		//
		CardioVascularSymptom c = new CardioVascularSymptom();
		c.setCovidImpact(2);
		c.setSeverityIndex(3);
		c.setAffectedDays(4);
		
		
		NeuroMuscularSymptom n = new NeuroMuscularSymptom();
		n.setCovidImpact(1);
		n.setSeverityIndex(3);
		n.setAffectedDays(2);
		
		
		RespiratorySymptom r = new RespiratorySymptom();
		r.setCovidImpact(3);
		r.setSeverityIndex(3);
		r.setAffectedDays(4);
		
		
		mariane.putSymtoms(c, 1);
		mariane.putSymtoms(n, 1);
		mariane.putSymtoms(r,1);
		
		
		System.out.println("CalcCovid19Impact" + mariane.calcCovid19Impact());
		
		System.out.println("SanatedDays" + mariane.sanatedDays());
		
	}

}
