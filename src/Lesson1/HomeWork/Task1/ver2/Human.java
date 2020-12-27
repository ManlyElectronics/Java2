package Lesson1.HomeWork.Task1.ver2;

class Human implements Participants {

    int runLimit;
    int jumpLimit;
    boolean ready = true;

    Human(int runLimit, int jumpLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public void Pass(Obstacles obstacles) {
        if (ready == false) {
            return;
        }
        if (obstacles.length > runLimit) {
            System.out.println("человек выбыл из соревнований, дорожка слишком длинная");
            ready = false;
            return;
        }
        if (obstacles.height > jumpLimit) {
            System.out.println("человек не смог перепрыгнуть эту высоту и выбыл из соревнований");
            ready = false;
            return;
        }
        System.out.println("человек проходит препятсвие ");
    }
}
