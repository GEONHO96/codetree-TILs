import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Person {
    String name;
    int height;
    int weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] person = new Person[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            person[i] = new Person(name, height, weight);
        }

        Arrays.sort(person, new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b) {
                return a.height - b.height;
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.print(person[i].name + " " + person[i].height + " ");
            System.out.println(person[i].weight);
        }
    }
}