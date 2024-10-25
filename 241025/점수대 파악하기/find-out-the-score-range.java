import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int[] score = new int[11];
        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
            score[(arr[i] / 10)]++;
            if(arr[i] == 0) break;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println((11 - i) * 10 + " - " + score[11 - i]);
        }
    }
}