import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) 
    {
        double n=(double)arr.length;
        double p=0,m=0,z=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                p++;

            }
            else if(arr[i]==0)
            {
                z++;
            }
            else
            {
                m++;
            }
        }
        System.out.println(String.format("%.6f",p/n));
        System.out.println(String.format("%.6f",m/n));
        System.out.println(String.format("%.6f",z/n));


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
