import java.util.*;
public class Sub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            int s = 0;
            for(int j=i;j<n;j++) {
                s+=arr[j];
                if(max<s) {
                max = s;
            }
            }
        }
        System.out.println(max);
        sc.close();
    }
}