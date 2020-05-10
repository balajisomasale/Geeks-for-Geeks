class Print
{
    
  public void printNos(int N)
    {
        if (N>0)
        {
        
        //recursive
        printNos(N-1);
        System.out.print(N + " ");
        }
        return ;
        
    }
}
