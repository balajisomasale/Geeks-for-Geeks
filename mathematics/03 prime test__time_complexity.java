
//Hints :

//primality Test : https://youtu.be/AaNUzEHiDpI 

class Primality 
{
    
    public boolean isPrime(int N)
    {
      //Your code here
      
      if (N<=1)
      { return false; }
      
      if(N<=3) return true; //for number 2 
      
      if (N%2==0 || N%3==0){
          return false;    //for prime..it should not be divisbile so
      }
      
      //considering time complexity : O(sqrt(n))
      //except 2 and 3 .. every prime is divisble by (6k+-1)
      for (int i=5;i*i<=N;i=i+6)
      {
          if (N%i==0 || N%(i+2)==0)
           return false;
         }
      
      return true;
      
      
    }

}
