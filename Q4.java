/*Take as input N, the size of an array. Take N more inputs and store that in an array. Take another number’s input as M. Write a function which returns the index on which M is found in an array, in case M is not found -1 is returned. Print the value returned.
1.It reads a number N.
2.Take Another N numbers as an input and store them in an Array.
2.Take another number M as an input.
3.If M is found in the Array the index of M is returned else -1 is returned and print the value returned.*/
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			// Your Code Here
		}
		int item=sc.nextInt();
		System.out.print(Index(arr,item));
    }
	public static int Index(int[] arr,int item){
		for(int i=0;i<arr.length;i++){
			if(item==arr[i]){
				return i;
			}
		}
		return -1;
	}
}
