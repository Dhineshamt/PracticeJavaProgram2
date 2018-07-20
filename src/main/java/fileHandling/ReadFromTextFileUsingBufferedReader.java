package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ReadFromTextFileUsingBufferedReader {

	public static void main(String[] args) throws IOException {
		File textFile = new File("./textFile/demoTextFile.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(textFile));
			
			List<String> names = new ArrayList<>();
		
			String st;
			  while ((st = br.readLine()) != null) {
			    names.add(st);
			  }
			  
			  for(String each: names) {
				  System.out.println(each);
			  }
			  
			  
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
