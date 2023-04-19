package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Task1(sc);
        Task2(sc);
        Task3();
    }

    public static void Task1(Scanner sc) {
        System.out.println("Введите число");
        int num = sc.nextInt();
        if (num > 7) {
            System.out.println("Привет");
        }
    }

    public static void Task2(Scanner sc) {
        System.out.println("Введите имя");
        String name = "Вячеслав";
        String inputName = sc.next();
        if (name.equals(inputName)) {
            System.out.println("Привет, " + name);
        } else {
            System.out.println("Нет такого имени");
        }
    }

    public static void Task3() {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (Integer num : arr) {
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }
    }
}
