import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 입력받기
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] countArr = new int[10];
        int ans = 0;
        
        // a가 1 이하가 될 때 까지 나누면서 나머지를 count배열에 저장하기
        while(a > 1) {
            countArr[a % b]++;
            a /= b;
        }
        
        // 나머지가 나온 횟수를 구해 정답 구하기
        for(int i = 0; i < b; i++) {
            ans += countArr[i] * countArr[i];
        }
        
        // 출력
        System.out.print(ans);
    }
}