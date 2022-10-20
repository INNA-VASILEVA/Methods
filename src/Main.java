public class Main {
    public static void task1(int year) {
        int result = year % 4;
        int result1 = year % 400;
        int result2 = year % 100;
        if (result == 0 && result1 <= 400 && result2 <= 100) {
            System.out.println(year + " год является високосным");
        } else System.out.println(year + " год не является високосным");
    }

    public static void task2(int clientOS1, int clientDeviceYear) {
        if (clientDeviceYear >= 2015 && clientOS1 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS1 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear <= 2014 && clientOS1 == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear <= 2014 && clientOS1 == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void task3(int deliveryDistance) {
        int deliveryDate = 1;
        if (deliveryDistance > 20) {
            deliveryDate++;
        }
        if (deliveryDistance > 60) {
            deliveryDate++;
        }
        System.out.println("Потребуется дней " + deliveryDate);

    }


        public static void main (String[]args) {
            // Задание 1
            System.out.println("Задание 1");
            task1(2022);
            // Задание 2
            System.out.println("Задание 2");
            task2(1, 2014);
            // Задание 3
            System.out.println("Задание 3");
            task3(50);
        }
    }