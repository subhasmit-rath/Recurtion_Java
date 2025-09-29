package DSA.RECURTION;

public class reverse {
    public static int rev(int n,int rev)
    {
        if(n==0)
        {
            return rev;
        }
        else
        {
            return rev(n/10, (rev*10)+(n%10));
        }
    }
    public static void main(String[] args) {
        int res=rev(73, 0);
        System.out.println("the reverse of the number is:"+res);

    }
}
