package DSA.RECURTION;

public class factorial {
    public static int fact(int n)
{
    if(n==0 || n==1)
    {
        return 1;
    }
    else
    {
        return n*fact(n-1);
    }
}
    public static void main(String[] args) {
        int num=5;
        System.out.println("the factorial of given number is:"+fact(num));
    }
    
}
