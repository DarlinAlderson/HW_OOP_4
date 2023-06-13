package Task2;

import static Task2.Printer2.printArray;


/*
Задача 2 : Напишите обобщенный метод printArray, который принимает массив любого
типа и выводит его элементы на консоль.
В этом примере мы объявляем обобщенный метод printArray, который принимает
массив типа T.
 */

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        String[] stringArray = {"The Fibonacci sequence"};

        System.out.println("Печать числового массива: ");
        printArray(intArray);

        System.out.println("Печать строкового массива: ");
        printArray(stringArray);
    }
}