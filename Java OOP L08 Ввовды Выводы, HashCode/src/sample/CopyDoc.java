package sample;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyDoc {
	public static long copyFile(File in, File out) throws IOException {
	    try (InputStream is = new FileInputStream(in); OutputStream os = new FileOutputStream(out)) {
	      return is.transferTo(os);
	    }
	  }

	  public static long copyFolder(File folderIn, File folderOut, String fileType) throws IOException {
	    File[] files = folderIn.listFiles();
	    int count = 0;
	    for (int i = 0; i < files.length; i++) {
	    	String doc = files[i].getName();
	      if (files[i].isFile() && doc.endsWith(fileType)) {
	        File file = new File(folderOut, files[i].getName());
	        copyFile(files[i], file);
	        count += 1;
	      }
	    }
	    return count;
	  }
	}

