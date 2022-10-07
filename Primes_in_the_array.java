import java.util.*;
class lo{
    static boolean prime(int n){
        if(n<2)
        return false;
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int[] a=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            a[i]=g.nextInt();
            if(prime(a[i]))
            c+=1;
        }
        System.out.println(c);
    }
}