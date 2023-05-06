import java.util.Scanner;
public class zeros
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0,y=0,cc=0;
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                }
            }
            if(c>cc)
            {
                cc=c;
                y=arr[i];
            }
        }
        System.out.print(y);
    }
}