/*Take as input N, the size of array. Take N more inputs and store that in an array. Write a function that reverses the array. Print the values in reversed array.
1.It reads a number N.
2.Take Another N numbers as input and store them in an Array.
3.Reverse the elements in the Array.
4.Print the reversed Array.*/
import java.util.*;
public class Main{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Reverseno(arr);
        for (int j : arr) {
            System.out.print(j + " ");
			System.out.println();
        }
    }
    public static void Reverseno(int[] arr){
        int i=0;
        int j=arr.length-1;
       while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
