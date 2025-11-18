import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine();
        int N = S.length();
        String T = br.readLine();
        int M = T.length();
        int idx = -1;
        for (int i = 0; i < N - M + 1; i++) {
            if (S.substring(i, i + M).equals(T)) {
                idx = i;
                break;
            } 
        }
        bw.write(String.valueOf(idx));
        bw.flush();
        bw.close();
        br.close();
    }
}