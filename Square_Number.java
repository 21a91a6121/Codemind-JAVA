import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int c=0;
        for(int i=0;i<n+1;i++){
            for(int j=0;j<n+1;j++){
                if(i!=j){
                    if((i*i+j*j)==n){
                        System.out.print("True");
                        c=1;
                        break;
                    }
                }
            }
            if(c==1){
                break;
            }
        }
        if(c==0){
            System.out.print("False");
        }
    }
}