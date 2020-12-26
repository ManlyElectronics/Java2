package Lesson1.HomeWork.Task1;

    class Cat implements Participants {
        int runLimit;
        int jumpLimit;
        boolean ready = true; // готов к соревнованиям

        Cat(int runLimit, int jumpLimit) {
            this.jumpLimit = jumpLimit;
            this.runLimit = runLimit;
            System.out.println("появился кот");
        }

        @Override
        public void Runs() {
            System.out.println("кот бежит");
        }

        public void Runs(Treadmill treadmill) {
            if (ready == false) {
                return;
            }
            if (treadmill.length > runLimit) {
                System.out.println("кот выбыл из соревнований, дорожка слишком длинная");
                ready = false;
                return;
            }
            System.out.println("кот бежит по беговой дорожке");
        } // почему требует public от void метода но не здесь ?

        @Override
        public void Jumps(){
            System.out.println("кот прыгает");
        };
        public void Jumps(Wall wall) {
            if (ready == false) {
                return;
            }
            if (wall.height > jumpLimit) {
                System.out.println("кот не смог перепрыгнуть эту высоту и выбыл из соревнований");
                ready = false;
                return;
            }
            System.out.println("кот прыгает через стенку");

        }
}