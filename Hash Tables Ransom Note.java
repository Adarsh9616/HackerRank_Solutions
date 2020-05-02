import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] m, String[] n) 
    {
        int f=0;
        HashMap<String,Integer> h=new HashMap<String,Integer>();
        for(int i=0;i<m.length;i++)
        {
            if(h.containsKey(m[i]))
            {
                int k=h.get(m[i]);
                k++;
                h.replace(m[i],k);
            }
            else
            {
                h.put(m[i],1);
            }
            
        }
        for(int i=0;i<n.length;i++)
        {
            String s=n[i];
            if(h.containsKey(n[i]) && h.get(n[i])>0)
            {
                int k=h.get(n[i]);
                k--;
                h.replace(n[i],k);
            }
            else
            {
                f=1;
                break;
            }
        }
        if(f==1)
        {
            System.out.println("No");
        }
        else
        {
            System.out.println("Yes");
        }
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
