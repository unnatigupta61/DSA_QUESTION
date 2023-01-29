/*You are provided two sorted arrays. You need to find the maximum length of bitonic subsequence.
You need to find the sum of the maximum sum path to reach from beginning of any array to end of any of the two arrays. 
You can switch from one array to another array only at common elements.*/
import java.util.*;
public class Main{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
int n=sc.nextInt();
int n2=sc.nextInt();
int[] arr1=new int[n];
for(int i=0;i<n;i++){
arr1[i]=sc.nextInt();
}
int[] arr2=new int[n2];
for(int j=0;j<n2;j++){
arr2[j]=sc.nextInt();
}
Array(arr1,arr2);
}
}
public static void Array(int[] a,int[] b){
int n1=a.length;
int n2=b.length;
int sum1=0, sum2=0;
int i=0;
int j=0;
int r=0;
while(i<n1 && j<n2) {
if (a[i] < b[j]) {
sum1 += a[i++];

} else if(a[i] > b[j]){
sum2 += b[j++];

}else{
r+=Math.max(sum1,sum2);
r+=a[i];
sum1=0;
sum2=0;

i++;
j++;
}
}
while(i<n1)
sum1+=a[i++];

while(j<n2)
sum2+=b[j++];

r+=Math.max(sum1,sum2);
System.out.println(r);
}
}
