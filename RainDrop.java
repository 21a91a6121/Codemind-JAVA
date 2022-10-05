import java.util.*;
class Raindrop
{
    public static void main(String A[])
    {
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        scan.close();
        if(a%3==0 && a%5!=0 && a%7!=0)
        {
            System.out.print("Pling");
        }
        else if(a%3!=0 && a%5==0 && a%7!=0)
        {
            System.out.print("Plang");
        }
        else if(a%3!=0 && a%5!=0 && a%7==0)
        {
            System.out.print("Plong");
        }
        else if(a%7==0 && a%5==0 && a%3==0)
        {
            System.out.print("PlingPlangPlong");
        }
        else if(a%3==0 && a%5==0)
        {
            System.out.print("PlingPlang");
        }
        else if(a%3==0 && a%7==0)
        {
            System.out.print("PlingPlong");
        }
        else if(a%5==0 && a%7==0)
        {
            System.out.print("PlangPlong");
        }
        else
        {
            System.out.print(a);
        }
    }
}