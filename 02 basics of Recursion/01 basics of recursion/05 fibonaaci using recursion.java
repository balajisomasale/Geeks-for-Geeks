long long fibonacci(int n)
{
    //Your code here
    //base case
    if(n==0)
    {
        return 0;
    }
    if(n==1)
    {
        return 1;
    }
    //recursive logic 
    return (fibonacci(n-1)+fibonacci(n-2));
}
