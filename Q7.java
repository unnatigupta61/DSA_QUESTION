/*Take as input N, the size of array. Take N more inputs and store that in an array.
Take as input “target”, a number. 
Write a function which prints all triplets of numbers which sum to target.*/
import java.util.*;
public class Main{
public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        Arrays.sort(arr);
        Sum(arr,x);

}
    public static void Sum(int[] arr,int x){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    sum= arr[i]+arr[j]+arr[k];
                    if(sum==x){
                        System.out.println();
                        System.out.print(arr[i]+", "+ arr[j]+" and "+arr[k]);
                    }
                }
            }
        }
    }
}
