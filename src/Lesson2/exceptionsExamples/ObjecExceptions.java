package Lesson2.exceptionsExamples;

public class ObjecExceptions {
    public static void main(String[] args) {
runAnimals();
    }

    private static void runAnimals() {
        Runer[] animals = new Runer[]{
                new Cat(),
                new Dog()
        };
        for (Runer animal : animals) {
            if (animal instanceof Cat){
                throw new CatOfException();
            }
            animal.Run();
        }
    }

    static class Dog implements Runer {
        @Override
        public void Run() {
            System.out.println("собака бежит");
        }
    }

    static class Cat implements Runer {
        @Override
        public void Run() {
            System.out.println("кот бежит");
        }
    }

    interface Runer {
        void Run();
    }
}
