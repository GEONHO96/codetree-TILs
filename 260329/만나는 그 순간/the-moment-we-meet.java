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
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int coordinateA = 0;
        int coordinateB = 0;
        int common = -1;
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            String direction = input[0];
            int seconds = Integer.parseInt(input[1]);
            if (direction.equals("R")) coordinateA += seconds;
            if (direction.equals("L")) coordinateA -= seconds;
        }
        for (int i = 0; i < M; i++) {
            String[] input = br.readLine().split(" ");
            String direction = input[0];
            int seconds = Integer.parseInt(input[1]);
            if (direction.equals("R")) coordinateB += seconds;
            if (direction.equals("L")) coordinateB -= seconds;
        }
        bw.write(String.valueOf(common));
        bw.flush();
        bw.close();
        br.close();                
    }
}