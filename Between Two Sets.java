import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */
     static int gcd(int a,int b)
     {
         if(a==0)
         {
             return b;
         }
          return gcd(b%a,a);
     }
     static int agcd(List<Integer> a)
     {
         int result=a.get(0);
         for(int i=1;i<a.size();i++)
         {
             result=gcd(result,a.get(i));
             if(result==1)
             {
                 return 1;
             }
         }
         return result;

     }
     static int lcm(int a,int b)
     {
         int x=(a*b)/gcd(a,b);
         return x;
     }
     static int alcm(List<Integer> a)
     {
         int result=a.get(0);
         for(int i=1;i<a.size();i++)
         {
             result=lcm(result,a.get(i));
         }
         return result;

     }



    public static int getTotalX(List<Integer> a, List<Integer> b) 
    {
        Collections.sort(a);
        Collections.sort(b);
        int lc=alcm(a);
        int lcc=agcd(b);
        int count=0;
        //System.out.println(lc);
        for(int i=lc;i<=b.get(0);i=i+lc)
        {
            if(lcc%i==0)
            {
                //System.out.println(i);
                count++;
            }
        }
        return count;


    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        String[] brrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> brr = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrTemp[i]);
            brr.add(brrItem);
        }

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
