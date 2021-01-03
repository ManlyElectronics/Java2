package Lesson2.exceptionsExamples;

public class CatOfException extends RuntimeException {
    public CatOfException() {
       super("пришёл кот и всё исполртил");
       // System.out.println("пришёл кот и всё испортил"); // неработает
    }

    public CatOfException(String message) {
        super(message);
    }
    public CatOfException(int i){
        super(String.format("кот прокрался под номером %d%n",i));
    }
}
