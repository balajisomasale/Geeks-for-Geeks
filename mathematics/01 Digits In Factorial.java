//Used Java 
//HInts : https://www.geeksforgeeks.org/count-digits-factorial-set-1/

/* We know,
log(a*b) = log(a) + log(b)

Therefore
log( n! ) = log(1*2*3....... * n) 
          = log(1) + log(2) + ........ +log(n)

Now, observe that the floor value of log base 
10 increased by 1, of any number, gives the
number of digits present in that number.

Hence, output would be : floor(log(n!)) + 1.


Code:
*/

// Java program to find the number 
// of digits in a factorial 

import java.io.*; 
import java.util.*; 

class GFG 
{ 
	// returns the number of digits 
	// present in n! 
	static int findDigits(int n) 
	{ 
		// factorial exists only for n>=0 
		if (n < 0) 
			return 0; 

		// base case 
		if (n <= 1) 
			return 1; 

		// else iterate through n and calculate the 
		// value 
		double digits = 0; 
		for (int i=2; i<=n; i++) 
			digits += Math.log10(i); 

		return (int)(Math.floor(digits)) + 1; 
	} 
	
	// Driver code 
	public static void main (String[] args) 
	{ 
		System.out.println(findDigits(1)); 
		System.out.println(findDigits(5)); 
		System.out.println(findDigits(10)); 
		System.out.println(findDigits(120)); 
	} 
} 

