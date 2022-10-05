import java.util.*;
class swl
{
    static int sum(int n,int arr[],int d)
    {
        if(n<0)
        {
            return d;
        }
        else
        {
            d+=arr[n];
            n-=1;
            return sum(n,arr,d);
        }
        
    }
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        scan.close();
        int d=0;
        int s = sum(n-1,arr,d);
        System.out.print(s);
    }
}