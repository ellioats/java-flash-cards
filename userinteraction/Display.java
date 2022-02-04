// Elliot Currie
// 9/29/21
// Desc:
// This class is used to encapsulate the process of writing to the console in relation to this project. It is currently finished
// until further notice.

package userinteraction;

import java.util.Scanner;

public class Display {
	
	private Scanner scan = new Scanner(System.in);
	
	public void typeString(String q) {
		// q is short for "question"
		System.out.println(q);
		
	}
	
	public String getFileLoc() {
		System.out.print("Path: ");
		return scan.nextLine();
		
	}
	
	public void returnLoop(int n) {
		for (int x = 0; x < n; x++) {
			System.out.print("\n");
		}
	}
	
}
