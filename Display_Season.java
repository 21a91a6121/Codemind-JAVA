import java.util.*;
class Season
{
    public static void Month(int num)
    {
        if(num==4||num==5|| num==6)
        {
            System.out.printf("Summer");
        }
        else if(num==7||num==8||num==9||num==10)
        {
            System.out.printf("Rainy");
        }
        else if(num==11||num==12||num==1)
        {
            System.out.printf("Winter");
        }
        else if(num==2||num==3)
        {
            System.out.printf("Spring");
        }
        else
        {
            System.out.printf("-1");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        Season.Month(n);
    }
}