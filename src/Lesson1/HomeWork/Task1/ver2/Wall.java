package Lesson1.HomeWork.Task1.ver2;

class Wall implements Obstacles {
    int height;

    Wall() {
        System.out.println("поставили стенку");
    }

    Wall(int height) {
        this.height = height;
        System.out.println("поставили стенку высотой " + height);
    }

    void setHeight(int height) {
        this.height = height;
    }

    int getHeight() {
        return height;
    }

}
