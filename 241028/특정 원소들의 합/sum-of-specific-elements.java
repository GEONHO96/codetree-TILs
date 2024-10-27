import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        int sum = 0;
        int[][] arr = new int[4][4];
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < 4; i++) {
            for (j = 0; j <= i; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}