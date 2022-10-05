import java.util.*;
class Number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        if(num>=0) {
            System.out.printf("Positive Number");
        } else if(num<0) {
            System.out.printf("Negative Number");
        }
    }
}