package Lesson2.exceptionsExamples;

public class Devision {
    private static void bar(int a,int b) {
        try {
            System.out.println(a/b);
        } /*catch (Exception e) {
            System.out.println("ошибка");
            // e.printStackTrace();
        }*/
        finally { // выполняется в любом случае
            System.out.println("Наконец");
        }
    }

    public static void main(String[] args) {
        bar(5,1);
        bar(1,0);
    }
}
