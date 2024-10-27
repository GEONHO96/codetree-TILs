import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언:
        int n;
        
        // 입력:
        n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++)
            A[i] = sc.nextInt();
        
        // 내림차순으로 정렬합니다.
        Integer[] A2 = Arrays.stream(A).boxed().toArray(Integer[]::new);
        Arrays.sort(A2, Collections.reverseOrder());
        
        //  출력:
        System.out.print(A2[0] + " " + A2[1]);
    }
}