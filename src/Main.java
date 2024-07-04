public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int salary = 15000;
        float total = 0;
        int sum = 2_459_000;
        int i = 0;
        while (total < sum) {
            total += total / 100;
            total += salary;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        } System.out.println("\n");

        System.out.println("Задача 2");
        int start = 1;
        while (start <= 10) {
            System.out.print(start + " ");
            start = start + 1;
        }
        System.out.println("\n");
        for (int a = 10; a > 0; a--) {
            System.out.print(a + " ");
        }
        System.out.println("\n");

        System.out.println("Задача 3");
        int y = 12000000;
        int year = 0;
        int birthRate = (y / 1000) * 17;
        int deathRate = (y / 1000) * 8;
        while (year < 10) {
            year = year + 1;
            y = y + birthRate - deathRate;
            System.out.println("Год " + year + ", численность населения составляет " + y);
        } System.out.println("\n");


        System.out.println("Задача 4");
        double deposit1 = 15000;
        double persent1 = 0.07;
        int money1 = 12_000_000;
        int months1 = 0;
        while (deposit1 < money1) {
            deposit1 += deposit1 * persent1;
            String result = String.format("%.3f", deposit1);
            months1++;
            System.out.println("Месяц" + months1 + ", сумма на счете составляют " + result);
        } System.out.println("\n");


        System.out.println("Задача 5");
        double deposit2 = 15000;
        double persent2 = 0.07;
        int money2 = 12_000_000;
        int months2 = 1;
        int period = 6;
        while (deposit2 < money2) {
            deposit2 += deposit2 * persent2;
            String result = String.format("%.3f", deposit2);
            months2++;
            if (months2 % period == 0) {
                System.out.println(months2 + " месяц, сумма на счете составляет " + result);
            }
        } System.out.println("\n");

        System.out.println("Задача 6");
        double deposit3 = 15000;
        double persent3 = 0.07;
        int months3 = 1;
        int period2 = 6;
        int year2 = 9;
        int limitMonth = year2 * 12;
        while (months3 <= limitMonth) {
            deposit3 += deposit3 * persent3;
            String result = String.format("%.3f", deposit3);
            months3++;
            if (months3 % period2 == 0) {
                System.out.println("Месяц " + months3 + ", сумма на счете составляет : " + result);
            }
        } System.out.println("\n");

        System.out.println("Задача 7");
        int friday = 5;
        int daysPerMonth = 31;
        while (friday <= daysPerMonth) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        } System.out.println("\n");

        System.out.println("Задача 8");
        int thisYear = 2024;
        int yearsBefore = 200;
        int yearsAfter = 100;
        int cometCycle = 79;
        int startYear = thisYear - yearsBefore;
        int endYear = thisYear + yearsAfter;
        for (year = startYear; year <= endYear; year++) {
            if (year % cometCycle == 0) {
                System.out.println(year);
            }
        } System.out.println("\n");
    }
}