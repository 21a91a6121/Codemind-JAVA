import java.util.*;
public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int cnt = 0 ,ans = 0;
        for(int i:arr) {
            if(i==1) {
                ans = Math.max(ans,++cnt);
            } else {
                cnt = 0;
            }
        }
        System.out.println(ans);
    }
}