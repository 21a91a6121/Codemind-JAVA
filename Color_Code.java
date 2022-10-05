import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        char n=s.next().charAt(0);
        n=Character.toUpperCase(n);
        if(n=='V')
        {
            System.out.format("Violet");
        } 
        else if(n=='I')
        {
            System.out.format("Indigo");
        } 
        else if(n=='B')
        {
            System.out.format("Blue");
        } 
        else if(n=='G')
        {
            System.out.format("Green");
        } 
        else if(n=='Y')
        {
            System.out.format("Yellow");
        } 
        else if(n=='O')
        {
            System.out.format("Orange");
        } 
        else if(n=='R')
        {
            System.out.format("Red");
        }
        else
        {
            System.out.format("-1");
        }
    }
}