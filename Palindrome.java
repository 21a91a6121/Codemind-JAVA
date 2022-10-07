import java.util.*;
class Palindrome
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        int temp,sum=0,rem;
        n = sc.nextInt();
        temp = n;
        while(temp!=0)
        {
            rem = temp%10;
            sum = sum*10+rem;
            temp = temp/10;
        }
        if(sum==n){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}