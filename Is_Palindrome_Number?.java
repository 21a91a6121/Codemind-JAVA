import java.util.*;
class Palindrome
{
    static int is_palindrome(int num)
    {
        int temp,rem,sum=0;
        temp = num;
        while(temp!=0)
        {
            rem = temp%10;
            sum = sum*10+rem;
            temp = temp/10;
        }
        if(sum==num){
            return 2;
        }
        else {
            return 1;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        System.out.print(is_palindrome(num));
    }
}