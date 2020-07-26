import java.util.*;

public class Solution {

    static int ar[];
    public static int fibonacci(int n) 
    {
        if(n==0)
        {
            return 0;
        }
      if(n<=1)
      {
          return ar[n];
      }
      if(ar[n]!=0)
      {
          return ar[n];
      }
      ar[n]=fibonacci(n-1)+fibonacci(n-2);
      return ar[n];
      
    }

    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        ar=new int[n+1];
        ar[0]=0;
        ar[1]=1;
        System.out.println(fibonacci(n));
    }
}
