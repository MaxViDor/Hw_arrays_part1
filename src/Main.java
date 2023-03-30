import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arrNum = new int[3]; // Первый массив
        arrNum[0] = 1;
        arrNum[1] = 2;
        arrNum[2] = 3;

        float[] arr2Num = {1.57f, 7.654f, 9.986f}; // Второй массив

        int[] arr3Num = {10, 9, 8, 7}; // Третий массив
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arrNum = new int[3]; //Первый массив
        arrNum[0] = 1;
        arrNum[1] = 2;
        arrNum[2] = 3;
        for (int i = 0; i < arrNum.length; i++) {
            if (i == arrNum.length - 1) {
                System.out.print(arrNum[i]);
                break;
            }
            System.out.print(arrNum[i] + ",");
        }

        System.out.println("");

        float[] arr2Num = {1.57f, 7.654f, 9.986f}; // Второй массив
        for (int f = 0; f < arr2Num.length; f++) {
            if (f == arr2Num.length - 1) {
                System.out.print(arr2Num[f]);
                break;
            }

            System.out.print(arr2Num[f] + ", ");
        }

        System.out.println("");

        int[] arr3Num = {10, 9, 8, 7}; //Третий массив
        for (int b = 0; b < arr3Num.length; b++) {
            if (b == arr3Num.length - 1) {
                System.out.print(arr3Num[b]);
                break;
            }
            System.out.print(arr3Num[b] + ", ");
        }
        System.out.println("");
    }


    public static void task3() {
        System.out.println("Задача 3");
        int[] arrNum = new int[3]; //Первый массив
        arrNum[0] = 1;
        arrNum[1] = 2;
        arrNum[2] = 3;
        for (int i = arrNum.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arrNum[i]);
                break;
            }
            System.out.print(arrNum[i] + ",");
        }
        System.out.println("");

        float[] arr2Num = {1.57f, 7.654f, 9.986f}; // Второй массив
        for (int f = arr2Num.length - 1; f >= 0; f--) {
            if (f == 0) {
                System.out.print(arr2Num[f]);
                break;
            }

            System.out.print(arr2Num[f] + ", ");

        }
        System.out.println("");

        int[] arr3Num = {10, 9, 8, 7}; //Третий массив
        for (int v = arr3Num.length - 1; v >= 0; v--) {
            if (v == 0) {
                System.out.print(arr3Num[v]);
                break;
            }
            System.out.print(arr3Num[v] + ", ");
        }
        System.out.println("");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int [] arrNum = new int[3];
        arrNum[0] = 1;
        arrNum[1] = 2;
        arrNum[2] = 3;
        for (int i = 0; i < arrNum.length; i++){
            if (arrNum[i] % 2 != 0){
                arrNum[i]++;
            }
            if (i == arrNum.length - 1) {
                System.out.println(arrNum[i]);
                break;
            }
            System.out.print(arrNum[i] + ", ");
        }
    }


}

