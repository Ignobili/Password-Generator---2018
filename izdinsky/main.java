/**
 * 
 */
package izdinsky;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 */
public class main {


	
	public static void main(String[] args) {
		
		GenereratePassword gp = new GenereratePassword();
		
		Scanner scan = new Scanner(System.in);
		int tries = 3;
		
		System.out.println("Insert password Length!");
		
		int length = scan.nextInt();
		
		while(length<=4) {
			
			System.out.println("Minimum length is 5!");
			System.out.println("Insert password Length! Remain tries: "+ tries);
			length = scan.nextInt();
			tries--;
			
			if(tries==0) {
				break;
			}
			
			
		}
				
		System.out.println(gp.givePassword(length));
		

	}


}
