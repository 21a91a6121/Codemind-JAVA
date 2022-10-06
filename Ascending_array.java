import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int[] a=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            a[i]=g.nextInt();
            if(i>0){
                if(a[i]>a[i-1]){
                    c=1;
                }
                else{
                    c=0;
                    break;
                }
            }
        }
        if(c==0){
            System.out.print("no");
        }
        else{
            System.out.print("yes");
        }
    }
}