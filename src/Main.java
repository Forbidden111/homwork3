import java.sql.SQLOutput;

public class Main {

    public static void  main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("задача1");
        int a = 44;
        byte b = 4;
        short c = 77;
        long d = 799L;
        float e = 499.8f;
        double f = 56.897;
        System.out.println("значение переменной 'a'с типом int равно " + a );
        System.out.println("значение переменной 'b'с типом byte равно " + b );
        System.out.println("значение переменной 'c'с типом short равно " + c );
        System.out.println("значение переменной 'd'с типом long равно " + d );
        System.out.println("значение переменной 'e'с типом float равно " + e );
        System.out.println("значение переменной 'f'с типом double равно " + f );


    }
    public static void task2() {
        System.out.println("задача2");
        float f = 27.12f;
        long l = 987678965549L;
        double d = 2.786;
        short s = 569;
        int i = -159;
        int ii = 27897;
        byte b = 67;
        System.out.println(f);
        System.out.println(l);
        System.out.println(d);
        System.out.println(s);
        System.out.println(i);
        System.out.println(ii);
        System.out.println(b);
    }
    public static void task3() {
        System.out.println("задача 3");

        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        int result = class1 + class2 + class3;
        System.out.println(" общее количество учеников в классе " +  result );
       short listCount= 480;
        System.out.println("всего листов" + listCount );
        int a = 480;
        int b = 80;
        int c = a / b ;
        System.out.println(c);
        System.out.println("На каждого ученика рассчитано " + c +" листов бумаги ");

    }
    public static void task4() {
        System.out.println("задача 4");
        int bottles = 16;
        int minutes = 2;
        int bottlesPerMinute = bottles / minutes;
        int bottlesPer20Minutes = bottlesPerMinute * 20;
        int bottlesPerHour = bottlesPer20Minutes * 3;
        int bottlesPerDay = bottlesPerHour * 24;
        int bottlesPer3Days = bottlesPerDay * 3;
        int bottlesPerMonth = bottlesPer3Days * 10;
        System.out.println("За 20 минут  машина произвела " + bottlesPer20Minutes + " штук бутылок");
        System.out.println("За сутки   машина произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("За 3 дня  машина произвела " + bottlesPer3Days + " штук бутылок");
        System.out.println("За месяц  машина произвела " + bottlesPerMonth + " штук бутылок");

        // task 5
        System.out.println("задача 5");
        int totalCans =120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;
        int totalClasses = totalCans / (whiteCansPerClass + brownCansPerClass);
        int totalWhiteCans = whiteCansPerClass * totalClasses;
        int totalBrownCans = brownCansPerClass * totalClasses;
        System.out.println(" в школе, где " + totalClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");

        // task 6
        System.out.println("задача 6");
        int bananasCount = 5;
        int milkCount = 2;
        int iceCreamCount = 2;
        int eggsCount = 4;
        int weightBananaUnit = 80;
        int weightMilkUnit = 105;
        int weightIceCreamUnit = 100;
        int weightEggUnit = 70;
        int totalWeightInGrams = bananasCount * weightBananaUnit + milkCount * weightMilkUnit + iceCreamCount * weightIceCreamUnit +  eggsCount * weightEggUnit;
        double totalWeightInKg = totalWeightInGrams / 1_000D;
        System.out.println("общий вес в граммах" + totalWeightInGrams + ", в кг " + totalWeightInKg);

        // task 7
        System.out.println("задача 7");
        int weightForLossInGrams = 7000;
        int lossWeightPerDayMin = 250;
        int lossWeightPerDayMax = 500;
        double maxDaysCount = (double) weightForLossInGrams / lossWeightPerDayMin;
        double minDaysCount = (double) weightForLossInGrams / lossWeightPerDayMax;
        double lossWeightPerDayAverage = (lossWeightPerDayMin + lossWeightPerDayMax) / 2D;
        double averageDaysCount = weightForLossInGrams / lossWeightPerDayAverage;
        System.out.println("минимальное количество дней для похудения " + minDaysCount);
        System.out.println("максимальное количество дней для похудения " + maxDaysCount);
        System.out.println("Среднее количество дней для похудения " + averageDaysCount);

        // task 8
        System.out.println("задача 8");
        int mashaSalary = 67760;
        int DenisSalary = 83690;
        int kristinaSalary = 76238;

        double indexPercent =1.1;

        double newMashaSalary = mashaSalary * indexPercent;
        double newDenisSalary = DenisSalary * indexPercent;
        double newKristinaSalary = kristinaSalary * indexPercent;

        double annualMashaSalary = 12 * mashaSalary;
        double newAnnualMashaSalary = 12 * newMashaSalary;

        double annualDenisSalary = 12 * DenisSalary;
        double newAnnualDenisSalary = 12 * newDenisSalary;

        double annualKristinaSalary = 12 * kristinaSalary;
        double newAnnulKristinaSalary = 12 * newKristinaSalary;

        System.out.println("Маша теперь получает " + newMashaSalary + " рублей. Годовой доход вырос на " + (newAnnualMashaSalary - annualMashaSalary) + " рублей ");
        System.out.println("Денис теперь получает " + newDenisSalary + " рублей. Годовой доход вырос на " + (newAnnualDenisSalary - annualDenisSalary) + " рублей ");
        System.out.println("Кристина теперь получает " + newKristinaSalary + " рублей. Годовой доход вырос на " + (newAnnulKristinaSalary - annualKristinaSalary) + " рублей ");






    }
    }
