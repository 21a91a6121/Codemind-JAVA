import java.util.*;
class file
{
    public static void main(String[] args)
    {
        Scanner k=new Scanner(System.in);
        int a,b;
        a=k.nextInt();
        b=k.nextInt();
        for(int i=1;i<=b;i++)
        {
            if(i%2!=0)
            {
                System.out.println(a+" x "+i+" = "+a*i);
            }
        }
    }
}