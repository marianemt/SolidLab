package lsp;

public class IncurableSymptom extends Symptom {
	
	public IncurableSymptom(String name, int covidImpact, int severityIndex) {
		super(name, covidImpact, severityIndex);
		// TODO Auto-generated constructor stub
	}

	public void cure() {
		System.out.println("ERROR, can not be treated");
		}
}
