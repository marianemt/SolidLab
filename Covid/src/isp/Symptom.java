package isp;

public class Symptom {
	
	 int covidImpact;
	 int severityIndex;

	 public Symptom() {
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
}
