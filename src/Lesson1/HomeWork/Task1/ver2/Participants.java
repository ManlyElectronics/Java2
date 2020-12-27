package Lesson1.HomeWork.Task1.ver2;

public interface Participants {

    default void Pass (Obstacles obstacles){
System.out.println(obstacles.length); // - в дебагере видит соответссующею длинну но здесь всегда 0 !
        System.out.println("Участник прошёл ");

    }
}
