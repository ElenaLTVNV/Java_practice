package sample;

public class PiNumber {

		public void numberPi() {
			String pi = "";
			
			for(int i = 2; i <= 11; i++) {
				 pi = String.format("%." + i + "f", Math.PI);
				 System.out.println(pi);
			}
		}	
	}

