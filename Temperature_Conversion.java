import java.util.Scanner;
class Average
{
    public static void main(String args[])
    {
        int n;
        float F;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        F=(float)(32+(n*1.8));
        System.out.format("%.2f",F);
        sc.close();
    }
}