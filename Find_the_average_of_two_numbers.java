import java.util.Scanner;
class average_of_twonum
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        float N,M,P;
        N=sc.nextFloat();
        M=sc.nextFloat();
        P=(float)(N+M)/2;
        System.out.format("%.4f",P);
        sc.close();
        
    }
}