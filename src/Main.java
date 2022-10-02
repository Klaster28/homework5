public class Main {
    public static void main(String[] args) {
        int clientOs = 1;
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке ... ");
        } else if (clientOs == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке...");
        } else {
            System.out.println("Неверное введены данные Операционной системы!");
        }


        int clientOS = 0;
        int clientDeviceYear = 2011;
        if (clientOS >= 2 || clientOS < 0) {
            System.out.println("Неверное введены данные Операционной системы!");
        }
        if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке ... ");
        } else if (clientOS == 1 && clientDeviceYear > 2016) {
            System.out.println("Установите версию приложения для Android по ссылке...");
        }
        if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке...");
        } else if (clientOS == 0 && clientDeviceYear > 2016) {
            System.out.println("Установите  версию приложения для IOS по ссылке...");
        }

        int year = 2024;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }


        int deliveryDistance = 23;
        if (deliveryDistance >= 0 && deliveryDistance <= 20) {
            System.out.println("Потребуется дней - 1");
        }
        if (deliveryDistance >= 21 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней - 2");
        }
        if (deliveryDistance >= 61 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней - 3");
        }


        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь - зимний месяц!");
                break;
            case 2:
                System.out.println("Февраль - зимний месяц!");
                break;
            case 3:
                System.out.println("Март - весенний месяц!");
                break;
            case 4:
                System.out.println("Апрель - весенний месяц!");
                break;
            case 5:
                System.out.println("Май - весенний месяц!");
                break;
            case 6:
                System.out.println("Июнь - летний месяц!");
                break;
            case 7:
                System.out.println("Июль - летний месяц!");
                break;
            case 8:
                System.out.println("Август - летний месяц!");
                break;
            case 9:
                System.out.println("Сентябрь - осенний месяц!");
                break;
            case 10:
                System.out.println("Октябрь - осенний месяц!");
                break;
            case 11:
                System.out.println("Ноябрь - осенний месяц!");
                break;
            case 12:
                System.out.println("Декабрь - зимний месяц!");
                break;
            default:
                System.out.println("Такого месяца не существует!");
        }



    }
}






