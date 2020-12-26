package Lesson1.HomeWork.Task1;

class Human implements Participants {
    int runLimit;
    int jumpLimit;
    boolean ready = true;

    Human() {

    }

    Human(int runLimit, int jumpLimit) {
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
        System.out.println("появился человек");
    }

    @Override
    public void Runs() {
        System.out.println("человек бежит");
    }

    public void Runs(Treadmill treadmill) {

        if (ready == false) {
            return;
        }
        if (treadmill.length > runLimit) {
            System.out.println("человек выбыл из соревнований, дорожка слишком длинная");
            ready = false;
            return;
        }
        System.out.println("человек бежит по беговой дорожке");
    }

    @Override
    public void Jumps() {

    }

    public void Jumps(Wall wall) {
        if (ready == false) {
            return;
        }
        if (wall.height > jumpLimit) {
            System.out.println("человек не смог перепрыгнуть эту высоту и выбыл из соревнований");
            ready = false;
            return;
        }
        System.out.println("человек прыгает через стенку");
    }

}
