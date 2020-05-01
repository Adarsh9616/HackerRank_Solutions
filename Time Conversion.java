import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) 
    {
        char ch=s.charAt(s.length()-2);
        if(ch=='A')
        {
            String h=""+s.charAt(0)+s.charAt(1);
            if(h.equals("12"))
            {
                return "00"+s.substring(2,s.length()-2);
            }
            else
            {
                return s.substring(0,s.length()-2);
            }

        }
        else
        {
            String h=""+s.charAt(0)+s.charAt(1);
            int a=Integer.parseInt(h);
            h=String.valueOf(a+12);
            if(a==12)
            {
                h=String.valueOf(a);
            }
            return h+s.substring(2,s.length()-2);
        }
        
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
