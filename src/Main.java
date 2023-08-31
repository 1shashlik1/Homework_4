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
        boolean isLeap = ( year % 4 == 0 && year % 100 != 0 ) || ( year % 400 == 0 );
        if ( isLeap ) {
            System.out.println( year + " год - високосный" );
        } else {
            System.out.println( year + " год - не високосный" );
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
        char cizon;
        byte monthNumber = 1;
        if ( monthNumber > 1 || monthNumber < 12 ) {
            System.out.println("Некоректно.");
        }
        switch ( monthNumber ) {
            case 1:
                System.out.println( "2 Месяц." );
                break;
            case 2:
                System.out.println( "3 Месяц." );
                break;
            case 3:
                System.out.println( "1 Месяц." );
                break;
            case 4:
                System.out.println( "2 Месяц." );
                break;
            case 5:
                System.out.println( "3 Месяц." );
                break;
            case 6:
                System.out.println( "1 Месяц." );
                break;
            case 7:
                System.out.println( "2 Месяц." );
                break;
            case 8:
                System.out.println( "3 Месяц." );
                break;
            case 9:
                System.out.println( "1 Месяц." );
                break;
            case 10:
                System.out.println( "2 Месяц." );
                break;
            case 11:
                System.out.println( "3 Месяц." );
                break;
            case 12:
                System.out.println( "1 Месяц." );
        }
        if ( monthNumber == 12 || monthNumber == 1 || monthNumber == 2 ) {
            System.out.println("Зимы.");
        }
        if ( monthNumber == 3 || monthNumber == 4 || monthNumber == 5 ) {
            System.out.println("Весны.");
        }
        if ( monthNumber == 6 || monthNumber == 7 || monthNumber == 8 ) {
            System.out.println("Лета.");
        }
        if ( monthNumber == 9 || monthNumber == 10 || monthNumber == 11 ) {
            System.out.println("Осени.");
        }
    }
}