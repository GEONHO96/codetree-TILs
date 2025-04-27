import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            set.add(arr[i]);
        }
        int[] newArr = set.stream().mapToInt(Integer::intValue).toArray();
        for (int i = newArr.length - 1; i >= newArr.length - K; i--) {
            bw.write(newArr[i] + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}