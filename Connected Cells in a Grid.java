import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solve(int ar[][],int i,int j,int n,int m)
    {
        if(i<0||j<0||i>=n||j>=m)
        {
            return 0;
        }
        if(ar[i][j]==0)
        {
            return 0;
        }
        ar[i][j]=0;
        int size=1;
        size+=solve(ar,i+1,j,n,m);
        size+=solve(ar,i-1,j,n,m);
        size+=solve(ar,i,j+1,n,m);
        size+=solve(ar,i,j-1,n,m);
        size+=solve(ar,i+1,j+1,n,m);
        size+=solve(ar,i-1,j-1,n,m);
        size+=solve(ar,i+1,j-1,n,m);
        size+=solve(ar,i-1,j+1,n,m);
        return size;

    }
    // Complete the connectedCell function below.
    static int connectedCell(int[][] ma) 
    {
        int n=ma.length;
        int m=ma[0].length;
        int max=-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(ma[i][j]==1)
                {
                    int k=solve(ma,i,j,n,m);
                    max=Math.max(max,k);

                }
            }
        }
        return max;



    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] matrixRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < m; j++) {
                int matrixItem = Integer.parseInt(matrixRowItems[j]);
                matrix[i][j] = matrixItem;
            }
        }

        int result = connectedCell(matrix);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
