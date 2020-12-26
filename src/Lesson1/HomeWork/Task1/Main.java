package Lesson1.HomeWork.Task1;

// как предать имя обьекта в метод ? напрмер как вместо участник бежит написать именно человек или кот ?
public class Main {
    public static void main(String[] args) {
        Human human = new Human(150, 2);
        Robot robot = new Robot(500, 3);
        Cat cat = new Cat(100, 1);
        Wall wall = new Wall(1);
        Treadmill treadmill = new Treadmill(200);
// human.Runs(treadmill);
// cat.Runs(treadmill); // кот бежит по беговой дорожке
// human.Jumps(); // человек прыгает через стенку

        Obstacles[] obstacles = {treadmill, wall};

        Participants[] participants = {human, robot, cat};
        for (Participants participant : participants) {
            participant.Jumps(wall);
            participant.Runs(treadmill);

        }
    }
}
