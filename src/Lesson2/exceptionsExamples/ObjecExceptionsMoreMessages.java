package Lesson2.exceptionsExamples;

public class ObjecExceptionsMoreMessages {
    public static void main(String[] args) {
        runAnimals();
    }

    private static void runAnimals() {
        Runer[] animals = new Runer[]{
                new Dog(),
                new Cat(),
                new Dog()
        };
int i =1;
        for (Runer animal : animals) {

            try {
                if (animal instanceof Cat) {
                    throw new CatOfException(i);
                }

                animal.Run();


            } catch (CatOfException e) {
                e.printStackTrace();
                System.out.println("Кот сообщение 2");

            }
            i++;
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
