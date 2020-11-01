package dip;

public class CalcIncrement {

	public double calculateIncrementPerYear(Covid19Pacient covid19Pacient, double afection) {
		// TODO Auto-generated method stub
		double inc = 0;
		
		if(covid19Pacient.getYears()>45) {
			if(covid19Pacient.getYears()<65) {
				inc = afection * 0.7;
				
			}else{
				inc= afection * 0.5;
			}
		}else if(covid19Pacient.getYears()<10){
			inc=0;	
		}
		
		return inc;
	}
	

}
