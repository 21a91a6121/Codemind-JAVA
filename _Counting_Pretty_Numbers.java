import java.util.*;
class PRETTY
{
    public static void main(String A[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for(int i=0;i<a;i++)
        {
            int c=0;
            int n = scan.nextInt();
            int m = scan.nextInt();
            for(int j=n;j<=m;j++)
            {
                int b = j%10;
                if(b==2||b==3||b==9)
                {
                    c++;
                }
            }
            System.out.println(c+"");
        }
    }
}