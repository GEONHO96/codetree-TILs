import java.util.Scanner;

class User {
    String userId;
    int level;

    public User(String userId, int level) {
        this.userId = userId;
        this.level = level;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userId = sc.next();
        int level = sc.nextInt();
        User user1 = new User(userId, level);
        User user2 = new User("codetree", 10);
        System.out.println("user " + user2.userId + " lv " + user2.level);
        System.out.println("user " + user1.userId + " lv " + user1.level);
    }
}