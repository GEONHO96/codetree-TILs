import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        char[] ch = new char[11];

        for (int i = 1; i <= 10; i++) {
            ch[i] = sc.next().charAt(0);
        }
        for (int i = 1; i <= 10; i++) {
            str += ch[11 - i];
        }
        System.out.print(str);
    }
}