/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int testData = scan.nextInt();
		int counter = 1;
                int total = 0;
		while(testData--!=0){
			char[] input = scan.next().toCharArray();
			int result = 0;
			for(char item : input){
				if(item == 'X'){
					counter = 1;
				}
				else{
					result += counter;
					counter++;
				}
                                        total +=result;
                                
			}
			System.out.println("Result : "+result);
			System.out.println("Total : "+total);
                        
		}
	}
}