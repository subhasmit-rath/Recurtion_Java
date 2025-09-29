package DSA.RECURTION;
public class basic_mMULn {
    public static int mul(int m, int n)
{
if(n==0)
{
    return 0;
}
else
{
    return (m+mul(m,(n-1)));
}
}
    public static void main(String[] args) {
        //int res=mul(4,2);
        System.out.println("the result is:"+mul(4, 2));
    }
    
}
