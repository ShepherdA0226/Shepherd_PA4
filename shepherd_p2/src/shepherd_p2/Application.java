package shepherd_p2;
import java.io.*;


public class Application {
	
	public static void main(String[] args) throws IOException {
	//throws an IOException if something goes wrong during the operation
		
		DuplicateCounter duplicateCounter = new DuplicateCounter();
	//create a duplicateCounter object	
		duplicateCounter.count("problem2.txt");
		duplicateCounter.write("unique_word_counts.txt");
	//calls on the remove and write methods in DuplicateCounter class
		
		System.out.println("Duplicate counting performed successfully.");
	//informs the user of successful operation
		
	}

}
