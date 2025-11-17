import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] ability = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            ability[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(ability);
        int diff = 0;
        if (ability[2] > ability[3]) {
            diff = Math.abs((ability[0] + ability[3] + ability[5]) - (ability[1] + ability[2] + ability[4]));
        } else {
            diff = Math.abs((ability[0] + ability[2] + ability[5]) - (ability[1] + ability[3] + ability[4]));
        }        
        bw.write(String.valueOf(diff));
        bw.flush();
        bw.close();
        br.close(); 
    }
}