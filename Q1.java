//Take N as input. Print all prime numbers from 2 to N.
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact;
		for(int i=2; i<=n; i++)
		{
			fact=0;
			for(int j=2; j<=i; j++)
			{
				if(i%j==0)
				{
				fact++;
				}
			}	
			if(fact==1){
				System.out.println(i);
			}
		}// Your Code Here
    }
}
