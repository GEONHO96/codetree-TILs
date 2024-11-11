import java.util.Scanner;
import java.util.Arrays;

// 학생들의 정보를 나타내는 클래스 선언
class Student implements Comparable<Student> {
    int height, weight, number;

    public Student(int height, int weight, int number) {
        this.height = height;
        this.weight = weight;
        this.number = number;
    }

    @Override
    public int compareTo(Student student) {
        // 키가 크면 정렬 했을 때 앞에 와야 합니다.
        if(this.height != student.height)
            return student.height - this.height;
        // 몸무게가 크면 정렬 했을 때 앞에 와야합니다.
        if(this.weight != student.weight)
            return student.weight - this.weight;
        // 번호가 작으면 앞에 와야 합니다.
        return this.number - student.number;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력:
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for(int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();

            // Student 객체를 생성해 리스트에 추가합니다.
            students[i] = new Student(height, weight, i + 1);
        }

        // custom comparator 활용한 정렬
        Arrays.sort(students);

        // 결과를 출력합니다.
        for (int i = 0; i < n; i++){
            System.out.print(students[i].height + " ");
            System.out.print(students[i].weight + " ");
            System.out.println(students[i].number);
        }
    }
}