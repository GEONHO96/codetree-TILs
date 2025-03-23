import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class Main {
    static List<List<Integer>> network = new ArrayList<>();
    static boolean[] visited;
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for (int i = 0; i <= N; i++) {
            network.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            network.get(x).add(y);
            network.get(y).add(x);
        }
        visited = new boolean[N + 1];
        dfs(1);
        bw.write(String.valueOf(count - 1));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
    public static void dfs(int current) {
        visited[current] = true;
        count++;
        for (int next : network.get(current)) {
            if (!visited[next]) {
                visited[next] = true;
                dfs(next);
            }
        }
    }
}