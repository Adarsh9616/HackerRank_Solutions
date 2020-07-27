import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countSwaps function below.
    static void countSwaps(int[] ar) 
    {
        int n=ar.length;
        //int b[]=Arrays.copyOf(a,a.length);
        int c=0;
        for (int i = 0; i < n; i++) 
        {
        
            for (int j = 0; j < n - 1; j++) 
            {
                if (ar[j] > ar[j + 1]) 
                {
                    c++;
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        
        }
        System.out.println("Array is sorted in "+c+" swaps.");
        System.out.println("First Element: "+ar[0]);
        System.out.println("Last Element: "+ar[n-1]);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

        scanner.close();
    }
}
