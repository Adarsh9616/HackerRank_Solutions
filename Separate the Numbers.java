import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the separateNumbers function below.
    static void separateNumbers(String s)
    {
        boolean valid = false;
        long firstx = -1;
        // Try each possible starting number
        for (int i=1; i<=s.length()/2; ++i) 
        {
            long x = Long.parseLong(s.substring(0,i));
            firstx = x;
           // Build up sequence starting with this number
            String test = Long.toString(x);
            while (test.length() < s.length()) {
                test += Long.toString(++x);
            }
            // Compare to original
            if (test.equals(s)) {
                valid = true;
                break;
            }
        }
        System.out.println(valid ? "YES " + firstx : "NO");


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            separateNumbers(s);
        }

        scanner.close();
    }
}
