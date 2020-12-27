package Lesson1.HomeWork.Task1.ver2;

public class Wall implements Obstacles {
    int height;

    Wall() {
        System.out.println("поставили стенку");
    }

    public Wall(int height) {
        this.height = height;
        System.out.println("поставили стенку высотой " + height);
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

}
