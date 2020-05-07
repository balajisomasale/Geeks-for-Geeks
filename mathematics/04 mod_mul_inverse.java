//Modular Multiplicative Inverse : find 

class Modular 
{ public int modInverse(int a, int m)
{     int limit=0;
     while(limit<=m)  //hint 1 is here
     {
         if((limit*a)%m==1){
             return limit;
         }
         limit+=1; //
     }
     return -1;
     }
     
    }