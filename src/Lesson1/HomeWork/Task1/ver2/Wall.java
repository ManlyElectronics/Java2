package Lesson1.HomeWork.Task1.ver2;

class Wall extends Obstacle {
    public int oHeight;
    public String oName = "Стенка";

    public String getOName() {
        return oName;
    }

    Wall(int oHeight) {
        this.oHeight = oHeight;
        System.out.println("поставили стенку высотой " + oHeight);
    }

    public int getOHeight() {
        return oHeight;
    }

}
