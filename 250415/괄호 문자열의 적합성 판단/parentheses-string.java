import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String string = br.readLine();
        Stack<Character> stack = new Stack<>();
        for (char c : string.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == '(' && c == ')') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        if (stack.isEmpty()) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
