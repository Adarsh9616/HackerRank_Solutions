import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {

    int count = 0;

    if(!password.matches(".*[a-z].*")) {
        count++;
    }

    if(!password.matches(".*[A-Z].*")) {
        count++;
    }

    if(!password.matches(".*[0-9].*")) {
        count++;
    }

    if(password.matches("[a-zA-Z0-9]*")) {
        count++;
    }

    int lengthDifference = 6 - password.length();

    if(lengthDifference > 0 && count <= lengthDifference) {
        return lengthDifference;
    }

    return count;
}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
