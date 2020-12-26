package Lesson1.HomeWork.Task1;

public class Robot implements Participants {

    int runLimit;
    int jumpLimit;
    boolean ready = true; // готов к соревнованиям

    Robot(int runLimit, int jumpLimit) {
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
        System.out.println("появился робот");
    }

    @Override
    public void Runs() {
        if (ready == false) {
            System.out.println("робот сломан и не может бежать");
            ready = false;
            return;
        }
        System.out.println("робот бежит");
    }
    public void Runs(Treadmill treadmill) {
        if (ready == false) {
            return;
        }
        if (treadmill.length > runLimit) {
            System.out.println("робот выбыл из соревнований, дорожка слишком длинная");
            ready = false;
            return;
        }
        System.out.println("робот бежит по беговой дорожке");
    } // почему требует public от void метода но не здесь ?

    @Override
    public void Jumps() {
        System.out.println("робот прыгает");
    }

    public void Jumps(Wall wall) {
        if (ready == false) {
            return;
        }
        if (wall.height > jumpLimit) {
            System.out.println("робот не смог перепрыгнуть эту высоту и выбыл из соревнований");
            ready = false;
            return;
        }
        System.out.println("робот прыгает через стенку");
    }

}