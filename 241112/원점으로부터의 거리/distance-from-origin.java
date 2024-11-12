import java.util.Arrays;
import java.util.Scanner;

class Point implements Comparable<Point> {
    int dist;
    int index;
    
    public Point(int dist, int index){
        this.dist = dist;
        this.index = index;
    }
    
    @Override
    public int compareTo(Point point) {
        // dist가 작으면 정렬 했을 때 앞에 와야 합니다.
        if(dist != point.dist)
            return dist - point.dist;
        // index가 작으면 정렬 했을 때 앞에 와야 합니다.
        return index - point.index;
    }
}

public class Main {
    public static final int MAXN = 1000;
    
    // 원점과의 거리를 계산하는 함수입니다.
    public static int getDistFromOrigin(int x, int y) {
        return Math.abs(x) + Math.abs(y);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Point[] point = new Point[MAXN];
        
        int x, y;
        for(int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            
            // 원점과의 거리와 index를 저장합니다.
            point[i] = new Point(getDistFromOrigin(x, y), i + 1);
        }
        
        Arrays.sort(point, 0, n);
        
        for(int i = 0; i < n; i++)
            System.out.println(point[i].index);
    }
}