import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 크기가 10인 배열을 구현합니다.
        int[] arr = new int[10];
        int sum = 0;

        // 0부터 9까지의 인덱스에 주어진 수를 차례대로 입력받습니다.
        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        // 입력받은 수들을 sum에 더합니다.
        for(int i = 0; i < 10; i++) {
            sum += arr[i];
        }

        // sum을 출력합니다.
        System.out.println(sum);
    }
}