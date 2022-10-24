import java.time.LocalDate;

public class Main {
    /*public static void printSeporator(){
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
    }
    public static void printIssues(int issuesCount){
        System.out.println(issuesCount);
    }
    public static int sum(int[] numbers){
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] issuesByMonths = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8};
        printSeporator();
        for (int i = 0; i < issuesByMonths.length; i++) {
            printIssues(issuesByMonths[i]);
            if ((i+1)%3==0) {
                printSeporator();
            }
        }
       printSeporator();
        int total=sum(issuesByMonths);
        printIssues(total);
    }

     */
    //Задачи


    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int year = 2022;
        System.out.println(findYearLeap(year));
        //Задача 2
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = LocalDate.now().getYear();
        informingClient(clientOS, clientDeviceYear);
        //Задача 3
        System.out.println("Задача 3");
        int deliveryDistance = 60;
        int day = 1;
        int distanceIncer = 40;
        calculationDeliveryDistance(deliveryDistance, day, distanceIncer);
    }
    public static void calculationDeliveryDistance(int deliveryDistance, int day, int distanceIncer) {      //Метод вычесления дистанции доставки
        if (deliveryDistance > 20) {
            int addDays = (deliveryDistance -20)/ distanceIncer+1;
            day = addDays + day;
        } System.out.println("Потребуется дней: " + day);
    }



    public static void informingClient(int clientOS, int clientDeviceYear) {  //Медот вычесления пользовательской ОС
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }


    public static String findYearLeap(int year) {       // Метод по вычеслению высокосного года
        boolean fuckMetod = (((year % 4) == 0) && (((year % 100) != 0) || ((year % 400) == 0)));
        if (fuckMetod) {
            return year + " год является високосным";
        } else {
            return year + " год не является високосным";
        }
    }



}

