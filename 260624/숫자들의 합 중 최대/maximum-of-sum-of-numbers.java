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
        int max = 0;
        for (int i = X; i <= Y; i++) {
            String S = String.valueOf(i);
            int length = S.length();
            int sum = 0;
            for (int j = 0; j < length; j++) {
                sum += Integer.parseInt(String.valueOf(S.charAt(j)));                                                          
            }
            max = Math.max(sum, max);            
        }
        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
        br.close();
    }
}