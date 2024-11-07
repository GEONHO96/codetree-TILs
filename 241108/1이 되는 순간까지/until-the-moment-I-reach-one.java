import java.util.Scanner;

public class Main {

    public static int numberToOne(int N) {
        int cnt = 0;
        while (N > 1) {
            if (N % 2 == 0) {
                cnt++;
                N /= 2;
            }
            else if (N % 2 == 1) {
                cnt++;
                N /= 3;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(numberToOne(N));
    }
}