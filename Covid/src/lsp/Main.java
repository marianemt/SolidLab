package lsp;


public class Main {
	
	public static void main(String args[]) {
		
		//covid pacientea
		Covid19Pacient mariane = new Covid19Pacient("Mariane", 67);
		Covid19Pacient ander = new Covid19Pacient ("Ander", 21);
		
		Symptom c = new Symptom("Fiebre", 2, 3);
		Symptom n = new Symptom("Tos seca", 1, 2);
		Symptom r = new Symptom("Diarrea", 1, 1);
		
		mariane.addSymptom(c, 1);
		mariane.addSymptom(n, 1);
		mariane.addSymptom(r, 1);
		
		
		c.show();
		mariane.showSymptoms();
		mariane.curecovid();
		
		
		
		
	}

}
