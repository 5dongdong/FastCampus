package ch10;

public abstract class Car {

    public abstract void drive();
    public abstract void  stop();
    public abstract void wiper();

    public void  starCar(){
        System.out.println("시동을 켭니다.");
    }

    public void turnOff(){
        System.out.println("시동을 끕니다.");
    }

    public void washCar(){
        System.out.println("자동 세차를 합니다.");
    }

    //순서가 변하면 안되므로 final 하위클래스에서 재정의 불가능
    final public void run(){
        starCar();
        drive();
        wiper();
        stop();
        turnOff();
        washCar();
    }
}
