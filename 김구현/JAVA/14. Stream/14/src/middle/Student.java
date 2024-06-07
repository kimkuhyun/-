package middle;

public class Student {
    //1. int sno, String sName, int score, String grade를 갖는 Student 클래스를 만들고
    // List<Student> studentList에 (1, 홍길동, 100), (2, 임꺽정, 75), (3, 장길산, 86), (4, 정도전, 97), (5, 이순신, 95)를
    // 저장하고 Stream으로 변환하여 점수가 95점 이상인 학생만 들어있는 Stream을 만드세요.
    int sno;
    String nName;
    int score;
    String grade;

    public int getSno() {
        return sno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", nName='" + nName + '\'' +
                ", score=" + score +
                ", grade='" + grade + '\'' +
                '}';
    }

    public String getnName() {
        return nName;
    }

    public Student(int sno, String nName, int score) {
        this.sno = sno;
        this.nName = nName;
        this.score = score;
        this.grade = calculateGrade(score);

    }

    public void setnName(String nName) {
        this.nName = nName;
    }

    public int getScore() {
        return score;
    }


    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public void setScore(int score) {
        this.score = score;
        this.grade = calculateGrade(score); // 점수가 변경될 때 학점을 다시 계산하여 설정
    }

    private String calculateGrade(int score) {

        if (score >= 95) {
            return "A+";
        } else if (score >= 90) {
            return "A";
        } else if (score >= 85) {
            return "B+";
        } else if (score >= 80) {
            return "B";
        } else {
            return "C";
        }
    }

}
