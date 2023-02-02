//2-Take N (number in binary format). Write a function that converts it to decimal format and Print the value returned.
import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//int s= n.length();
		int c=0;
		int mul=1;
		while(n>0){
			int a=n%10;
			int y= a*mul;
			c+=y;
			mul*=2;
			n/=10;
			
		}
		System.out.println(c);
    }
}
