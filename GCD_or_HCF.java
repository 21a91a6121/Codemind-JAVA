import java.util.*;
class gcd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b,min,h;
        a=sc.nextInt();
        b=sc.nextInt();
        if (a<b)
        min=a;
        else
        min=b;
        for(int i=min;;i-=1)
        {
            if(a%i==0&&b%i==0)
            {
                h=i;
                break;
            }
        }
        System.out.println(h);
    }
}