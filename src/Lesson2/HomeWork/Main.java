package Lesson2.HomeWork;

public class Main {
    public static final int SIZE=4;
    private static String[][] strings = new String[SIZE][SIZE];
    public static void main(String[] args) {

/*        String strings[][] = {
                {"раз1","два1","три1", "четыре1"},
                {"раз2","два2","три2", "четыре2"},
                {"раз3","два3","три3", "четыре3"},
                {"раз4","два4","три4", "четыре4"},
        };*/
        makeMas();
        foo(strings);
    }

    private static void makeMas() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                strings[i][j] = String.valueOf(i*j);
            }
        }
    }

    private static void foo(String[][] strings) {
        int SIZE = 4;
        if (strings[0].length != SIZE || strings.length != SIZE) {
            throw new MyArraySizeException("Размер массива не тот");
        }
/*        for (String[] string : strings) {
            for (String element : string) {
                System.out.println(element);
                System.out.println(Integer.parseInt(element));
            }
        }*/
        //String s = "char";
        // int d = Character.getNumericValue(s);
        // int i = Integer.parseInt("dd");
        for (int i =0 ; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                System.out.println("string " + strings[i][j]);
                int s = Integer.parseInt(strings[i][j]);
                System.out.println("integer :"+ s);
           // System.out.println(strings[i][j].getNumericValue);
            }
        }
        try {
            System.out.println("Сумма массива:" + makeSum (strings));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }

    private static int makeSum(String[][] strings) throws NumberFormatException{
        int sum = 0;
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                try {
                    sum += Integer.parseInt(strings[i][j]);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        }
        return sum;

    }

}
