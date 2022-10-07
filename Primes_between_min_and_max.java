import java.util.*;
class Love{
    public static int is_prime(int n){
        if(n==1){
            return 0;
        }
        else{
            int c = 0;
            for(int i = 2; i <=n/2;i++){
                if(n%i==0){
                    c++;
                }
            }
            if(c==0){
                return 1;
            }
            else{
                return 0;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int min=arr[0],max=arr[0],mini=0,maxi=0,count=0;
        for(int i=0;i<n;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
                mini=i;
            }
            if(max<arr[i])
            {
                max=arr[i];
                maxi=i;
            }
        }
        if(mini<maxi)
        {
            for(int i=mini;i<=maxi;i++)
            {
                if(is_prime(arr[i])==1)
                {
                    count++;
                }
            }
        }
        else
        {
            for(int i=maxi;i<=mini;i++)
            {
                if(is_prime(arr[i])==1)
                {
                    count++;
                }
            }
        }
        System.out.format("%d",count);
    }
}