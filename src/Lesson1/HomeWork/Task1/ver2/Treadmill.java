package Lesson1.HomeWork.Task1.ver2;

class Treadmill extends Obstacle {
    int oLength;
    String oName = "беговая дорожка";


    Treadmill(int oLength) {
        this.oLength = oLength;
        System.out.println("запустили дорожку длинной " + oLength);
    }

    @Override
    public String getOName() {
        return oName;
    }

    public int getOLength() {
        return oLength;
    }
}
