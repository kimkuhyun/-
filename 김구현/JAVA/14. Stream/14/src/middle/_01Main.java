package middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _01Main {
    //    //1. int sno, String sName, int score, String grade를 갖는 Student 클래스를 만들고
    //    // List<Student> studentList에 (1, 홍길동, 100), (2, 임꺽정, 75), (3, 장길산, 86), (4, 정도전, 97), (5, 이순신, 95)를
    //    // 저장하고 Stream으로 변환하여 점수가 95점 이상인 학생만 들어있는 Stream을 만드세요.
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student(1, "홍길동",100),
                new Student(2, "임꺽정",75),
                new Student(3, "장길산",86),
                new Student(4, "정도전",97),
                new Student(5, "이순신",95)
        );

        students.stream()
                .filter(i -> i.getScore() >=95)
                .forEach(System.out::println);


    }
}
