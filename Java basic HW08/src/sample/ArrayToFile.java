package sample;

	import java.io.FileWriter;
	import java.io.IOException;

	public class ArrayToFile {
	    public static void saveArrayToFile(int[][] array, String fileName) {
	        try {
	            FileWriter fileWriter = new FileWriter(fileName);

	            for (int[] row : array) {
	                for (int value : row) {
	                    fileWriter.write(value + "\t"); 
	                }
	                fileWriter.write("\n"); 
	            }

	            fileWriter.close();
	            System.out.println("Successfully saved: " + fileName);
	        } catch (IOException e) {
	            System.err.println("Mistake of saving: " + e.getMessage());
	        }
	    }
	}

