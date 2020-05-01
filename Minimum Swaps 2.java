import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) 
    {
        Map<Integer,Integer> m=new HashMap<Integer,Integer>();
        for(int i=1;i<=arr.length;i++)
        {
            m.put(i,new Integer(arr[i-1]));
        }
        boolean visited[]=new boolean[arr.length+1];
        int count =0;
        for(int i=1;i<=m.size();i++)
        {
            int nextnode;
            if(visited[i]==false)
            {
                visited[i]=true;
                if(i==m.get(i))
                {
                    continue;
                }
                else
                {
                    int c=m.get(i);
                    while(!visited[c])
                    {
                        visited[c]=true;
                        nextnode=m.get(c);
                        c=nextnode;
                        count++;
                    }
                }
            }


        }

        return count; 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
