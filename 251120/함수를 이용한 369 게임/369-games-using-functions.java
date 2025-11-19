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
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int cnt = 0;
        for (int i = A; i <= B; i++) {
            if (i % 3 == 0) cnt++;
            String S = String.valueOf(i);
            int length = S.length();
            for (int j = 0; j < length; j++) {
                if (S.charAt(j) == '3' || S.charAt(j) == '6' || S.charAt(j) == '9') cnt++;
            }
            for (int j = 0; j < length; j++) {
                if ((S.charAt(j) == '3' || S.charAt(j) == '6' || S.charAt(j) == '9') && (i % 3 == 0)) cnt--;
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}