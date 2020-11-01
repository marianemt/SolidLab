package isp;

public class Pertsona implements Pacient{
	
	String name; int years;
	
	//calculateIncrementPerYear metodoari deitzeko Pertsona objektu batekin (eta indize afekzio) bere inkrementua kalkulatzeko.

	@Override
	public int getYears() {
		// TODO Auto-generated method stub
		return years;
	}
	@Override
	public void setYears(int years) {
		// TODO Auto-generated method stub
		this.years=years;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
	
	
	
}
