import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static final int MAX_N = 100;

    public static int n;
    public static int[] a = new int[MAX_N];
    public static int[] b = new int[MAX_N];

    public static boolean equal() {
        // n개의 원소를 순서대로 봤을 때
        // 전부 동일한 경우에만 일치합니다.
        // 단 하나라도 다르다면, false입니다.
        for(int i = 0; i < n; i++)
            if(a[i] != b[i])
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        n = sc.nextInt();

        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for(int i = 0; i < n; i++)
            b[i] = sc.nextInt();

        // 정렬
        Arrays.sort(a, 0, n);
        Arrays.sort(b, 0, n);

        // 수열이 일치하는지 확인합니다.
        if(equal())
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}