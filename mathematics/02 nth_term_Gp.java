


class GP 
{
    
    public double termOfGP(int A,int B,int N)
    {
        //Your code here
        
        double ratio=((double)B/A); //Have to double due to Test cases
        
        double result;
        result=Math.floor(A*Math.pow(ratio,N-1));
      
        return result; // returning double
        
        
    }

}
