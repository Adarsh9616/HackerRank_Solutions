import java.io.*;
import java.util.*;

public class Solution 
{ 

    static int count=0;
    static void subArray(int ar[],int s,int e)
    {
        int sum=0;
        if(e==ar.length)
        {
            return;
        }
        if(s>e)
        {
            subArray(ar,0,e+1);
        }
        else
        {
            for(int i=s;i<=e;i++)
            {
                sum=sum+ar[i];
            }
            if(sum<0)
            {
                count++;
            }
            subArray(ar,s+1,e);
        }

    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        subArray(ar,0,0);
        System.out.println(count);

      
    }
}
