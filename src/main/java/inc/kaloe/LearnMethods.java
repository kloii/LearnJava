package inc.kaloe;

import static java.lang.Math.min;
import static java.lang.Math.round;

public class LearnMethods {

    private static final String INVALID_VALUE_MSG = "Invalid Value";
    private static final String ALL_EQUAL = "All numbers are equal";
    private static final String ALL_DIFFERENT = "All numbers are different";
    private static final String NEITHER_EQUAL_OR_DIFF = "Neither all are equal or different";

    public void displayHighScorePosition (String playerName, int playerScore) {
        int highScorePosition = calculateHighScorePosition(playerScore);
        System.out.println(playerName + " managed to get into position " +highScorePosition);
    }

    public int calculateHighScorePosition (int playerScore) {
        if (playerScore >1000)
            return 1;
        else if (playerScore>500 && playerScore<=1000)
            return 2;
        else if (playerScore> 100 && playerScore<=500)
            return 3;
        else return 4;

    }

    public static long toMilesPerHour (double kilometerPerHour){
        double exchangeRate = 0.621371D;

        if (kilometerPerHour < 0)
            return -1;
        else {
            return round (kilometerPerHour * exchangeRate);
        }
    }

    public static boolean isLeapYear (int year){
        if (year<1){
            return false;
        }
        else if (year>9999){
            return false;
        }
        else{
            if (year%4 == 0){
                if (year%100 == 0){
                    if (year%400 == 0){
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
    }

    public static void printIsLeapYear(int year){
        System.out.println("year " + year + " is a leap year. True or False? " + isLeapYear(year));
    }

    public static boolean areEqualByThreeDecimalPlaces (double doubleNumber1, double doubleNumber2){
        int intDoubleNumber1 = (int) (doubleNumber1 * 1000);
        int intDoubleNumber2 = (int) (doubleNumber2 * 1000);
        //System.out.println("intDoubleNumber1 = " +  intDoubleNumber1);
        //System.out.println("intDoubleNumber2 = " +  intDoubleNumber2);

        if (intDoubleNumber1 == intDoubleNumber2){
            System.out.println(doubleNumber1 + " and " + doubleNumber2 + " are equal by 3 digits.");
            return true;
        }
        else {
            System.out.println(doubleNumber1 + " and " + doubleNumber2 + " are not equal by 3 digits.");
            return false;
        }
    }

    public static boolean hasEqualSum (int intNumber1, int intNumber2, int sum){
        if ((intNumber1 + intNumber2) == sum){
            System.out.println(intNumber1 + " + " + intNumber2 + " == " + sum);
            return true;
        }
        else{
            System.out.println(intNumber1 + " + " + intNumber2 + " != " + sum);
            return false;
        }
    }

    public static boolean hasTeen (int age1, int age2, int age3){
        if (age1 < 13 || age1 >19){
            if (age2 < 13 || age2 > 19){
                if (age3 < 13 || age3 > 19){
                    System.out.println("There is no Teen number in " + age1 + ", " + age2 + ", " + age3 + ".");
                    return false;
                }
                else {
                    System.out.println("There Is Teen number in " + age1 + ", " + age2 + ", " + age3 + ".");
                    return true;
                }
            }
            else{
                System.out.println("There Is Teen number in " + age1 + ", " + age2 + ", " + age3 + ".");
                return true;
            }
        }
        else{
            System.out.println("There Is Teen number in " + age1 + ", " + age2 + ", " + age3 + ".");
            return true;
        }
    }

    public static boolean isTeen(int age){
        if (age>=13 && age<=19){
            System.out.println(age + " is a Teen number.");
            return true;
        }
        else{
            System.out.println(age + " is Not a Teen number.");
            return false;
        }
    }

    public static void printYearsAndDays (long minutes){

        if (minutes<0){
            System.out.println(INVALID_VALUE_MSG);
        }
        else {
            long minutesPerYear = 365 * 24 * 60;
            long minutesPerDay = 24 * 60;

            String minuteString = minutes + " min";

            long year = minutes / minutesPerYear;
            String yearString = year + " y";

            long day = (minutes % minutesPerYear) / minutesPerDay;
            String dayString = day + " d";

            System.out.println(minuteString + " = " + yearString + " and " + dayString);
        }
    }

    public static void printEqual (int number1, int number2, int number3){
        if ((number1<0) || (number2<0) || (number3<0)){
            System.out.println(INVALID_VALUE_MSG);
        }
        else {
            if ((number1!=number2) && (number2!=number3) && (number1!=number3)){
                System.out.println(ALL_DIFFERENT);
            }
            else if ((number2 == number3) && (number1 == number3)){
                System.out.println(ALL_EQUAL);
            }
            else{
                System.out.println(NEITHER_EQUAL_OR_DIFF);
            }
        }
    }

    public static boolean isCatPlaying (boolean summer, int temperature){
        if(summer){
            if ((temperature>=25) && (temperature<=45)){
                System.out.println("true because it's between 25 to 45 in summer time.");
                return true;
            }
            else{
                System.out.println("false because it's not in between 25 and 45 in summer time.");
                return false;
            }
        }
        else{
            if ((temperature>=25) && (temperature<=35)){
                System.out.println("true because it's between 25 to 35 in not-summer time.");
                return true;
            }
            else{
                System.out.println("false because it's not in between 25 and 35 in not-summer time.");
                return false;
            }
        }
    }
}
