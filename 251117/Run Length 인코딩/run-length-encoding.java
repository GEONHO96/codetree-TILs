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
        int length = A.length();
        int cnt = 1;
        String B = "";
        for (int i = 0; i < length - 1; i++) {            
            if (i == length - 2) B += A.charAt(i) + String.valueOf(cnt + 1);
            else {
                if (A.charAt(i + 1) == A.charAt(i)) cnt++;
                else {
                    B += A.charAt(i) + String.valueOf(cnt);
                    cnt = 1;
                }
            }                                     
        }
        bw.write(String.valueOf(B.length()) + "\n");
        bw.write(B);
        bw.flush();
        bw.close();
        br.close();
    }
}