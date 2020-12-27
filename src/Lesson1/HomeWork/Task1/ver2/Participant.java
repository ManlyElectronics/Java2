package Lesson1.HomeWork.Task1.ver2;

public interface Participant {
    public int jumpLimit = 0;
    public int runLimit = 0;
    public String pName = null;
boolean ready= true;
    default void Pass(Obstacle obstacle) {
        System.out.println(obstacle.getLength());
        System.out.println(obstacle.getHeight());
        System.out.println(obstacle.getoName());

        System.out.println("Участник прошёл ");
    }

}
