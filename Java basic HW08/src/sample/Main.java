package sample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  TextEditor.startTextEditor();
  
		  int[][] array = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };

		        ArrayToFile.saveArrayToFile(array, "array.txt");
		    
		        String directoryPath = "C:\\example"; 
		        DirectoryLister.listDirectories(directoryPath);
		    
	}}


