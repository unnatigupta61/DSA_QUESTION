/*Take as input N, the size of array. Take N more inputs and store that in an array. Take as input a number M. Write a function which returns the index on which M is found in the array, in case M is not found -1 is returned. Print the value returned.You can assume that the array is sorted, but you’ve to optimize the finding process. For an array of size 1024, you can make 10 comparisons at maximum.
1.It reads a number N.
2.Take Another N numbers as input in Ascending Order and store them in an Array.
3.Take Another number M as input and find that number in Array.
4.If the number M is found, index of M is returned else -1 is returned.Print the number returned.*/
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int m=sc.nextInt();
Index(arr,m);
}
public static void Index(int[] arr,int m){
int low=0;
int high= arr.length-1;
int mid = (low + high) / 2;
while(low<=high) {
            mid=(low+high)/2;
if(m>arr[mid]){
low=mid+1;
}else if(m==arr[mid]){
System.out.println(mid);
break;
}else{
high=mid-1;
}
}
        if(low>high){
            System.out.println("-1");
        }
}
}
