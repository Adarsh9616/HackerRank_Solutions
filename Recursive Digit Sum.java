import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the superDigit function below.
    static long solve(String s)
    {
        long ans=0;
        
        for(int i=0;i<s.length();i++)
        {
            ans=ans+Long.parseLong(""+s.charAt(i));
        }
        if(s.length()==1)
        {
            return ans;
        }
        String st=String.valueOf(ans);

        return solve(st);
        


    }
    static long superDigit(String n, int k) 
    {
        String st="";
        long ans=0;
        for(int i=0;i<n.length();i++)
        {
            ans=ans+Long.parseLong(""+n.charAt(i));
        }
        ans=ans*k;
        st=String.valueOf(ans);
        return solve(st);



    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        String n = nk[0];

        int k = Integer.parseInt(nk[1]);

        long result = superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
