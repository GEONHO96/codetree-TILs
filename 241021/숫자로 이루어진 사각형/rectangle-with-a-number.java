import java.util.Scanner;

public class Main {

    public static void printSquare(int N) {
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                cnt += 1;
                if (cnt == 10) {
                    cnt = 1;
                }
                System.out.print(cnt + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printSquare(N);
    }
}