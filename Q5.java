/*A ticket for one ride on some rickshaw or cab. It costs c1 ruppees;
A ticket for an unlimited number of rides on some rickshaw or on some cab. It costs c2 ruppees;
A ticket for an unlimited number of rides on all rickshaws or all cabs. It costs c3 ruppees;
A ticket for an unlimited number of rides on all rickshaws and cabs. It costs c4 ruppees.
Ramu knows for sure the number of rides he is going to make and the transport he is going to use. He asked you for help to find the minimum sum of ruppees he will have to spend on the tickets.
Input Format
Each Test case has 4 lines which are as follows:
The first line contains four integers c1, c2, c3, c4 (1 ≤ c1, c2, c3, c4 ≤ 1000) — the costs of the tickets.
The second line contains two integers n and m (1 ≤ n, m ≤ 1000) — the number of rickshaws and cabs Ramu is going to use.
The third line contains n integers ai (0 ≤ ai ≤ 1000) — the number of times Ramu is going to use the rickshaw number i.
The fourth line contains m integers bi (0 ≤ bi ≤ 1000) — the number of times Ramu is going to use the cab number i.*/

import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int c1=sc.nextInt();
            int c2=sc.nextInt();
            int c3=sc.nextInt();
            int c4=sc.nextInt();
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] ai=new int[n];
            for(int i=0;i<n;i++){
                ai[i]=sc.nextInt();
            }
            int[] bi=new int[m];
            for(int i=0;i<m;i++) {
                bi[i] = sc.nextInt();
            }
            System.out.print(TC(ai,bi,c1,c2,c3,c4,n,m));
        }
    }
    public static int TC(int[] ai,int[] bi,int c1,int c2,int c3,int c4,int n,int m ){
        int co1=0,co3=0,co4;
        for (int i=0;i<ai.length;i++){
            co1+=(Math.min(ai[i]*c1,c2));
        }
        co3=Math.min(co1,c3);
        co1=0;
        for (int i=0;i<bi.length;i++){
            co1+=(Math.min(bi[i]*c1,c2));
        }
        co3+=Math.min(co1,c3);
        co4=Math.min(co3,c4);
        return co4;
    }
}
