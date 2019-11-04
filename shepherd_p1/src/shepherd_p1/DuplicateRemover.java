package shepherd_p1;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashSet;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.io.PrintWriter;


public class DuplicateRemover {
	
	HashSet<String> uniqueWords = new HashSet<String>();

	public void remove(String dataFile) throws FileNotFoundException {
	//throws a FileNotFoundException if the file is not present (terminate when exceptional IO event occurs)
		
		String line;
		Scanner scnr = new Scanner(new File(dataFile));
	//creating a String, a Scanner, and a Set to read and manipulate the files
		
		while (scnr.hasNext()) {
			line = scnr.next();
			uniqueWords.add(line);
	//add the line to uniqueWords.txt if not already contained
		}
		
		scnr.close();
	//clean up of resources used
	}	
	
	public void write(String outputFile) throws IOException {
	//throws an IOException	if there is an error during this operation
		PrintWriter printWriter = new PrintWriter(new FileWriter(outputFile, false));
		printWriter.print(uniqueWords);
		printWriter.close();
		}
	}
	


