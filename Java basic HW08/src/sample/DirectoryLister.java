package sample;

import java.io.File;

	public class DirectoryLister {
	    public static void listDirectories(String directoryPath) {
	        File directory = new File(directoryPath);

	        if (directory.isDirectory()) {
	            File[] subdirectories = directory.listFiles(File::isDirectory);

	            if (subdirectories != null && subdirectories.length > 0) {
	                System.out.println("List of directory: " + directory.getAbsolutePath() + ":");
	                for (File subdirectory : subdirectories) {
	                    System.out.println(subdirectory.getName());
	                }
	            } else {
	                System.out.println("There are no subdirectories in the specified directory.");
	            }
	        } else {
	            System.out.println("The specified path is not a directory.");
	        }
	    }
	}

