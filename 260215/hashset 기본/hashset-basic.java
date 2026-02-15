import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashSet<Integer> s = new HashSet<>();
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            String[] input = br.readLine().split(" ");
            String command = input[0];
            int x = Integer.parseInt(input[1]);
            if (command.equals("add")) {
                s.add(x);
            } else if (command.equals("remove")) {
                s.remove(x);
            } else if (command.equals("find")) {
                if (s.contains(x)) bw.write("true\n");
                else bw.write("false\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}