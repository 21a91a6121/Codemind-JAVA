import java.util.*;
class Modulus
{
    public static void main(String[] args)
    {
        int a,b,mod;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        mod = a%b;
        System.out.printf("%d",mod);
    }
}