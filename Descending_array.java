import java.util.Scanner;
import java.lang.Math;
class palindrome
{
    public static void main(String args[])
    {
        int n,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                count=1;
                break;
            }
        }
        if(count==0)
        System.out.println("yes");
        else
        System.out.println("no");
        sc.close();
    }
}