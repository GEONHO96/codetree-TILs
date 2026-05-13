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
            if (isValidA(i) || isValidB(i)) cnt++;
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();   
    }
    public static boolean isValidA(int N) {
        boolean satisfied = false;
        if (N % 3 == 0) satisfied = true;
        return satisfied;
    }
    public static boolean isValidB(int N) {
        boolean satisfied = false;
        String K = String.valueOf(N);
        int length = K.length();
        for (int i = 0; i < length; i++) {
            if (K.charAt(i) == '3' || K.charAt(i) == '6' || K.charAt(i) == '9') {
                satisfied = true;
            }
        }
        return satisfied;
    }
}