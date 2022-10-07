import java.util.*;
class Prime 
{
    static boolean is_prime(int n)
    {
        for(int i=2;i<=(int)Math.sqrt(n);i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        int n;
        int c=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        int k;
        k = sc.nextInt();
        for(int i=0;i<n;i++) {
            if(a[i]>=k) {
               if(is_prime(a[i])) {
                   c+=1;
               } 
            }
        }
        System.out.printf("%d",c);
    }
}