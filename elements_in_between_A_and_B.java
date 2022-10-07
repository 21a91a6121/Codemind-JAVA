import java.util.Scanner;
class abd{
    public static void main (String args[])
    {
        int i,n,a,b;
        Scanner sc=new Scanner (System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        a=sc.nextInt();
         b=sc.nextInt();
         int count=0;
         for(i=0;i<n;i++)
         {
             if(a<=x[i]&&x[i]<=b)
             {
                  System.out.print(x[i]+" ");
                  count++;
             }
         }
         if(count==0)
         {
           System.out.println("-1");  
         }
         
    }
}