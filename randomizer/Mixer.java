// Elliot Currie
// 9/29/21
// Desc:
// This class is used to refine the random string of numbers that dictate the order of questions displayed to the user. 
// It's purpose is to hopefully even out the numbers so there's more diversity in the display order. 
// This class currently isn't used. If it is used, a dependency will be created between this class and Randomizer.java

//ideas for dynamic mixing

// shift all indexes of all elements by i+1
// for every element with an even index, reverse the order 

package randomizer;

import java.util.Stack;

public class Mixer {
	

	public int[] reverse(int[] order) {
		Stack<Integer> s = new Stack<Integer>();
		int[] fin = new int[order.length];
		
		// push
		for(int x = 0; x < order.length; x++) {
			s.push(order[x]);
		}
		
		// pop
		for (int x = 0; x < order.length; x++) {
			fin[x] = s.pop();
		}
		return fin;
		
	}
	// needs more dynamic optimization, more parameters = more functionality
	// reverses all the even numbers 
	public int[] shifter(int[] order, int pick) {
		Stack<Integer> s = new Stack<Integer>();
		for (int i : order) {
			if (i % pick == 0) { 
				//System.out.println("Currently pushing: " + i);
				s.push(i);
			}
		}
		
		for (int i = 0; i < order.length; i++) {
			if (i % pick == 0) {
				//System.out.println("Currently popping: " + i);
				order[i] = s.pop();
			}
		}
		//System.out.println("-----------------");
		return order;
	}
	
	public int[] doubleChecker(int[] order) {
		
		int counter;
		for (int i = 0; i < order.length; i++) {
			 counter = i;
			//System.out.println(" value of i " + i);
			//System.out.println("value of counter " + counter);
			
			if (order[counter] == order[counter++] || order[counter] == order[counter--]) {
				if ((i += 1) >= order.length) {
					i--;
					order[i] = order[i] - 1;
					
				}
					
				else {
					order[i] = order[i] + 1;
					
				}
			}
			
		}
		return order;
	} 
}
