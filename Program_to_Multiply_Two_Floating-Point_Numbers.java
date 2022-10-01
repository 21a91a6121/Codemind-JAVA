import java.util.*;
class Multiply
{
    public static void main(String[] args)
    {
        float a,b,mul;
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        mul = a*b;
        System.out.printf("%.2f",mul);
    }
}