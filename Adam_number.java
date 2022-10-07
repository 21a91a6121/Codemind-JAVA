import java.util.Scanner;
class Adam_number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ns=n*n;
        int rev=0;
        while(n>0)
        {
            rev=rev*10+n%10;
            n/=10;
        }
        int revs=rev*rev;
        int revss=0;
        while(revs>0)
        {
            revss=revss*10+revs%10;
            revs/=10;
        }
        if(revss==ns)
        {
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}