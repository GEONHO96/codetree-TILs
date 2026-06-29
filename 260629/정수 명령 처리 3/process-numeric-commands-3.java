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
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();
        while (N-- > 0) {
            String[] command = br.readLine().split(" ");
            if (command[0].equals("push_front")) {
                int num = Integer.parseInt(command[1]);
                dq.addFirst(num);
            } else if (command[0].equals("push_back")) {
                int num = Integer.parseInt(command[1]);
                dq.addLast(num);
            } else if (command[0].equals("pop_front")) {
                bw.write(dq.pollFirst() + "\n");
            } else if (command[0].equals("pop_back")) {
                bw.write(dq.pollLast() + "\n");
            } else if (command[0].equals("size")) {
                bw.write(dq.size() + "\n");
            } else if (command[0].equals("empty")) {
                if (dq.isEmpty()) bw.write("1\n");
                else bw.write("0\n");
            } else if (command[0].equals("front")) {
                bw.write(dq.peekFirst() + "\n");
            } else if (command[0].equals("back")) {
                bw.write(dq.peekLast() + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}