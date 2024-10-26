import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 n과 배열을 입력받습니다.
        int n = sc.nextInt();
        int[] arr = new int[100];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        // 2가 나온 횟수를 카운트해 줍니다.
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == 2)
                cnt++;

            // 2가 3번째로 등장할 때 그 위치를 출력합니다.
            if(cnt == 3) {
                System.out.print(i + 1);
                break;
            }
        }
    }
}