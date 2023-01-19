public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }
    //for(int i = 0; i < 10; i = i + 1){
    //    System.out.println("Итерация цикла " + i);

    public static void task1() {
        System.out.println((char) 27 + "[35m----------Задача 1----------" + (char)27 + "[0m");
        for(int i = 1; i <= 10; i = i + 1){
            System.out.println("число " + i);
        }
    }
    public static void task2() {
        System.out.println((char) 27 + "[35m----------Задача 2----------" + (char)27 + "[0m");
        for (int a = 10; a >= 1; a = a - 1) {
            System.out.println("Число " + a);
        }
    }
    public static void task3() {
        System.out.println((char) 27 + "[35m----------Задача 3----------" + (char)27 + "[0m");
        for (int b = 0; b <= 17; b = b +2) {
            System.out.println("Четное число " + b);
        }
    }
    public static void task4() {
        System.out.println((char) 27 + "[35m----------Задача 4----------" + (char)27 + "[0m");
        for (int c = 10; c > -11; c = c -1) {
            System.out.println(c);
        }
    }
    public static void task5() {
        System.out.println((char) 27 + "[35m----------Задача 5----------" + (char)27 + "[0m");
        for (int d = 1904; d < 2096; d = d + 4) {
            System.out.println(d + " год является високосным");
        }
    }
    public static void task6() {
        System.out.println((char) 27 + "[35m----------Задача 6----------" + (char)27 + "[0m");
        for (int e = 7; e <= 98; e = e + 7) {
            System.out.println(e);
        }
    }
    public static void task7() {
        System.out.println((char) 27 + "[35m----------Задача 7----------" + (char)27 + "[0m");
        for (int f = 1; f <= 512; f = f * 2) {
            System.out.println(f);
        }
    }
    public static void task8() {
        System.out.println((char) 27 + "[35m----------Задача 8----------" + (char)27 + "[0m");
        int salary = 29000;
        int total = 0;
        for (int g = 0; g < 12; g = g + 1) {
            total = total + salary;
            System.out.println(total);
        }
    }
    public static void task9() {
        System.out.println((char) 27 + "[35m----------Задача 9----------" + (char)27 + "[0m");
        int salary = 29000;
        int total = 0;
        for (int h = 1; h < 13; h = h + 1) {
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц " + h + ", сумма накоплений равна " + total +" рублей");
        }
    }
    public static void task10() {
        System.out.println((char) 27 + "[35m----------Задача 10----------" + (char)27 + "[0m");
        int number = 2;
        for (int g = 1; g <11; g = g + 1) {
            System.out.println(number + "*" + g + "=" + number * g);
        }
    }
}