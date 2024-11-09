import java.util.Scanner;

class User {
    String id;
    int level;

    public User() {
        this.id = "";
        this.level = 0;
    }

    public User(String id, int level) {
        this.id = id;
        this.level = level;
    }
};

public class Main {
    public static void main(String[] ars) {
        Scanner sc = new Scanner(System.in);

        // 초깃값을 이용하여 첫 번째 User 객체를 만들어 줍니다.
        User user1 = new User();

        // 값을 변경합니다.
        user1.id = "codetree";
        user1.level = 10;

        // 변수 선언 및 입력
        String id2 = sc.next();
        int level2 = sc.nextInt();

        // 초기값을 이용하여 두 번째 User 객체를 만들어 줍니다.
        User user2 = new User();

        // 값을 변경합니다.
        user2.id = id2;
        user2.level = level2;

        // 결과를 출력합니다.
        System.out.println("user " + user1.id + " lv " + user1.level);
        System.out.println("user " + user2.id + " lv " + user2.level);
    }
}