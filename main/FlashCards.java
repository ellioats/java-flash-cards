// Elliot Currie
// 9/26/2021
// Description: 
// "Core" class for flash card project. Only use this class for direct user interaction (input, output, etc) and Do not use it for 
// card weight calculation, or interacting with .txt files.
// The purpose of this class is to intake 2 string lists from the fileio class (impliment getter methods in fileio class), and a random number from the randomizer class, 
// and display them sequentially to the user. 


//TODO: add gui class and forward current flashcard variables to JLabel variables 
	// also add method to detect length of current string and dynamically change font size 
	
package main;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import randomizer.Randomizer;
import userinteraction.Display;
import userinteraction.FileReader;

public class FlashCards {
	
	private static Scanner scan = new Scanner(System.in);
	
	private static ArrayList <String> questions = new ArrayList<String>(); // imported questions
	private static ArrayList <String> answers = new ArrayList<String>(); // imported answers
	
	private static int index = 0;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		//String dir = System.getProperty("user.dir");
		//System.out.println(dir);
		
		FileReader read = new FileReader(); // initializes the filereader class
		
		// turns a specified file into a list for the flashcards
		questions = read.fileToList(true);
		answers = read.fileToList(false);
		
		
		Randomizer r = new Randomizer();
		Display d = new Display();
		
		int[] questionOrder = r.generateNewNums((questions.size()));
		
		// while loop with # of iterations depending on the size of the question order int array
		while(index < questionOrder.length) {

			// encapsulate printing lines into Display class
			
			//System.out.println("DEBUG: questionOrder list size " + questionOrder.length);
			//System.out.println("DEBUG: questions.size value is "+ questions.size());
			
			d.typeString(questions.get(questionOrder[index]));
			d.typeString("");
			scan.nextLine();
			
			System.out.println(answers.get(questionOrder[index]));
			if (index != 0) {
				System.out.println("\n\n\n\n\n\n\n\n\n");
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// encapsulate this into for loop with # of iterations as parameter
			d.returnLoop(19);
			
			index++;	
		}	
	}
}
