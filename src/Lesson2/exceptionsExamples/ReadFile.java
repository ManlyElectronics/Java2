package Lesson2.exceptionsExamples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    ReadFile(String path) throws FileNotFoundException{
        File file = new File(path);
            Scanner scanner= new Scanner(file);
            scanner.close();
            // нужно закрывать с cloe
// раболтает НО ошибку лучше обрабатывать в main
        /* try {
            Scanner scanner= new Scanner(file);
        } catch (FileNotFoundException e) {
            // e.printStackTrace();
            System.out.println("ошибка 1");
        }*/
    }

    public static void main(String[] args)
  //  throws FileNotFoundException // работает но НЕРЕКОМЕНЖУЕТСЯ
    {
        try {
            new ReadFile("src/Lesson2/exceptionsExamples/test.txtОШИБКА");
        } catch (FileNotFoundException e) {
            System.out.println("ошибка 2");
            // e.printStackTrace();
           // throw e;
        }

    }



}
