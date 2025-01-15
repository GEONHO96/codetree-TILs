import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            String command = sc.next();
            if (command.equals("push")) {
                int value = sc.nextInt();
                stack.push(value);
            } else if (command.equals("pop")) {
                System.out.println(stack.peek());
                stack.pop();
            } else if (command.equals("size")) {
                System.out.println(stack.size());
            } else if (command.equals("empty")) {
                if (stack.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (command.equals("top")) {
                System.out.println(stack.peek());
            }
        }
    }
}