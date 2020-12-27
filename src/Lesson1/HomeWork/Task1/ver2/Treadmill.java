package Lesson1.HomeWork.Task1.ver2;

class Treadmill extends Obstacle {
    int treadmillLength;
    String oName = "беговая дорожка";



Treadmill(int treadmillLength){
    this.treadmillLength = treadmillLength;
    System.out.println("запустили дорожку длинной " + treadmillLength);
}

    @Override
    public String getoName() {
        return oName;
    }

    public int get() {
        return treadmillLength;
    }
}
