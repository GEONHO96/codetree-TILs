import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String[] parts = br.readLine().split(" ");
            String cmd = parts[0];
            if (cmd.equals("add")) {
                int key = Integer.parseInt(parts[1]);
                int value = Integer.parseInt(parts[2]);
                map.put(key, value);
            } else if (cmd.equals("find")) {
                int key = Integer.parseInt(parts[1]);
                if (map.containsKey(key)) {
                    bw.write(map.get(key) + "\n");
                } else {
                    bw.write("None\n");
                }
            } else if (cmd.equals("remove")) {
                int key = Integer.parseInt(parts[1]);
                map.remove(key);
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}