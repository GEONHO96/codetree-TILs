import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch1 = sc.next().charAt(0);
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch2 = str.charAt(i);
            if (ch1 == ch2) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}