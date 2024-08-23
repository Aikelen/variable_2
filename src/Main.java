public class Main {
    public static void main(String[] args) {
        // 1
        int A = 33333;
        System.out.println("Значение переменной A с типом int равно " + A);
        byte B = 111;
        System.out.println("Значение переменной В с типом byte равно " + B);
        short C = 5555;
        System.out.println("Значение переменной C с типом short равно " + C);
        long D = 22222222;
        System.out.println("Значение переменной D с типом long равно " + D);
        float E = 6666.6666f;
        System.out.println("Значение переменной E с типом float равно " + E);
        double F = 77777.777777d;
        System.out.println("Значение переменной F с типом double равно " + F);


        //2
        double firstVariable = 27.12;
        System.out.println("firstVariable : " + firstVariable);
        long secondVariable = 987678965549L;
        System.out.println("secondVariable : " + secondVariable);
        double thirdVariable = 2786.00;
        System.out.println("thirdVariable : " + thirdVariable);
        int fourthVariable = 569;
        System.out.println("fourthVariable : " + fourthVariable);
        int fifthVariable = -159;
        System.out.println("fifthVariable : " + fifthVariable);
        long sixthVariable = 27897L;
        System.out.println("sixthVariable : " + sixthVariable);
        byte seventhVariable = 67;
        System.out.println("seventhVariable : " + seventhVariable);

        //3
        int ludmilaPavlovna = 23;
        int annaSergeevna = 27;
        int ekaterinaAndreevna = 30;
        int allPapers = 480;
        int paperForOneStudent = allPapers / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("На каждого ученика выделено " + paperForOneStudent + " листов бумаги");

        //4
        int bottleCar = 16;
        int twentyMinute = bottleCar * 10;
        System.out.println("За 20 минут "+ twentyMinute);
        int oneDay = (bottleCar * 24 * 60) / 2;
        System.out.println("За сутки " + oneDay);
        int forThreedays = (oneDay * 3) / 2;
        System.out.println("За 3 дня " + forThreedays);
        int oneMaonth = (oneDay * 30) / 2;
        System.out.println("За 1 месяц " + oneMaonth);

        //5
        int totalCans = 120;
        int whitePerClass = 2;
        int brownPerClass = 4;

        int classes = totalCans / (whitePerClass + brownPerClass);
        int whiteCans = classes * whitePerClass;
        int brownCans = classes * brownPerClass;
        System.out.println("В школе, где "+ classes +" классов, нужно " + whiteCans + " банок белой краски и " + brownCans + " банок коричневой краски");


        //6
        int bananasWeight = 5 * 80;
        int milkWeight = 200 * 105 / 100;
        int iceCreamWeight = 2 * 100;
        int eggsWeight = 4 * 70;

        int totalWeightGrams = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        double totalWeightKg = totalWeightGrams / 1000.0;

        System.out.println("Вес спортзавтрака в граммах: " + totalWeightGrams + " грамм.");
        System.out.println("Вес спортзавтрака в килограммах: " + totalWeightKg + " кг.");


        //7
        int weightToLoseGrams = 7000;
        int dailyLossMin = 250;
        int dailyLossMax = 500;


        int daysMinLoss = weightToLoseGrams / dailyLossMin;
        int daysMaxLoss = weightToLoseGrams / dailyLossMax;


        int averageDays = (daysMinLoss + daysMaxLoss) / 2;


        System.out.println("Для похудения на 7 кг спортсмену потребуется " + daysMinLoss + " дней, если он будет терять по 250 грамм в день.");
        System.out.println("Для похудения на 7 кг спортсмену потребуется " + daysMaxLoss + " дней, если он будет терять по 500 грамм в день.");
        System.out.println("В среднем для похудения на 7 кг потребуется " + averageDays + " дней.");



        //8
        double salaryMasha = 67760;
        double salaryDenis = 83690;
        double salaryKristina = 76230;
        double increaseRate = 0.10;


        double newSalaryMasha = salaryMasha + (salaryMasha * increaseRate);
        double newSalaryDenis = salaryDenis + (salaryDenis * increaseRate);
        double newSalaryKristina = salaryKristina + (salaryKristina * increaseRate);


        double yearlyIncomeMashaBefore = salaryMasha * 12;
        double yearlyIncomeMashaAfter = newSalaryMasha * 12;
        double yearlyIncomeDenisBefore = salaryDenis * 12;
        double yearlyIncomeDenisAfter = newSalaryDenis * 12;
        double yearlyIncomeKristinaBefore = salaryKristina * 12;
        double yearlyIncomeKristinaAfter = newSalaryKristina * 12;


        double differenceMasha = yearlyIncomeMashaAfter - yearlyIncomeMashaBefore;
        double differenceDenis = yearlyIncomeDenisAfter - yearlyIncomeDenisBefore;
        double differenceKristina = yearlyIncomeKristinaAfter - yearlyIncomeKristinaBefore;


        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + differenceMasha + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + differenceDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + differenceKristina + " рублей.");
    }
}