import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String A = br.readLine();
        String command = br.readLine();
        int length = command.length();
        for (int i = 0; i < length; i++) {
            if (command.charAt(i) == 'L') A = A.substring(1, A.length()) + A.charAt(0);
            if (command.charAt(i) == 'R') A = A.charAt(A.length() - 1) + A.substring(0, A.length() - 1);                        
        }
        bw.write(A);
        bw.flush();
        bw.close();
        br.close();
    }
}