// Elliot Currie
// 9/29/21 
// Desc: 
// This class is meant to generate a random list of numbers, the lists' length must match the length of the questions
// this list of numbers will be used in the fileio class to determine which questions to take from the text file.

package randomizer;

import java.util.Random;

public class Randomizer {
	
	
	public int[] generateNewNums(int amountOfQuestions) {
		Mixer m = new Mixer();
		
		
		int[] fin = new int[amountOfQuestions];
		
		for(int x = 0; x < (amountOfQuestions); x++) {
			fin[x] = x;
		}
		
		
		Random rand = new Random();
		int pick;
		for (int x = 0; x < 1; x++) {
			pick = rand.nextInt(4);
		
			
			//System.out.println(x);
			
			
			switch(pick) {
			
			case 0: 
				fin = m.shifter(fin, 2);
				break;
			case 1: 
				fin = m.shifter(fin, 3);
				break;
			case 2: 
				fin = m.shifter(fin, 4);
				break;
			case 3: 
				fin = m.shifter(fin, 5);
				break;
			}
			
		}
		fin = m.reverse(fin);
		//fin = m.doubleChecker(fin);
		//fin = m.doubleChecker(fin);
		
		
		return fin;
		
	}
}
