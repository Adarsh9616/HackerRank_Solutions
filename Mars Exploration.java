import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the marsExploration function below.
    static int marsExploration(String s) 
    {
        int count=0;
        for(int i=0;i<s.length();i=i+3)
        {
            char S=s.charAt(i);
            char O=s.charAt(i+1);
            char SS=s.charAt(i+2);
            if(S!='S')
            {
                count++;
            }
            if(O!='O')
            {
                count++;
            }
            if(SS!='S')
            {
                count++;
            }

        }
        return count;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
