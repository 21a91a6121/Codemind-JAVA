import java.util.*;
class Main
{
    static boolean isprime(int n)
    {
        if(n<=1) return false;
        for(int i=2;i<n;i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int cnt=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int k=s.nextInt();
        for(int i=0;i<n;i++)
        {
            if(isprime(a[i])==true && a[i]<=k)
            {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}