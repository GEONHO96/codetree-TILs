import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        Set<Integer> set = new TreeSet<>();
        int subtract = 0;
        int min = Integer.MAX_VALUE;
        int i = 0, j = 0;
        while (i < N && j < N) {
            int diff = arr[j] - arr[i];
            if (diff < M) {
                j++;
            } else {
                min = Math.min(min, diff);
                i++;
            }
        }
        if (min == Integer.MAX_VALUE) {
            bw.write("-1\n");
        } else {
            bw.write(min + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}