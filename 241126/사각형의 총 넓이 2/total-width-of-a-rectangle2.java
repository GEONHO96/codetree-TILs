import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 직사각형의 개수 입력
        int n = scanner.nextInt();

        // 직사각형의 범위를 저장할 리스트
        List<int[]> rectangles = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            rectangles.add(new int[]{x1, x2});
        }

        // 직사각형의 좌표를 x1 기준으로 정렬
        rectangles.sort(Comparator.comparingInt(a -> a[0]));

        // 겹치지 않는 너비 계산
        int totalWidth = 0;
        int currentStart = rectangles.get(0)[0];
        int currentEnd = rectangles.get(0)[1];

        for (int i = 1; i < n; i++) {
            int nextStart = rectangles.get(i)[0];
            int nextEnd = rectangles.get(i)[1];

            if (nextStart > currentEnd) {
                // 겹치지 않는 경우
                totalWidth += currentEnd - currentStart;
                currentStart = nextStart;
                currentEnd = nextEnd;
            } else {
                // 겹치는 경우, 끝 점을 확장
                currentEnd = Math.max(currentEnd, nextEnd);
            }
        }

        // 마지막 구간 추가
        totalWidth += currentEnd - currentStart;

        // 결과 출력
        System.out.println(totalWidth);

        scanner.close();
    }
}
