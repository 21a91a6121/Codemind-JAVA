import java.util.*;
public class Cars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt(); 
        if(a>b) {
            System.out.println(-1);
        } else {
            int cnt = 1;
            int s1 = a;
            int s2 = b;
            while(x+s1>=s2) {
                cnt++;
                s1+=a;
                s2+=b;
            }
            System.out.println(cnt);
        }
    }
}