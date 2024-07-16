package org.example;
//Домашнаяя работа
//Уровень 1 урок 2

public class levelOneLessonTwo {
    public static void main(String[] args) {
//Задание 1
        System.out.println(tentotwenty(15,1));
//Задание 2
        plusorminus(10);
//Задание 3
        System.out.println(plus_or_minus_true_or_false(1));
//Задание 4
        table("А ты купи слона...", 5);
//Задание 5
        System.out.println(vear(2004));

    }
    //Задание 1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
//       в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean tentotwenty(int a, int b) {
        if (a + b >=10 && a + b <=20) {
            return true;
        } else {
            return false;
        }
    }

    //Задание 2.    Написать метод, которому в качестве параметра передается целое число, метод должен
//              напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль
//              считаем положительным числом.
    public static void plusorminus(int number1) {
        if (number1 >= 0){
            System.out.println("Число " + number1 + " положительное");
        } else {
            System.out.println("Число " + number1 + " отрицательное");
        }
    }

//Задание 3.    Написать метод, которому в качестве параметра передается целое число. Метод должен
//              вернуть true, если число отрицательное, и вернуть false если положительное.

    public static boolean plus_or_minus_true_or_false(int num) {
        if (num >=0 ) {
            return false;
        } else {
            return true;}
    }
    //Задание 4.    Написать метод, которому в качестве аргументов передается строка и число, метод должен
//              отпечатать в консоль указанную строку, указанное количество раз;
    public static void table(String row, int once) {
        for (int i = 0; i < once ;i++) {
            System.out.println(row);
        }
    }
    //Задание 5.* Написать метод, который определяет, является ли год високосным, и возвращает boolean
//              (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого
//              100-го, при этом каждый 400-й – високосный.
    public static boolean vear(int age) {
//    Понравилась запись я ее разобрал и понял
//    if (age % 4 == 0 && age % 100 != 0 || age % == 400){
//        return true;
//    }
//    else {
//        return false;
//    }

        if (age % 4 == 0) {
            if (age % 400 == 0) {
                return true;
            } else if (age % 100 == 0) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}

