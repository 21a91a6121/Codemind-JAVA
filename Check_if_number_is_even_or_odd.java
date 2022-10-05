import java.util.*;
class EvenOrOdd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        if (num%2==0) {
            System.out.printf("Even");
        } else {
            System.out.printf("Odd");
        }
    }
}