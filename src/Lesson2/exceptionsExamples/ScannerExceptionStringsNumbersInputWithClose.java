package Lesson2.exceptionsExamples;

import java.util.Scanner;

public class ScannerExceptionStringsNumbersInputWithClose {
    ScannerExceptionStringsNumbersInputWithClose(){
    String c;
    int n;
        try ( Scanner scanner = new Scanner(System.in)){
          c = scanner.next();
          n = Integer.parseInt(c);
          scanner.close();
            // scanner.close(); вроде можно здесь но не закроется если ошибка на с будет отчека памяти если
        } catch (Exception e) {
            n = 0;
           // e.printStackTrace();
        }
System.out.println(n);
    }
    public static void main(String[] args) {
 new ScannerExceptionStringsNumbersInputWithClose();
        }
    }
