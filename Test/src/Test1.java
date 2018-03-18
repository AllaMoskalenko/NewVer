//factorial

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your number: ");
        int n;
        n = Integer.parseInt(reader.readLine());
        System.out.println("Faktorial = " + factorial(n));
    }

    public static int factorial(int n){
    if (n==0) return 1;
    else n = n * factorial(n-1);
    return n;
    }
}