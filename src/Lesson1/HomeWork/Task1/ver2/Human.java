package Lesson1.HomeWork.Task1.ver2;

class Human implements Participants {

    int runLimit;
    int jumpLimit;
    boolean ready;

    public Human(int runLimit, int jumpLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public void Pass(Obstacles obstacles) {
System.out.println("человек проходит препятсвие ");
    }
}
