import java.util.*;
class Area
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a,b,c,area,s;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        s = (a+b+c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",area);
    }
}