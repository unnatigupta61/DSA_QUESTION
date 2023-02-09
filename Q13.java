/*Take the following as input.
A number (N1)
A number (N2)
Write a function which prints first N1 terms of the series 3n + 2 which are not multiples of N2.*/
import java.util.*;
public class Main 
{
public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int x= 3*i+2;
            if(x%n1!=0)
            {
                System.out.println(x);
            }
            else
            {
                n++;
            }
        }
}
}
