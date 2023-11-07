package first.hw;

import java.util.Scanner;

public class Petrol {
	
public void petrolCalc() {
	 Scanner sc = new Scanner(System.in);
	
	 System.out.println("petrol price for 1 L");
	 double petrolCost_1L = sc.nextDouble();
	 
	 System.out.println("Enter fuel consumption for 100km");
	 double fuelConsumption_100km = sc.nextDouble();
	 
	 System.out.println("Enter distance");
	 double distance = sc.nextDouble();
	 
	 double necessaryFuel = fuelConsumption_100km / 100 * distance;
	 double totalPrice = necessaryFuel * petrolCost_1L;
	 
	 System.out.println("For your distance you need " + necessaryFuel + " l" + " This will cost you " + totalPrice  + " $ ");
	  
	 
	 /*double cost100km = 9.6;
			  
	 int allWayKm = 120;
				 
     double totalPrice;
	
	 totalPrice = allWayKm / cost100km;
					 
	 System.out.println(totalPrice + "$" );
	 Примечания = пишем в строке 21 (число 100), потому что запись с дробями*/
	 
}
}
