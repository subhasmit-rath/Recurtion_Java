package DSA.RECURTION;

public class gcd {
    public static int ggcd(int m, int n)
    {
        if(m%n==0)
        {
            return n;
        }
        else
        {
            return ggcd(n, m%n);
        }
    }
    public static void main(String[] args) {
        int res=ggcd(4, 3);
        System.out.println("the gcd is:"+res);
    }
    
}
