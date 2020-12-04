package homewrok;

public class Lesson1 {
    public static void main(String[] args) {
        Type();
        doResult(10, 20, 50, 10);
        System.out.println(task10and20(5, 8));
        isPositiveOrNegative(-20);
        System.out.println(isNegative(-22));
        greetings("Ирина");
        Year(2021);
    }
    //1-2. Создать переменные всех пройденных типов данных, и
    // инициализировать их значения;
    public static void Type() {
        byte varB = 0;
        short varC = 127;
        int varA = 555;
        long varD = 55555555L;
        float varE = 5555.50f;
        double varF = 55.55555;
        char varJ = '\u2242';
        System.out.println("\nЗадание 1-2.");
        System.out.println("byte = " + varB);
        System.out.println("short = " + varC);
        System.out.println("int = " + varA);
        System.out.println("long = " + varD);
        System.out.println("float = " + varE);
        System.out.println("double = " + varF);
        System.out.println("char = " + varJ);
        System.out.println("boolean = " + true);
    }

    //1-3. Написать метод вычисляющий выражение a * (b + (c / d)
    // и возвращающий результат,где a, b, c, d – входные параметры этого метода;
    public static void doResult(int a, int b, int c, int d) {
        System.out.println("\nЗадание 1-3");
        int f = a * (b + (c / d));
        System.out.println("a * (b + (c / d) = " + f);
    }

    //1-4. Написать метод, принимающий на вход два числа,
    // и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
    // если да – вернуть true, в противном случае – false
    public static boolean task10and20(int a, int b) {
        System.out.println("\nЗадание 1-4");
        int sum = a + b;
        return sum > 10 && sum < 20;
    }

    //1-5/ Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль положительное ли число передали, или отрицательное;
    // Замечание: ноль считаем положительным числом.
    public static void isPositiveOrNegative(int a) {
        System.out.println("\nЗадание 1-5.");
        if (a >= 0) System.out.println("Число " + a + "положительное");
        else System.out.println("Число " + a + " отрицательное");
    }
    //1-6. Написать метод, которому в качестве параметра передается целое число,
    // метод должен вернуть true, если число отрицательное
    public static boolean isNegative(int a) {
        System.out.println("\nЗадание 1-6.");
        return a < 0;
    }

    //1-7. Написать метод, которому в качестве параметра передается строка,
    // обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;

    public static void greetings(String name) {
        System.out.println("\nЗадание 1-7.");
        System.out.println("Привет, " + name + "!");
    }

    //1-8. * Написать метод, который определяет является ли год високосным,
    // и выводит сообщение в консоль. Каждый 4-й год является високосным,
    // кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void Year(int year) {
        System.out.println("\nЗадание 1-8.");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " г. не високосный");
        else System.out.println(year + " г. високосный");
    }
}
