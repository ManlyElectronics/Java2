package Lesson1.HomeWork.Task1.ver2;

// как предать имя обьекта в метод ? напрмер как вместо участник бежит написать именно человек или кот ?
public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Robot robot = new Robot();
        Cat cat = new Cat();
        Wall wall = new Wall(1);
        Treadmill treadmill = new Treadmill(200);
// human.Runs(treadmill);
// cat.Runs(treadmill); // кот бежит по беговой дорожке
// human.Jumps(); // человек прыгает через стенку

        Obstacles[] obstacles = {treadmill, wall};

        Participants[] participants = {human, robot, cat};
        for (Participants participant : participants) {

        }
    }
}
