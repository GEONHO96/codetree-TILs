import java.util.Scanner;

public class Main {

    public static boolean operation(char o) {
        if (o == '+' || o == '-' || o == '/' || o == '*') {
            return true;
        } else {
            return false;
        }
    }

    public static String operationFunction(int a, char o, int c) {
        if (operation(o)) {
            if (o == '+') {
                return Integer.toString(a + c);
            }
            if (o == '-') {
                return Integer.toString(a - c);
            }
            if (o == '/') {
                return Integer.toString(a / c);
            }
            if (o == '*') {
                return Integer.toString(a * c);
            }
        } else {
            return "False";
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        System.out.println(operationFunction(a, o, c));
    }
}