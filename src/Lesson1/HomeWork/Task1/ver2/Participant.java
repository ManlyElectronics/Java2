package Lesson1.HomeWork.Task1.ver2;

interface Participant {
    default void Pass(Obstacle obstacle) {
        System.out.println(obstacle.getOLength());
        System.out.println(obstacle.getOHeight());
        System.out.println(obstacle.getOName());
        System.out.println("Участник прошёл препядсвие");
    }

}
