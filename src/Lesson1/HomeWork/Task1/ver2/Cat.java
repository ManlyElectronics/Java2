package Lesson1.HomeWork.Task1.ver2;

class Cat implements Participants {
    int runLimit;
    int jumpLimit;
    boolean ready;
    @Override
    public void Pass(Obstacles obstacles) {
        System.out.println("кот проходит препятсвие");
    }

}