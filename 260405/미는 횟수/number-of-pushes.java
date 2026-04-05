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
        String B = br.readLine();
        int length = A.length();
        int cnt = 0;
        while (!B.equals(A)) {
            A = A.substring(length - 1) + A.substring(0, length - 1);
            cnt++;
            if (B.equals(A)) {
                break;
            } else if (!B.equals(A) && cnt == length) {
                cnt = -1;
                break;
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}