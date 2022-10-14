package ch24practice;



public class StudentSubjectTest {

    public static void main(String[] args) {

        Student2 studentLee = new Student2(10001,"Lee");

        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 100);

        Student2 studentKim = new Student2(10002, "Kim");

        studentKim.addSubject("국어", 20);
        studentKim.addSubject("수학", 60);

        studentLee.showScoreInfo();
        System.out.println("\n==========================");
        studentKim.showScoreInfo();
    }
}
