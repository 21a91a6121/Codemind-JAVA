import java.util.*;
class Palindrome
{
    static int palindrome(int num)
    {
        int temp,sum=0,rem;
        temp=num;
        while(temp!=0)
        {
            rem = temp%10;
            sum = sum*10+rem;
            temp=temp/10;
        }
        if(sum==num){
            return 1;
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,m;
        int c=0;
        n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
           m = sc.nextInt();
           if(palindrome(m)==1){
               c++;
           }
        }
        System.out.print(c);
    }
}