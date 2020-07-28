import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution implements Comparator<int[]>{

    public int compare(int a[],int b[])
    {
        if(a[0]==b[0])
        {
            return b[1]-a[1];
        }
        else
        {
            return a[0]-b[0];
        }
    }
    static long buyMaximumProducts(int n, long k, int[] a) 
    {
        int ar[][]=new int[a.length][2];
        long count=0;
        for(int i=0;i<a.length;i++)
        {
            ar[i][0]=a[i];
            ar[i][1]=i+1;
        }
        Arrays.sort(ar,new Solution());
        for(int i=0;i<a.length&&k>=0;i++)
        {
            int sum=ar[i][0]*ar[i][1];
            if(k-ar[i][0]*ar[i][1]>0)
            {
                k=k-ar[i][0]*ar[i][1];
                count=count+ar[i][1];
            }
            else
            {
                long m=k/(long)ar[i][0];
                k=k-ar[i][0]*m;
                count=count+m;
            }
            //count=count+ar[i][1];
        }
        return count;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        long k = in.nextLong();
        long result = buyMaximumProducts(n, k, arr);
        System.out.println(result);
        in.close();
    }
}