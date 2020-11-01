package isp;

public class Main {
	
	public static void main(String args[]) {
		
		//covid pacientea
		Pertsona p = new Pertsona();
		p.setName("Mariane");
		p.setYears(10);
		
		Covid19Pacient mariane = new Covid19Pacient(p);
		
		Symptom s = new Symptom();
		s.setCovidImpact(3);
		s.setSeverityIndex(5);
		
		Symptom s1 = new Symptom();
		s1.setCovidImpact(2);
		s1.setSeverityIndex(1);
		
		
		mariane.putSymtoms(s, 1);
		mariane.putSymtoms(s1, 1);
		
		
		System.out.println("CalcCovid19Impact" + mariane.calcCovid19Impact());
		
	
		
	}

}
