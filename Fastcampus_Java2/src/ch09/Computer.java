package ch09;

public abstract class Computer {

    public abstract void display(); //현재 구현 불가 - 하위 클래스로 넘겨버리기~
    public abstract void typing(); //현재 구현 불가 - 하위 클래스로 넘겨 버리기~

    public void turnOn(){
        System.out.println("전원을 켭니다.");
    };

    public void turnOff(){
        System.out.println("전원을 끕니다.");
    }


}
