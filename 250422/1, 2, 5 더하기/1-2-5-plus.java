import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        long [] dp = new long[N + 1];
        dp[0] = 1;
        for (int i = 1; i <= N; i++) {
            if (i >= 1) dp[i] += dp[i - 1];
            if (i >= 2) dp[i] += dp[i - 2];
            if (i >= 5) dp[i] += dp[i - 5];
        }
        dp[N] %= 10007;
        bw.write(dp[N] + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}