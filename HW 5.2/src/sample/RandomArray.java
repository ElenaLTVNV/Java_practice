package sample;

import java.util.Arrays;
import java.util.Random;
		
		public class RandomArray {
		public void randomArr() {
			
			Random rn = new Random();
			
			int[] originalArr = new int[15];
			int[] doubleArr = new int[30];
			
			for(int i = 0; i < 15; i++) {
				originalArr[i] = rn.nextInt(15);
				doubleArr[i] = originalArr[i];
				doubleArr[i + 15] = originalArr[i] * 2;
			}
			System.out.println("Original Array: " + Arrays.toString(originalArr));
			System.out.println("New Array:      " + Arrays.toString(doubleArr));
			
	    }
	}

