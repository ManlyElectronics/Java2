package Lesson1.HomeWork.Task1.ver2;

class Wall extends Obstacle {
    public int height;
    public String oName = "Стенка";

    Wall() {
        System.out.println("поставили стенку");
    }

    public String getoName() {
        return oName;
    }

    Wall(int height) {
        this.height = height;
        System.out.println("поставили стенку высотой " + height);
    }

    public int getHeight() {
        return height;
    }

}
