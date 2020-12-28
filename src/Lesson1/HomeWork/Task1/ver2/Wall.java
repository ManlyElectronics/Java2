package Lesson1.HomeWork.Task1.ver2;

class Wall extends Obstacle {
    int oHeight;
    String oName = "Стенка";

    String getOName() {
        return oName;
    }

    Wall(int oHeight) {
        this.oHeight = oHeight;
        System.out.println("поставили стенку высотой " + oHeight);
    }

    int getOHeight() {
        return oHeight;
    }

}
