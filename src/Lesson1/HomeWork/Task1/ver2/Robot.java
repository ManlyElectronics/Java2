package Lesson1.HomeWork.Task1.ver2;

class Robot implements Participant {
    int runLimit;
    int jumpLimit;
    boolean ready = true;

    Robot(int runLimit, int jumpLimit) {
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
    }

    @Override
    public void Pass(Obstacle obstacle) {
        if (ready == false) {
            System.out.println("робот не соревнуется");
            return;
        }
        if (obstacle.getOLength() > runLimit) {
            System.out.println("робот выбыл из соревнований, дорожка слишком длинная");
            ready = false;
            return;
        }
        if (obstacle.getOHeight() > jumpLimit) {
            System.out.println("робот не смог перепрыгнуть эту высоту и выбыл из соревнований");
            ready = false;
            return;
        }
        System.out.println("Робот преодолел " + obstacle.getOName());
    }

}