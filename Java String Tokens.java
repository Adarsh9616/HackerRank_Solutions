import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String div="[ _'@.,?!]+";
        String ss[]=s.trim().split(div);
        scan.close();
        System.out.println(s.equals("                        ")?0:ss.length);
        for(String item: ss){
        System.out.println(item);
    }
    }
}

