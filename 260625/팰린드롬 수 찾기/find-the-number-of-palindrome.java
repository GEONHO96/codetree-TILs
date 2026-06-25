import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int cnt = 0;
        for (int i = X; i <= Y; i++) {
            boolean satisfied = true;
            String S = String.valueOf(i);
            int length = S.length();
            for (int j = 0; j < length; j++) {
                if (S.charAt(j) != S.charAt(length - 1- j)) {
                    satisfied = false;
                }                                                
            }
            if (satisfied) cnt++;
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}