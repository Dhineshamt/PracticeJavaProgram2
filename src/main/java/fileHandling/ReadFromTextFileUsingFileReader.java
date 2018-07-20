package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFromTextFileUsingFileReader {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("./textFile/demoTextFile.txt");
		List<String> text = new ArrayList<String>();
		int i;
	    while ((i=fr.read()) != -1)   	
	      System.out.print((char) i);

	  }		
}