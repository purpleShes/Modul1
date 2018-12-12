package ua.com.samsungitschool;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        firstTask();
        secondTask();

        int thirdResult = math(1346, 36);
        System.out.println(thirdResult);

        boolean fourthResult = isDivisibleThree(9);
        System.out.println(fourthResult);

        boolean fifthResult = isBelongToSection(5, 0, 7, -8, -2);
        System.out.println(fifthResult);

        int[] someArray = {10, 50, 18, 193, 591, 561};
        reverseArray(someArray);
        System.out.println(Arrays.toString(someArray));

        int[] array = {1, 8, 1, 67, 52, 45, 257, 3571, 246, 23, 0, 919, 0};
        printMaxOfArray(array);
        printMaxOfArray2(array);
    }

    //1
    public static void firstTask() {
        int i = 573, j = -1;
        String myString = "J = ";
        System.out.println(myString + j);
    }

    //2
    public static void secondTask() {
        double pi = 3.14159265358979f;
        System.out.println("PI = " + pi);
    }

    //3
    public static int math(int secondInt, int firstInteger) {
        return secondInt + firstInteger;
    }

    //4
    static boolean isDivisibleThree(int num) {
        if (num % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //5
    static boolean isBelongToSection(int x, int fromA, int toB, int fromSecondA, int toSecondB) {
        if (x <= toB && x >= fromA || x <= toSecondB && x >= fromSecondA) {
            return true;
        } else
            return false;
    }

    //6
    static void reverseArray(int[] someArray) {
        for (int i = 0; i < someArray.length / 2; i++) {
            int tmp = someArray[i];
            someArray[i] = someArray[someArray.length - i - 1];
            someArray[someArray.length - i - 1] = tmp;
        }
    }

    //7
    static void printMaxOfArray(int[] array) {
        int max = array[0]; //присваиваем нашей переменной значение первого элемента
        for (int i = 0; i < array.length; i++) { //перебираем все значения масива
            if (array[i] > max) {                //если какое-то значение больше,
                max = array[i];                  //то теперь оно наш максимум
            }
        }
        System.out.println(max);
    }
    //also 7
    static void printMaxOfArray2(int[] array) {
        Arrays.sort(array); //сортируем элементы массива
        int maxOfArray = array[array.length - 1]; //последний - и будет максимальным
        System.out.println(maxOfArray);
    }
}

