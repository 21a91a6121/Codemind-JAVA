import java.util.*;
public class Profit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(arr[i]<arr[j] && (arr[j]-arr[i])>max) {
                    max = arr[j]-arr[i];
                }
            }
        }
        System.out.print(max);
    }
}