import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = 0;

        while (N > 0) {
            N /= 2;
            if (N == 0) {
                break;
            }
            x++;
        }
        System.out.println(x);
    }
}