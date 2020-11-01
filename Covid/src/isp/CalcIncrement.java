package isp;

public class CalcIncrement {

	// adin eta afection indize bat emanda, afekzio indizea adinaren arabera inkrementatzen du
	public double getIncrementByYear(int i, double afection){
		if (i>65) return afection*0.5; else return 0;
	}
}
