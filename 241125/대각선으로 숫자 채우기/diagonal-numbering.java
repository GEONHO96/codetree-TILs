import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n, m을 입력받습니다.
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int count = 1;

        // 2차원 배열을 구합니다.
        int[][] arr = new int[100][100];

        // Step 1:
        for(int row = 0; row < n; row++) {
            for(int col = 0; col < m; col++)
                // Step 2:
                if(arr[row][col] == 0) {
                    int currCol = col;
                    int currRow = row;

                    while(currCol >= 0 && currRow < n) {
                        arr[currRow][currCol] = count;

                        // 변수 업데이트 : 
                        currRow++;
                        currCol--;
                        count++;
                    }
                }
        }

        // 출력:
        for(int row = 0; row < n; row++) {
            for(int col = 0; col < m; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}