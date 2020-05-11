import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Solution {

    public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
       String a=sc.next();
       String b=sc.next();
       BigInteger x=new BigInteger(a);
       BigInteger y=new BigInteger(b);
       System.out.println(x.add(y));
       System.out.println(x.multiply(y));
    }
}
