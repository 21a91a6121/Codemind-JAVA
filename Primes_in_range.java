import java.util.*;
class sample{
   boolean  isprime(int n)
    {
        if(n<=1){
            return false;
        }
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
        
    }
public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        sample s=new sample();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int count,pc=0;
        for(int i=a;i<=b;i++){
            if(s.isprime(i)){
                pc++;
            }
        }
        System.out.println(pc);
        
    }
}