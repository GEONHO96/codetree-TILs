import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> dq = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            dq.addLast(i);            
        }
        while (dq.size() > 1) {
            dq.pollFirst();
            if (dq.size() == 1) break;
            dq.addLast(dq.peekFirst());
            dq.pollFirst();
        }
        bw.write(String.valueOf(dq.peekFirst()));
        bw.flush();
        bw.close();
        br.close();
    }
}