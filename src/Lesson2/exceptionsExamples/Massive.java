package Lesson2.exceptionsExamples;

import java.util.Arrays;

public class Massive {
    private static void foo() {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
        int[] arrDivider = {1, 1, 0, 1, 0};

        try {
            for (int i = 0; i < arr.length; i++) {
                try {
                    arr[i] /= arrDivider[i];
                } catch (ArithmeticException e) {
                    System.err.println("делить на ноль нельзя. нулевой элемент " + "arrDivider[" + i + "]");

                    //  e.printStackTrace();
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.err.println("массивы не одинаковые");
                }

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("массивы не одинаковые ЭТО не показало потомучто уже есть вынутри");
        }
        System.out.println(Arrays.toString(arr));

    }


    public static void main(String[] args) {
        foo();
    }
}