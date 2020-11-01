package srp;

public class Pacient {
	String name; 
	int years;
	
	public Pacient(String name, int years) {
		super();
		this.name= name;
		this.years=years;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}
	
	public double adintartea(int years) {
		double inc = 0;
		if(years>45) {
			if(years<65) {
				inc = 0.7;
				
			}else if (years>65){
				inc= 0.5;
			}
		}else if(years<10){
			inc=0;	
		}
		
		return inc;
		
		
	}
	
	
}
