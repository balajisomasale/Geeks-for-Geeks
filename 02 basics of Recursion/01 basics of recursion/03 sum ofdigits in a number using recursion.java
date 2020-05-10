//finding the sum of digints in given number using recursive number
	
	static int fun(int n)
	{    // say n= 253
		
			if (n<10){  //base case
				return n;   //if n is single digit then return n 
			}
			
			return fun(n/10)+n%10;   // n/10 gives the value and n%10 givees the remainder
	}
		   
		 }