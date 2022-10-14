package ch24practice;

import java.util.ArrayList;

public class Student2 {

    int studentId;
    String studentName;

    ArrayList<Subject2> subject2List;

    Student2(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;

        subject2List = new ArrayList<>();
    }

    public void addSubject(String name, int point){

        Subject2 subject2 = new Subject2();
        subject2.setName(name);
        subject2.setScorePoint(point);

        subject2List.add(subject2);
    }

    public  void showScoreInfo(){

        int total = 0;
        for(Subject2 subject2 : subject2List){

            total += subject2.getScorePoint();
            System.out.println(studentName + "학생의 " + subject2.getName()+ "과목의 성적은" + subject2.getScorePoint() + "입니다.");
        }

        System.out.println(studentName +"학생의 총점은 " + total + "점 입니다.");
    }


}
