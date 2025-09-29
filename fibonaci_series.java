package DSA.RECURTION;
//WORGE CODE NEED TO RECTIFY MISTAKE :(
                                 
public class fibonaci_series {
    public static int fibo(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else if(n==1)
        {
            return 1;
        }
        else
        {
            return fibo((n-2)+fibo(n-1));
    }
    }
    public static void main(String[] args) {
        System.out.println("the series is:"+fibo(24));
    }
    
}
