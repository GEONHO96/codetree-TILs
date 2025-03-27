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
        HashMap<String, Integer> map = new HashMap<>();
        int maxCount = 0;
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            int count = map.getOrDefault(str, 0) + 1;
            map.put(str, count);
            if (count > maxCount) {
                maxCount = count;
            }
        }
        bw.write(maxCount + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}