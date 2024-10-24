import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] score = new double[9];
        double sum = 0.0;
        for (int i = 1; i <= 8; i++) {
            score[i] = sc.nextDouble();
            sum += score[i];
        }
        double avg = sum / 8;
        System.out.printf("%.1f", avg);
    }
}