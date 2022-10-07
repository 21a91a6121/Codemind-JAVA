import java.util.*;
class Abundant
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int temp;
        int sum = 0;
        temp = n;
        for(int i=1;i<n;i++) {
            if(temp%i==0) {
                sum = sum+i;
            }
        }
        if(sum>n) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}