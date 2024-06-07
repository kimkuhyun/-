package middle;

import java.util.Arrays;
import java.util.List;

public class _02 {
    //2. 1번에서 만든 Stream에 grade가 A+로 저장된 새로운 Stream을 만들어서 출력하세요.
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(1, "홍길동",100),
                new Student(2, "임꺽정",75),
                new Student(3, "장길산",86),
                new Student(4, "정도전",97),
                new Student(5, "이순신",95)
        );

//        students.stream()
//                .filter(i -> i.getGrade().equals("A+"))
//                .forEach(System.out::println);
        students.stream()
                .map(student -> {
                    if (student.getScore() >= 95) {
                        student.setGrade("A+");
                    } else {
                        student.setGrade("A+가 아닙니다");
                    }
                    return student;
                })
                .filter(student -> student.getGrade().equals("A+"))
                .forEach(System.out::println);



    }
}
