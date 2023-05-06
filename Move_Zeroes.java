import java.util.Scanner;
public class Move_zeroes
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int c=0;
        for(int k:arr)
            if(k==0)
                c++;
        for(int k:arr)
            if(k!=0)
            System.out.print(k+" ");
        for(int i=0;i<c;i++)
            System.out.print(0+" ");
    }
}