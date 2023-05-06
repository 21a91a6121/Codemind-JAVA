import java.util.*;
public class Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++) {
            c=0;
            for(int j=0;j<n;j++) {
                if(arr[i]>arr[j]) {
                    c+=1;
                }
            }
            System.out.print(c+" ");
        }
    }
}