import java.util.*;
public class Position {
    public static void firstPos(int n,int[] arr,int num) {
        int pos;
        int s=0;
        for(int i=0;i<n;i++) {
            if(arr[i]==num) {
                System.out.print(i + " ");
                break;
            } else {
                s++;
            }
        }
        if(s==n) {
            System.out.print(-1+" ");
        }
    }
    public static void lastPos(int n,int[] arr,int num) {
        int pos;
        int s = 0;
        for(int i=n-1;i>=0;i--) {
            if(arr[i]==num) {
                System.out.print(i + " ");
                break;
            } else {
               s++;
            }
        }
        if(s==n) {
            System.out.print(-1+" ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        firstPos(size,arr,num);
        lastPos(size,arr,num);
    }
}