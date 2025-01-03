import java.util.Scanner;
import java.util.Arrays;

// 학생들의 정보를 나타내는 클래스 선언
class Student implements Comparable<Student> {
    String name;
    int korean, english, math;
    
    public Student(String name, int korean, int english, int math){
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }
    
    @Override
    public int compareTo(Student student) {
        // 세 점수의 합이 오름차순이 되도록 정렬합니다.
        return (this.korean + this.english + this.math) -
               (student.korean + student.english + student.math); 
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언 및 입력:
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for(int i = 0; i < n; i++) {
            String name = sc.next();
            int korean = sc.nextInt();
            int english = sc.nextInt();
            int math = sc.nextInt();
            
            // Student 객체를 생성해 리스트에 추가합니다.
            students[i] = new Student(name, korean, english, math);
        }
        
        // custom comparator를 활용한 정렬
        Arrays.sort(students);
        
        // 결과를 출력합니다.
        for (int i = 0; i < n; i++){
            System.out.print(students[i].name + " ");
            System.out.print(students[i].korean + " ");
            System.out.print(students[i].english + " ");
            System.out.println(students[i].math);
        }
    }
}