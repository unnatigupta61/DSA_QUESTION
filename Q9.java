/*You are given an input array whose each element represents the height of a line towers. 
The width of every tower is 1. It starts raining. Water is filled between the gap of towers if possible. 
You need to find how much water filled between these given towers.*/

import java.util.*;
public class Main{
public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int[] l=new int[n];
            int[] r=new int[n];
            l[0]=a[0];
            for(int i=1;i<n;i++){
                l[i]=Math.max(l[i-1],a[i]);
            }
            r[n-1]=a[n-1];
            for(int i=n-2;i>=0;i--){
                r[i]=Math.max(r[i+1],a[i]);
            }
            int ans=0;
            for(int i=0;i<n;i++){
            ans+=(Math.min(l[i],r[i]))-a[i];
            }
            System.out.println(ans);
        }
}
}
