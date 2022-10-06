import java.util.*;
class Palindrom
{
    static int is_prime(int n)
    {
        if(n<=1){
            return 0;
        }
        else {
            for(int i=2;i<=Math.sqrt(n);i++) {
                if(n%i==0) {
                    return 0;
                }
            }
            return 1;
        }
    }
    static int next_palindrome(int num)
    {
        int temp =num;
        int sum = 0;
        int rem;
        while(temp!=0){
            rem = temp%10;
            sum = sum*10+rem;
            temp = temp/10;
        }
        if(sum==num) {
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number;
        number = sc.nextInt();
        for(int i=number+1;i!=0;i++)
        {
            if(is_prime(i)==1){
                if(next_palindrome(i)==1){
                    System.out.print(i);
                    break;
                }
            }
        }
    }
}