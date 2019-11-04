package shepherd_p1;
import java.io.*;


public class Application {

	public static void main(String[] args) throws IOException {
	//throws an IOException if something goes wrong during the operation
		
		DuplicateRemover duplicateRemover = new DuplicateRemover();
	//create a duplicateRemover object	
		duplicateRemover.remove("problem1.txt");
		duplicateRemover.write("unique_words.txt");
	//calls on the remove and write methods in DuplicateRemover class
		
		System.out.println("Duplicate removal performed successfully.");
	//informs the user of successful operation
		
	}

}
