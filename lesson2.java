package lesson2;

public class lesson2 {
    public static void main(String[] args) {


        System.out.println("Hello :)");

        System.out.println("\r\n1 - задание");

        /**Можно вынести в метод task1*/
        //Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 1 ? 0 : 1;
            System.out.print(arr[i] + " ");
        }
        task2();//**методы с маленькой буквы*/
        task3();
        task4();
        task5();
        task6();
    }

    private static void task2() {
        System.out.println("\r\n2 - задание");
        //Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] arr = new int[8];
        // int a = 0; /**а зачем а?*/
        for (int i = 1; i < arr.length; i++) {
            //arr[i] = i += 3;
            arr[i] = i * 3;
            System.out.println(arr[i] + " ");
//            System.out.println(a + " ");
        }
        for (int i : arr)
            System.out.print(i + " ");
    }

    private static void task3() {
        System.out.println("\r\n3 - задание");
        //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        // пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("\nЗаданный цикл: ");
        for (int i : arr) {
            System.out.print(i + "");
        }

        System.out.print("\nПосчитанный цикл: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 6)
                arr[i] = arr[i] * 2;
            System.out.print(arr[i] + " ");
        }
    }

    private static void task4() {
        System.out.println("\r\n4 - задание");
        // Создать квадратный двумерный целочисленный массив
        // (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные
        // элементы единицами;
        //int i = 4;
        //int j = 4;
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) { /**условие*/
            for (int j = 0; j < arr[i].length; j++) { /**условие*/ //лучше же, чем просто цифры?)
                if (i == j || (i + j == arr.length - 1)) {
                    arr[i][j] = 1;
                }
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        int[][] arr2 = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            arr2[i][arr2.length - 1 - i] = 1;
            arr2[i][i] = 1;
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void task5() {
        System.out.println("\r\n5 - задание");
        //Задать одномерный массив и найти в нем
        // минимальный и максимальный элементы (без помощи интернета);
        int arr[] = {1, 0, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i != arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min + " " + max);
    }

    public static void task6() {
        System.out.println("\r\n6 - задание");
        //Написать метод, в который передается не пустой одномерный
        // целочисленный массив, метод должен вернуть true,
        // если в массиве есть место, в котором сумма левой и правой
        // части массива равны. Примеры:
        // checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
        // checkBalance([1, 1, 1, || 2, 1]) → true,
        // граница показана символами ||, эти символы в массив не входят.
        //public static boolean checkbalance(int[] array){
        int array[] = {2, 2, 2, 1, 2, 2, 10, 1};
        int leftSum = 0;
        for (int i = 0; i < array.length; i++) {
            leftSum += array[i];
            int rightSum = 0;
            for (int j = 0; j < array.length; j++) {
                rightSum += (j > i) ? array[j] : 0;
            }
            if (leftSum == rightSum) {
                //return true;
                System.out.println("сумма левой и правой части массива равна");
            } else {
                //return false;
                System.out.println("сумма левой и правой части массива не равна");
            }
        }
        //return false;
    }
}

