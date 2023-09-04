public class Main {
    public static void main(String[] args) {
        //Задача№1
        byte clientOS = 0;
        if ( clientOS >= 1 ) {
            System.out.println( "Установите версию приложения для Android по ссылке." );
        }
        else {
            System.out.println( "Установите версию приложения для iOS по ссылке." );
        }
        //Задача"2
        short clientDeviceYear = 2015;
        if ( clientOS == 1 && clientDeviceYear > 2015 ) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        else if ( clientOS == 1 && clientDeviceYear <= 2015 ) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }

        if ( clientOS == 0 && clientDeviceYear > 2015 ) {
            System.out.println( "Установите версию приложения для iOS по ссылке." );
        }
        else if ( clientOS == 0 && clientDeviceYear <= 2015 ) {
            System.out.println( "Установите облегченную версию приложения для iOS по ссылке." );
        }
        //Задача№3
        short year = 2026;
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (year > 1584) {
            System.out.println(year + " год - старше 1584 года");
        } if (isLeap) {
            System.out.println(year + " год - високосный");
        } else {
            System.out.println(year + " год - не високосный");
        }
        //Задача№4
        byte deliveryDistance = 101;
        if ( deliveryDistance <= 20 ) {
            System.out.println( "Потребуется дней: 1 " );
        }
        if ( deliveryDistance > 20 && deliveryDistance <= 60 ) {
            System.out.println( "Потребуется дней: 2 " );
        }
        if ( deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println( "Потребуется дней: 3 " );
        }
        else {
            System.out.println( "Свыше 100 км доставки нет." );
        }
        //Задача№5
        byte monthNumber = 1;
        switch (monthNumber) {
            case 1:
                System.out.println("(Январь)Зима.");
                break;
            case 2:
                System.out.println("(Февраль)Зима.");
                break;
            case 3:
                System.out.println("(Март)Весна.");
                break;
            case 4:
                System.out.println("(Апрель)Весна.");
                break;
            case 5:
                System.out.println("(Май)Весна.");
                break;
            case 6:
                System.out.println("(Июнь)Лето.");
                break;
            case 7:
                System.out.println("(Июль)Лето.");
                break;
            case 8:
                System.out.println("(Август)Лето.");
                break;
            case 9:
                System.out.println("(Сентябрь)Осень.");
                break;
            case 10:
                System.out.println("(Октябрь)Осень.");
                break;
            case 11:
                System.out.println("(Ноябрь)Осень.");
                break;
            case 12:
                System.out.println("(Декабрь)Зима.");
                break;
            default:
                System.out.println("Некорректно.");//На названия месяцев не обращайте внимания, это я так, для себя.
                //Так же я как понял когда вы говорили поменять 3 и 4 задаю вы имели в виду 3 и 5, так как к 4 задаче я не нашёл ни коментариев ни ошибок.
        }
    }
}