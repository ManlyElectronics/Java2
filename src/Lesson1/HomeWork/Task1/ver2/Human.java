package Lesson1.HomeWork.Task1.ver2;

class Human implements Participant {
    int runLimit;
    int jumpLimit;
    boolean ready = true;

    Human(int runLimit, int jumpLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public void Pass(Obstacle obstacle) {
        if (ready == false) {
            System.out.println("человек не соревнуется");
            return;
        }
        if (obstacle.getLength() > runLimit) {
            System.out.println("человек выбыл из соревнований, дорожка слишком длинная");
            ready = false;
            return;
        }
        if (obstacle.getHeight() > jumpLimit) {
            System.out.println("человек не смог перепрыгнуть эту высоту и выбыл из соревнований");
            ready = false;
            return;
        }
        System.out.println("человек преодолел " + obstacle.getoName());
    }
}
