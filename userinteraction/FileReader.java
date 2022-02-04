// Elliot Currie
// 9/29/21
// Desc:
// The purpose of this class is to read a user-formatted .txt file and return it as an ArrayList<String> object
// working path: "/home/elliotc/Desktop/flashcards/cards"
// generalized path format: "/home/elliotc/Desktop/myTextFile" (include slash at front but not at end!)

package userinteraction;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader { 
	
	private File f;
	
	private static boolean singleIteration = true; // makes the while loop only available once
	
	private String userFile = ""; // stores the returned path from Display.java
	
	private static Scanner scan; // global scanner object
	
	
	// constructor
	public FileReader() {
		
		Display disp = new Display(); // creates a new instance of the display class
		while(singleIteration) {
			userFile = disp.getFileLoc(); // gets the file location from the user, if they deny the request, the default path is returned // stores the return value 
			f = new File(userFile);
			
			System.out.println(f);
			if (!f.exists()) {
				System.out.println("Your specified path seems to be invalid, try again...");
				continue;
				
			}
			
			else {
				singleIteration = false;
				break;
			}
		}
		
	}
	
	
	public ArrayList<String> fileToList(boolean evenOrOdd) throws FileNotFoundException {
		
		scan = new Scanner(f);

		int counter = 0;
		
		ArrayList<String> fin = new ArrayList<String>();
		if (evenOrOdd == true) {
			
			while(scan.hasNextLine()) {
				
				if (counter % 2 == 0) {
					fin.add(scan.nextLine());
				}
				else if (counter % 2 != 0) {
					scan.nextLine();
				}
				
				counter++;
			}
		}
		else if (evenOrOdd == false) {
			
			while(scan.hasNextLine()) {
				
				if (counter % 2 == 0) {
					scan.nextLine();
				}
				else if (counter % 2 != 0) {
					fin.add(scan.nextLine());
				}
				
				counter++;
			}
		}
		
		return fin;
	
	}
	
}
