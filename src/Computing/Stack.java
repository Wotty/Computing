package Computing;

import java.util.Random;
import java.util.Scanner;

public class Stack {
	private static int[] a;
	 static Random rand = new Random();
	
public static void main(String[] args) {
	a[9] = 0;
	int top;
	int temp = 0;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter length of array you want");
			int c = sc.nextInt();
			
		    a = new int[c];
		    for(int i=0;i<a.length;i++){
		    	int randomNum = (int)rand.nextInt(100-0);
		        a[i] = randomNum ;
		    }
		    for(int i = 0;i<a.length;i++)

		
	}
}