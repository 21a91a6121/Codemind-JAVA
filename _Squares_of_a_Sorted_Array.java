import java.util.*;
public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            if(arr[i]<0) {
                arr[i] = arr[i]*-1;
            }
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++) {
            System.out.format("%d ",arr[i]*arr[i]);
        }
        sc.close();
    }
}