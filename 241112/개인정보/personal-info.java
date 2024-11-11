import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Person {
    String name;
    int height;
    double weight;
    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] person = new Person[5];
        for (int i = 0; i < 5; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();
            person[i] = new Person(name, height, weight);
        }

        Comparator<Person> nameComparator = new Comparator<Person>() {
            public int compare(Person person1, Person person2) {
                return person1.name.compareTo(person2.name);
            }
        };

        Comparator<Person> heightComparator = new Comparator<Person>() {
            public int compare(Person person1, Person person2) {
                return person2.height - person1.height;
            }
        };

        Arrays.sort(person, nameComparator);

        System.out.println("name");
        for (int i = 0; i < 5; i++) {
            System.out.println(person[i].name + " " + person[i].height + " " + person[i].weight);
        }

        System.out.println();

        Arrays.sort(person, heightComparator);

        System.out.println("height");
        for (int i = 0; i < 5; i++) {
            System.out.println(person[i].name + " " + person[i].height + " " + person[i].weight);
        }
    }
}