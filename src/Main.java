//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        byte bVariable = 7;
        short shVariable = 127;
        int iVariable = 7896;
        long lVariable = 837475445984205987L;

        double dVariable = 4.3;
        float fVariable = 5.6f;

        System.out.println("Значение переменной bVariable с типом byte = "  + bVariable +
                "\nпеременной shVariable с типом short = " + shVariable +
                "\nпеременной iVariable с типом int = " + iVariable +
                "\nпеременной lVariable с типом long = " + lVariable +
                "\nпеременной dVariable с типом double = " + dVariable +
                "\nпеременной fVariable с типом fVariable = " + fVariable);

        System.out.println();

        //Задача 2
        float f = 27.12f;
        long l = 987678965549L;
        double d = 2.786;
        int i = 569;
        short sh = -159;
        int i2 = 27897;
        byte b = 67;

        System.out.println();

        //Задача 3
        byte firstClass = 23;
        byte secondClass = 27;
        byte thirdClass = 30;
        int numberSheetsPaper = 480;
        System.out.println("На каждого ученика рассчитано " + numberSheetsPaper / (firstClass + secondClass + thirdClass) + " листов бумаги");

        System.out.println();

        //Задача 4
        byte productivityPerMinute = 16/2;
        byte minutePerHour = 60;
        byte hoursPerDay = 24;
        byte daysPerMonth = 30;
        int productivityPerDay = productivityPerMinute * (hoursPerDay * minutePerHour);
        int productivityPer3Day = productivityPerMinute * (hoursPerDay * 3 * minutePerHour);
        int productivityPerMonth = productivityPerMinute * (hoursPerDay * daysPerMonth * minutePerHour);

        System.out.println();

        System.out.println("За 20 минут машина произвела " + productivityPerMinute * 20 + " бутылок" +
                "\nЗа сутки машина произвела " + productivityPerDay  + " бутылок" +
                "\nЗа трое суток машина произвела " + productivityPer3Day + " бутылок" +
                "\nЗа месяц машина произвела " + productivityPerMonth + " бутылок");

        System.out.println();

        //Задача 5
        short totalColorPerSchool = 120;
        byte whiteColorPerClass = 2;
        byte brownColorPerClass = 4;
        int totalNumberClasses = totalColorPerSchool / (whiteColorPerClass + brownColorPerClass);

        System.out.println("В школе, где " + totalNumberClasses + " классов, нужно " +
                totalNumberClasses * whiteColorPerClass + " банок белой краски и " + totalNumberClasses * brownColorPerClass + " банок коричневой краски");

        System.out.println();

        //Задача 6
        float weightBanana = 80f;
        float weightMilkPer100ml = 105f;
        float weightIceCream = 100f;
        float weightEgg = 70f;
        float gramsPerKilogram = 1000f;

        float totalWeightDish = weightBanana * 5 + weightMilkPer100ml * 2 + weightIceCream * 2 + weightEgg * 4;
        System.out.println("Общий вес блюда в граммах составляет " + gramsPerKilogram + ", а в килограммах " + totalWeightDish / gramsPerKilogram);

        System.out.println();

        //Задача 7
        float gramsPerKilo = 1000f;
        float goalKilo = 7f;
        float goalGrams = gramsPerKilo * goalKilo;
        float minWeightLoss = 250f;
        float maxWeightLoss = 500f;

        System.out.println("Если по 250 грамм в день, понадобится " + goalGrams / minWeightLoss + " дней" +
        "\nЕсли по 500 грамм, то понадобится " + goalGrams / maxWeightLoss + " дней" +
                "\nА в среднем понадобится " + goalGrams / ((minWeightLoss + maxWeightLoss) / 2) + " дней");

        System.out.println();

        //Задача 8
        float wageRate = 0.1f;
        float mashaSalary = 67760f;
        float denisSalary = 83690f;
        float kristinaSalary = 76230f;

        float mashaNewSalary = mashaSalary + mashaSalary * wageRate;
        float denisNewSalary = denisSalary + denisSalary * wageRate;
        float kristinaNewSalary = kristinaSalary + kristinaSalary * wageRate;

        float mashaOldSalaryPerYear = mashaSalary * 12;
        float denisOldSalaryPerYear = denisSalary * 12;
        float kristinaOldSalaryPerYear = kristinaSalary * 12;

        float mashaNewSalaryPerYear = mashaNewSalary * 12;
        float denisNewSalaryPerYear = denisNewSalary * 12;
        float kristinaNewSalaryPerYear = kristinaNewSalary * 12;

        System.out.println("В новом году Маша будет получать " + mashaNewSalary + " годовой доход вырос на " + (mashaNewSalaryPerYear - mashaOldSalaryPerYear) +
                ", \nДенис " + denisNewSalary + " годовой доход вырос на " + (denisNewSalaryPerYear - denisOldSalaryPerYear) +
                ", \nКристина " + kristinaNewSalary + " годовой доход вырос на " + (kristinaNewSalaryPerYear - kristinaOldSalaryPerYear));
        System.out.println();

    }
}