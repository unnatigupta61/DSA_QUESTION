//Reverse an array
/*Input : 1, 2, 3, 4, 5
Output :5, 4, 3, 2, 1*/
import java.util.*;
public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Reverse(n,arr);

    }
    public static void Reverse(int n, int[] arr){
        int i=0;
        int j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        //System.out.println();
        for (int k=0;k<n;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}
