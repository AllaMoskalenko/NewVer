import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//string in revers order
public class Test2 {
    public static void main (String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write your string: ");
        String str = reader.readLine();
        char[] c = new char[str.length()];
        c = str.toCharArray();
        System.out.println("Reversed string:");
        for (int i = str.length()-1; i>=0; i--) System.out.print(c[i]);
    }
}
