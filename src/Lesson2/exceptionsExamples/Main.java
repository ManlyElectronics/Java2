package Lesson2.exceptions;

public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 0;
       try { int c= a/b;} catch (Exception e) {
           e.printStackTrace();
       }
      //  System.out.println(c);
    }
}
