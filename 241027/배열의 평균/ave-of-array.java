import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][4];
        int allSum = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += arr[i][j];
            }
            double avg = (double) sum / 4;
            System.out.print(avg + " ");
        }
        System.out.println();

        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j < 2; j++) {
                sum += arr[j][i];
            }
            double avg = (double) sum / 2;
            System.out.print(avg + " ");
        }
        System.out.println();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                allSum += arr[i][j];
            }
        }

        double allAvg = (double) allSum / 8;
        System.out.printf("%.1f", allAvg);
    }
}