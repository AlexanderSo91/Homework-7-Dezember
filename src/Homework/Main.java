package Homework;

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



    public static void task1() {

        System.out.println("\nЗадача_1");

        for(int i = 1; i <= 10; i = i + 1){
            System.out.println(i);
        }
    }

    public static void task2() {

        System.out.println("\nЗадача_2");

        for(int i = 10; i >= 1; i = i - 1 ){
            System.out.println(i);
        }
    }

    public static void task3() {

        System.out.println("\nЗадача_3");

        for(int i = 0; i < 17; i = i + 2 ){
            System.out.println(i);
        }
    }

    public static void task4() {

        System.out.println("\nЗадача_4");

        for(int i = 10; i >= -10; i = i - 1 ){
            System.out.println(i);
        }
    }

    public static void task5() {

        System.out.println("\nЗадача_5");
        for (int i = 1904; i <= 2096; i = i + 4){
            System.out.println( i + " год является высокосным");
        }
    }

    public static void task6() {
        System.out.println("\nЗадача_6");

        for (int i = 0; i <= 98; i = i + 7){
            System.out.println( i );
        }
    }

    public static void task7() {

        System.out.println("\nЗадача_7");

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

    }

    private static void task8 () {

        System.out.println("\nЗадача_8");

        int salary = 29000;
        int total = 0;
        for (int i =1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц "+ i+ " сумма накоплений равна " + total + " рублей");
        }


    }

    private static void task9 () {

        System.out.println("\nЗадача_9");

        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц "+ i+ " сумма накоплений равна " + total + " рублей");
        }
    }


    private static void task10() {

        System.out.println("\nЗадача_10");

        for (int i = 1; i <= 10; i++) {
            System.out.println( "2 * " +i+ " = "+2*i);
        }
    }
}

