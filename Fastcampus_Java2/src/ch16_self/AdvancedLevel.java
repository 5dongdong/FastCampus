package ch16_self;

public class AdvancedLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("빠르게 달림");
    }

    @Override
    public void jump() {
        System.out.println("점프");
    }

    @Override
    public void turn() {
        System.out.println("턴");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("중급자");
    }
}
