public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int salary = 15000;
        float total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + salary;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Задача 2");
        int start = 1;
        while (start <= 10) {
            System.out.print(start + " ");
            start = start + 1;
        }
        System.out.println(" ");
        for (int a = 10; a > 0; a--) {
            System.out.print(a + " ");
        }
        System.out.println(" ");

        System.out.println("Задача 3");
        int y = 12000000;
        int year = 0;
        int birthRate = (y / 1000) * 17;
        int deathRate = (y / 1000) * 8;
        while (year < 10) {
            year = year + 1;
            y = y + birthRate - deathRate;
            System.out.println("Год " + year + ", численность населения составляет " + y);
        }

        System.out.println("Задача 4");
        double deposit = 15000;
        double persent = 0.07;
        int month = 1;
        while (deposit < 12000000) {
            deposit = deposit + (deposit * persent);
            String result = String.format("%.3f",deposit);
            month++;
            if (month % 6 == 0) {
                System.out.println(month + " месяц, сумма на счете составляют " + result);
            }
        }

        System.out.println("Задача 5");
        double deposit2 = 15000;
        double persent2 = 0.07;
        int month2 = 1;
        while (deposit2 < 12000000) {
            deposit2 = deposit2 + (deposit2 * persent2);
            String result = String.format("%.3f",deposit2);
            month2++;
            if (month2 % 6 == 0) {
                System.out.println(month2 + " месяц, сумма на счете составляет " + result);
            }
        }

        System.out.println("Задача 6");
        double deposit3 = 15000;
        double persent3 = 0.07;
        int month3 = 1;
        int year2 = 9;
        int limitMonth = year2 * 12;
        while (month3 <= limitMonth) {
            deposit3 = deposit3 + (deposit3 * persent3);
            String result = String.format("%.3f",deposit3);
            month3++;
            if (month3 % 6 == 0) {
                System.out.println("Месяц " + month3 + ", сумма на счете составляет : " + result);
            }
        }

        System.out.println("Задача 7");
        int friday = 5;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        }

        System.out.println("Задача 8");
        int thisYear = 2024;
        int startYear = thisYear - 200;
        int endYear = thisYear + 100;
        for (year = startYear; year <= endYear; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
        }
}