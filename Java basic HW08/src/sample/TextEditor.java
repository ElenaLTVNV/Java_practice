

		package sample;
		
		import java.io.FileWriter;
		import java.io.IOException;
		import java.util.Scanner;
		
		public class TextEditor {
	    public static void startTextEditor() {
	    	
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Text editor");
	        System.out.println("Input text (for finishing enter 'exit'):");

	        StringBuilder text = new StringBuilder();
	        String input;

	        while (true) {
	            input = scanner.nextLine();
	            if (input.equalsIgnoreCase("exit")) {
	                break;
	            }
	            text.append(input).append('\n');
	        }

	        System.out.println("Input name of file :");

	        String fileName = scanner.nextLine();

	        try {
	            FileWriter fileWriter = new FileWriter(fileName);
	            fileWriter.write(text.toString());
	            fileWriter.close();
	            System.out.println("Sucessfully saved: " + fileName);
	        } catch (IOException e) {
	            System.err.println("Mistake of saving: " + e.getMessage());
	        } finally {
	            scanner.close();
	        }
	    }}