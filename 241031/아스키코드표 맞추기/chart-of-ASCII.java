import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 숫자 5개를 입력받습니다.
        int[] a = new int[5];
        for(int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        // 주어진 값에 해당하는 아스키코드의 문자를 출력합니다.
        for(int i = 0; i < 5; i++) {
            System.out.print((char)a[i] + " ");
        }
    }
}