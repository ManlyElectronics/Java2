package Lesson1.HomeWork.Task1.ver1;

interface Participants {
    default void Runs() {
        System.out.println("участник бежит");
    }

    default void Runs(Treadmill treadmill) {
        System.out.println("участник бежит по дорожке");
    }

    default void Jumps() {
        System.out.println("участник прыгает");
    }

    default void Jumps(Wall wall) {

    }

}
