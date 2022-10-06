import java.util.*;
class Sum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int c=0;
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            c=c+i;
        }
        System.out.printf("%d",c);
    }
}
