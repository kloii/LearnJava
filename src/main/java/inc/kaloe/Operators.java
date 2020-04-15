package inc.kaloe;

public class Operators {
    int result = 5;
    int value = 10;
    boolean isAlien = false;

    public void operatorsChallenge() {
        double doubleValue1 = 20.00D;
        double doubleValue2 = 80.00D;

        double sumOfTwoDoubleValues = (doubleValue1 + doubleValue2) * 100.00D;
        System.out.println("sumOfTwoDoubleValues = " + sumOfTwoDoubleValues);

        double reminder1 = sumOfTwoDoubleValues % 40.00D;
        System.out.println("reminder1 = " + reminder1);

        boolean isNoReminder = (reminder1 == 0)? true : false;
        System.out.println("isNoReminder is: " + isNoReminder);

        if (!isNoReminder)
            System.out.println("Got some reminder");
        else System.out.println("There is no reminder");

    }

}
