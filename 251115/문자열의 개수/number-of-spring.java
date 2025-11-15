import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        while (true) {
            String str = br.readLine();
            if (str.equals("0")) {
                break;
            } else {
                cnt++;                
            }
            sb.append(str + " ");
        }
        bw.write(String.valueOf(cnt) + "\n");
        String[] newStr = sb.toString().split(" ");
        for (int i = 0; i < newStr.length; i++) {
            if (i % 2 == 0) bw.write(newStr[i] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}