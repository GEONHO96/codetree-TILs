import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[10];
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            str[i] = sc.next();
        }
        char ch1 = sc.next().charAt(0);
        for (int i = 0; i < 10; i++) {
            char ch2 = str[i].charAt(str[i].length() - 1);
            if (ch1 == ch2) {
                System.out.println(str[i]);
                cnt++;
            }
        }
        if (cnt == 0) System.out.println("None");
    }
}