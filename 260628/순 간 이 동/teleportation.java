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
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int min = 0;
        if (A <= B) {
            min = Math.min(Math.min(Math.abs(A - x), Math.abs(A - y)) + Math.min(Math.abs(B - x), Math.abs(B - y)), B - A);
        } else {
            min = Math.min(Math.min(Math.abs(A - x), Math.abs(A - y)) + Math.min(Math.abs(B - x), Math.abs(B - y)), A - B);
        }
        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
        br.close();
    }
}