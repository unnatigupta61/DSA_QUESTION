/*Raj is a very smart kid who recently started learning computer programming. 
His coach gave him a cyclic array A having N numbers, and he has to perform Q operations on this array. 
In each operation the coach would provide him with a number X. 
After each operation, every element of the cyclic array would be replaced by the sum of itself and the element lying X positions behind it in the cyclic array. All these replacements take place simultaneously. 
For example, if the cyclic array was [a, b, c, d], then after the operation with X = 1, the new array would be [a+d, b+a, c+b, d+c]. 
He needs to output the sum of the elements of the final array modulus 10^9+7. He made a program for it but it's not very efficient. 
You know he is a beginner, so he wants you to make an efficient program for this task because he doesn't want to disappoint his coach.*/


import java.util.*;
public class Main {
public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        int q=sc.nextInt();
        int[] aq=new int[q];
        for(int i=0;i<q;i++){
            aq[i]=sc.nextInt();
            sum*=2;
            sum=sum%(int)(Math.pow(10,9)+7);
        }
        System.out.println(sum);
}
}
