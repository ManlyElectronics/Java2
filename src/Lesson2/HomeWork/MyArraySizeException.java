package Lesson2.HomeWork;

public class MyArraySizeException extends RuntimeException {
   public MyArraySizeException(){
       super(String.format("массив не того размера"));
   }

    public MyArraySizeException(String s) {
        super(String.format(s));
    }
    //System.out.println("исключение");
}
