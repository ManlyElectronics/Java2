package Lesson1.HomeWork.Task1.ver2;

public class Robot implements Participants {
    int runLimit;
    int jumpLimit;
    boolean ready;


    public Robot(int runLimit, int jumpLimit) {
        this.jumpLimit=jumpLimit;
        this.runLimit=jumpLimit;
    }

    @Override
    public void Pass(Obstacles obstacles) {
        System.out.println("робот проходит препятсвие");
    }
}