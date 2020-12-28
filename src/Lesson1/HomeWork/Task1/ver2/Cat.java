package Lesson1.HomeWork.Task1.ver2;

class Cat implements Participant {
    int runLimit;
    int jumpLimit;
    boolean ready = true;

    Cat(int runLimit, int jumpLimit) {
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
    }

    @Override
    public void Pass(Obstacle obstacle) {
        if (ready == false) {
            System.out.println("кот не соревнуется");
            return;
        }
        if (obstacle.getOLength() > runLimit) {
            System.out.println("кот выбыл из соревнований, дорожка слишком длинная");
            ready = false;
            return;
        }
        if (obstacle.getOHeight() > jumpLimit) {
            System.out.println("Кот не смог перепрыгнуть эту высоту и выбыл из соревнований");
            ready = false;
            return;
        }
        System.out.println("кот преодолел " + obstacle.getOName());
    }

}