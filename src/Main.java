public class Main {
    public static void main(String[] args) {
        System.out.println("  ДЗ  № 1 Задание 1");
        System.out.println( );
        int saccumulation = 29000;
        double total = 0;
        double percent = 0.01;
        int i = 0;
        for (; total < 2_459_000; i++) {
            total = (total + saccumulation) * (1 + percent);
            System.out.println(" Месяц " + i + "  сумма накоплений равна " + total + " рублей ");
        }
        System.out.println( );

        System.out.println(" ДЗ  № 1 Задание 2");
        System.out.println( );
        int start = 0;
        while (start < 10) {
            start++;
            System.out.print(start + " ");
        }
        System.out.println();


        for (int x = 10; x >= 1; x--) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.println(" ДЗ № 1 Задание 3");
        System.out.println( );

        int y = 12_000_000;
        int growthPerYear = 0;
        int period1 = 10;
        int fertility1 = 17;
        int mortality1 = 8;
        for (period1 = 1; period1 <= 10; period1++) {
            growthPerYear = growthPerYear + (fertility1 * y / 1000) - (mortality1 * y / 1000);

            System.out.println("Год " + period1 + " численность населения составляет " + (y + growthPerYear));
        }
        System.out.println( );
        System.out.println("  ДЗ № 2 Задание 4  ");
        int sum = 15_000;
        int total1 = 0;
        int a = 0;
        for (; total1 <= 12_000_000; a++) {
            total1 = total1 + sum + (sum * 7) / 100;
            System.out.println("Месяц " + a + " сумма накоплений составит " + total1 + " рублей ");

        }
        System.out.println( );
        System.out.println(" ДЗ № 2 Задание 5");
        int total2 = 0;
        int a1 = 0;

        for (; total2 <= 12_000_000; a1++) {
            total2 = total2 + sum + (sum * 7) / 100;

            if (a1 % 6 == 0) {
                System.out.println("Месяц " + a1 + " сумма накоплений составит " + total2 + " рублей ");
            }


        }
        System.out.println( );
        System.out.println(" ДЗ № 2 Задание 6");
        int year = 9;

        int total3 = 0;
        int a2 = 0;

        for (year = year * 12; total3 <= 12_000_000; a2++) {
            total3 = total3 + sum + (sum * 7) / 100;

            if (a2 % 6 == 0 && a2 <= year) {
                System.out.println("Месяц " + a2 + " сумма накоплений составит " + total3 + " рублей ");
            }
        }
        System.out.println( );


        System.out.println(" ДЗ № 2 Задание 7");
        for (int dayNumber = 5; dayNumber <= 31; dayNumber++) {
            if (dayNumber % 7 == 0) {
                System.out.println(" Сегодня пятница," + dayNumber + "-е число. Необходимо подготовить отчет ");
                continue;
            }
            System.out.println(" Отчет не нужен ");

        }
        System.out.println( );


        System.out.println(" ДЗ № 3 Задание 9 ");
        for (int b = 1; b <= 10; b++) {
            System.out.println(" 2 * " + b + " = " + 2 * b);
        }
        System.out.println( );

        System.out.println(" ДЗ № 3 Задание 8 ");
        int year1 = 0;
        while ( year1 <=2122){
            year1 = year1 + 79;
            if ( year1>=1822 && year1 <=2122) {
                System.out.println( " Комета пролетела в  " + year1 + " году " );
            }
        }

    }
}













































































