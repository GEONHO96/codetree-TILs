import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int first = 0;
        int second = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (first < arr[i]) {
                first = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == first) {
                cnt++;
            }
            if (second < arr[i]) {
                if (cnt >= 2) {
                    second = first;
                    break;
                } else {
                    if (arr[i] == first) {
                        continue;
                    } else {
                        second = arr[i];
                    }
                }
            }
        }
        System.out.print(first + " " + second);
    }
}