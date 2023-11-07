package first.hw;

import java.util.Scanner;

public class Triangle {

	
	public void squarSearch() {
		Scanner sc = new Scanner(System.in);
		double sideA = 0.3;
		double sideB = 0.4;
		double sideC = 0.5;
		double halfP = ((sideA+sideB+sideC)/2);
		double result = Math.sqrt(halfP * (halfP - sideA) * (halfP - sideB) * (halfP - sideC));
		System.out.println(result);	
	}
}
