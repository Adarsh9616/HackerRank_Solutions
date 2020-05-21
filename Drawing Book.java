import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) 
    {
        int ans1=-1;int ans2=-1;
        if(p==1)
        {
            return 0;
        }
        if(n%2==0)
        {
            if(p==n)
            {
                return 0;
            }
            ans1=p/2;
            ans2=(n-p+1)/2;
        }
        else
        {
            if(p==n||p==n-1)
            {
                return 0;
            }
            ans1=p/2;
            ans2=(n-p)/2;

        }
        return (int)Math.min(ans1,ans2);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
