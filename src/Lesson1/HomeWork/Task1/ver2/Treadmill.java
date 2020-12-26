package Lesson1.HomeWork.Task1.ver2;

class Treadmill implements Obstacles {
    // даёт длинну пробежать
    int length;
Treadmill(){
    System.out.println("включили дорожку");
};
    Treadmill(int length) {
        this.length = length;
        System.out.println("Включили беговую дорожку длинной " + length);
    }

    void setLength(int length) {
        this.length = length;
    }

    int getLength() {
        return length;
    }
}
