public class Work1 {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");

        int weightKgApples = 1257;
        byte weightKgPears = 115;
        short weightKgOranges = 457;
        long weightKgCherries = 35650;
        float weightKgBananas = 24000.576f;
        double weightKgPeanut = 12760.45768;
        System.out.println("Значение переменной " + "weightKgApples " + "с типом " + "int " + "равно " + weightKgApples);
        System.out.println("Значение переменной " + "weightKgPears " + "с типом " + "byte " + "равно " + weightKgPears);
        System.out.println("Значение переменной " + "weightKgOranges " + "с типом " + "short " + "равно " + weightKgOranges);
        System.out.println("Значение переменной " + "weightKgCherries " + "с типом " + "long " + "равно " + weightKgCherries);
        System.out.println("Значение переменной " + "weightKgBananas " + "с типом " + "float " + "равно " + weightKgBananas);
        System.out.println("Значение переменной " + "weightKgPeanut " + "с типом " + "double " + "равно " + weightKgPeanut);

        // Задача 2
        System.out.println("Задача 2");

        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        boolean d = 5 > 7;
        short e = 569;
        short f = -159;
        short g = 27897;
        byte y = 67;

        // Задача 3
        System.out.println("Задача 3");

        byte classLP = 23; // Класс Людмиллы Павловны
        byte classAS = 27; // Класс Анны Сергеевны
        byte classEA = 27; // Класс Екатерина Андреевна
        short totalPaper = 480;
        int allSchoolboy = classLP + classAS + classEA;
        int paperSchoolboy = totalPaper / allSchoolboy;
        System.out.println("На каждого ученика рассчитано " + paperSchoolboy + " листов бумаги");

        // Задача 4
        System.out.println("Задача 4");

        byte bottlesPerMinute = 16 / 2; // Определяем сколько бутылок в минуту
        int bottlesPer20Minutes = bottlesPerMinute * 20; // Количество бутылок за 20 минут
        System.out.println("За 20 минут работы машины произведено бутылок " + bottlesPer20Minutes + " штук");

        short minutesPerDay = 24 * 60; // Определяем сколько минут в сутках
        int bottlesPerDay = minutesPerDay * bottlesPerMinute; // Количество бутылок за сутки
        System.out.println("За сутки работы машины произведено бутылок " + bottlesPerDay + " штук");

        int bottlesPer3Day = bottlesPerDay * 3; // Количество бутылок за трое суток
        System.out.println("За три дня работы машины произведено бутылок " + bottlesPer3Day + " штук");

        int bottlesPerMonth = minutesPerDay * 30; // Количество бутылок за месяц
        System.out.println("За месяц работы машины произведено бутылок " + bottlesPerMonth + " штук");

        // Задача 5
        System.out.println("Задача 5");

        byte totalPaint = 120; // Всего банок краски
        byte whitePaintClass = 2; // Белой краски на один класс
        byte brownPaintClass = 4; // Коричневой краски на один класс
        int totalPaintClass = whitePaintClass + brownPaintClass; // Всего краски на класс
        int totalClass = totalPaint / totalPaintClass; // Всего классов
        int totalWhitePaint = whitePaintClass * totalClass; // Всего белой краски
        int totalBrownPaint = brownPaintClass * totalClass; // Всего коричневой краски
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски.");

        // Задача 6
        System.out.println("Задача 6");

        int bananaWeight = 5 * 80; // 5 бананов по 80 грамм
        int milkWeight = 2 * 105; // 200 мл молока (100 мл = 105 грамм)
        int iceCreamWeight = 2 * 100; // 2 брикета по 100 грамм
        int eggsWeight = 4 * 70; // 4 яйца по 70 грамм
        int totalWeight = bananaWeight + milkWeight + iceCreamWeight + eggsWeight; // общий вес в граммах
        double totalWeightKg  = totalWeight / 1000.0; // Переводим граммы в килограммы
        System.out.println(totalWeightKg);

        // Задача 7
        System.out.println("Задача 7");

        int excessWeightGr = 7 * 1000; // Вес, который нужно сбросить в граммах
        short minWeightPerDay = 250; // Минимальная потеря веса (грамм) в день
        short maxWeightPerDay = 500; // Максимальная потеря веса (грамм) в день
        int minAmountDays = excessWeightGr / minWeightPerDay; // Минимальное количество дней
        int maxAmountDays = excessWeightGr / maxWeightPerDay; // Максимальное количество дней
        int averageWeightPerDay = (minWeightPerDay + maxWeightPerDay) / 2; // Средее количество потери веса (грамм) в день
        double averageAmountDays = (double) excessWeightGr / averageWeightPerDay; // Среднее количество дней потери веса
        int roundedAverageAmountDays = (int) Math.round(averageAmountDays); // Округляем значение количесто дней
        System.out.println("Если спортсмен будет терять по " + minWeightPerDay + " грамм в день, то всего затратит " + minAmountDays + " дней");
        System.out.println("Если спортсмен будет терять по " + maxWeightPerDay + " грамм в день, то всего затратит " + maxAmountDays + " дней");
        System.out.println("Если спортсмен будет терять в среднем по " + averageWeightPerDay + " грамм в день, то в среднеи затратит " + roundedAverageAmountDays + " дней");

        // Задача 8
        System.out.println("Задача 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int percent10SalaryMasha = salaryMasha / 10; // 10% от зарплаты Маши
        int percent10SalaryDenis = salaryDenis / 10; // 10% от зарплаты Дениса
        int percent10SalaryKristina = salaryKristina / 10; // 10% от зарплаты Кристины
        int salaryIncreaseMasha = salaryMasha + percent10SalaryMasha; // Повышение ЗП Маши на 10%
        int salaryIncreaseDenis = salaryDenis + percent10SalaryDenis; //Повышение ЗП Дениса на 10%
        int salaryIncreaseKristina = salaryKristina + percent10SalaryKristina; // Повышение ЗП Кристины на 10%
        System.out.println("Маша теперь получает " + salaryIncreaseMasha + " рублей. Годовой доход вырос на " + percent10SalaryMasha + " рублей.");
        System.out.println("Денис теперь получает " + salaryIncreaseDenis + " рублей. Годовой доход вырос на " + percent10SalaryDenis + " рублей.");
        System.out.println("Кристина теперь получает " + salaryIncreaseKristina + " рублей. Годовой доход вырос на " + percent10SalaryKristina + " рублей.");






    }
}