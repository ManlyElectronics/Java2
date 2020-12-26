package Lesson1.HomeWork.Task1.ver2;

public interface Jumps {
    default void Jumps() {
        System.out.println("участник прыгает");
    }

   /* public void Jumps(Participants participant, Wall wall) {
        if (ready == false) {
            return;
        }
        if (wall.height > participant.) {
            System.out.println("участник не смог перепрыгнуть эту высоту и выбыл из соревнований");
            ready = false;
            return;
        }
        System.out.println("участник прыгает через стенку");
    }*/
}
