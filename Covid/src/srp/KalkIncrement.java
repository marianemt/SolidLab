package srp;


public class KalkIncrement {

		public double calculateIncrement(int years, double afection) {
			// TODO Auto-generated method stub
			double inc = 0;
			
			if(years>45) {
				if(years<65) {
					inc = afection * 0.7;
					
				}else{
					inc= afection * 0.5;
				}
			}else if(years<10){
				inc=0;	
			}
			
			return inc;
		}

	


}
