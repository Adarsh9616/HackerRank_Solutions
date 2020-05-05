import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int j=0;j<t;j++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            long sum=a;
            for(int i=0;i<n;i++)
            {
                sum=sum+(long)Math.pow(2,i)*b;

                System.out.print(sum+" ");
            }
            System.out.println();
        }

        in.close();
    }
}
