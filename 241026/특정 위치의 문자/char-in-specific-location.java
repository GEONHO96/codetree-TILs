import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
        char ch = sc.next().charAt(0);
        int cnt = 6;
        for (int i = 0; i < 6; i++) {
            if (arr[i] == ch) {
                System.out.print(i);
            } else {
                cnt--;
            }
            if (cnt == 0) {
                System.out.print("None");
            }
        }
    }
}