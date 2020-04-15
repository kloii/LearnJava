package inc.kaloe;

public class LearnControlFlowStatement {

    private static final int INVALID_VALUE = -1;
    private static final String INVALID_VALUE_MSG = "Invalid Value";

    private static final int SMALL_PACK_KG = 1;
    private static final int BIG_PACK_KG = 5;

    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Day " + day + " of the week is Sunday");
                break;
            case 1:
                System.out.println("Day " + day + " of the week is Monday");
                break;
            case 2:
                System.out.println("Day " + day + " of the week is Tuesday");
                break;
            case 3:
                System.out.println("Day " + day + " of the week is Wednesday");
                break;
            case 4:
                System.out.println("Day " + day + " of the week is Thursday");
                break;
            case 5:
                System.out.println("Day " + day + " of the week is Friday");
                break;
            case 6:
                System.out.println("Day " + day + " of the week is Saturday");
                break;
            default:
                System.out.println("Day " + day + " is Invalid day input");
                break;
        }
    }

    public static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        LearnMethods myLearnMethods = new LearnMethods();

        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return INVALID_VALUE;
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                case 2:
                    return (myLearnMethods.isLeapYear(year)) ? 29 : 28;
                default:
                    return INVALID_VALUE;
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Start from any time to find 3 prime numbers
    //Strop after finding 3 prime numbers
    public static void findPrimeNumbers(int startNumber, int countNumber) {
        int count = 0;

        for (int i = startNumber; i < Integer.MAX_VALUE; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i + " is a Prime number.");
                if (count == countNumber) {
                    System.out.println("Exiting finding more prime numbers");
                    break;
                }
            }
        }
    }

    // sum 5 numbers up.
    // these 5 numbers are from 1 to 1000 inclusive, and they can be divided by both 3 and 5.
    public static void sum35() {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0 && i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println("Find number: " + i);
                if (count == 5) {
                    break;
                }
            }
        }
        System.out.println("All " + count + " numbers are found and summed up.");
        System.out.println("And the sum is: " + sum);
    }

    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        }
        if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static int sumOdd(int startNumber, int endNumber) {
        if ((startNumber <= 0) || (endNumber <= 0) || (startNumber > endNumber)) {
            return INVALID_VALUE;
        }

        int sum = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            if (isOdd(i)) {
                sum += i;
                System.out.println(i + " is an odd number");
                System.out.println("sum now is: " + sum);
            }
        }
        return sum;
    }

    public static boolean isEvenNumber(int number) {
        while (number % 2 == 0) {
            System.out.println(number + " is Even number");
            return true;
        }
        return false;
    }

    public static int sumEven(int startNumber, int countsOfEvenNumber) {
        int sum = 0;
        int counts = 0;
        while (counts < countsOfEvenNumber) {
            if (isEvenNumber(startNumber)) {
                System.out.println(startNumber + " is Even number");
                sum += startNumber;
                counts++;
            }
            startNumber++;
        }
        System.out.println("sum of " + counts + " found even numbers is: " + sum);
        return sum;
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            System.out.println("Input number is Invalid.");
            return INVALID_VALUE;
        }

        int sum = 0;

        while (number > 0) {

            int digit = number % 10;
            sum += digit;

            number = number / 10;
        }
        System.out.println("The sum = " + sum);
        return sum;

    }

    public static boolean isPalindrome(int number) {

        int reverseNumber = 0;
        int tempNumber = number;

        while (Math.abs(tempNumber) > 0) {
            int remainder = tempNumber % 10;
            reverseNumber *= 10;
            reverseNumber += remainder;

            tempNumber /= 10;
        }
        System.out.println(number + "'s reverse number is: " + reverseNumber);

        if (number == reverseNumber) {
            System.out.println(number + " is a palindrome number.");
            return true;
        } else {
            System.out.println(number + " is Not a palindrome number.");
            return false;
        }

    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            System.out.println(number + " is an Invalid number");
            return INVALID_VALUE;
        }

        int sum;
        int lastDigit = number % 10;
        System.out.println(number + "'s last digit is: " + lastDigit);

        if (number < 10) {
            sum = number * 2;
            System.out.println(number + "'s first digit is: " + number);
            System.out.println("the sum = " + sum);
            return sum;
        }

        while (number >= 10) {
            number = number / 10;
            if (number < 10) {
                break;
            }
        }
        System.out.println("first digit is: " + number);
        sum = number + lastDigit;
        System.out.println("the sum = " + sum);
        return sum;
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            System.out.println(number + " is an Invalid input");
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if ((digit % 2) == 0) {
                sum += digit;
            }
            number /= 10;
        }
        System.out.println("Sum of even digits is: " + sum);
        return sum;
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        if ((number1 < 10) || (number1 > 99) || (number2 < 10) || (number2 > 99)) {
            System.out.println("Invalid input");
            return false;
        }

        int digit1 = 0;
        int digit2 = 0;
        int tempNumber1 = number1;
        int tempNumber2 = number2;

        while (tempNumber1 > 0) {
            digit1 = tempNumber1 % 10;

            while (tempNumber2 > 0) {
                digit2 = tempNumber2 % 10;

                if (digit1 == digit2) {
                    System.out.println("Input numbers have shared digits");
                    return true;
                }

                tempNumber2 /= 10;
            }

            tempNumber2 = number2;
            tempNumber1 /= 10;
        }

        System.out.println("Input numbers do not have shared digits");
        return false;
    }

    public static boolean isValid(int number) {
        if ((number < 10) || (number > 1000)) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if (!(isValid(number1)) || !(isValid(number2)) || !isValid(number3)) {
            System.out.println("Invalid input number");
            return false;
        }

        int digit1 = number1 % 10;
        int digit2 = number2 % 10;
        int digit3 = number3 % 10;

        if (digit1 == digit2 || digit2 == digit3 || digit1 == digit3) {
            System.out.println("Has same last digit");
            return true;
        } else {
            System.out.println("Do not have same last digit");
            return false;
        }
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if ((first < 10) || (second < 10)) {
            System.out.println("Invalid input number");
            return -1;
        }

        int smallerNumber = (first < second) ? first : second;
        int greatestCommonDivisor = 0;
        int divisor = 1;
        int remainder1 = 0;
        int remainder2 = 0;

        while ((divisor >= 1) && (divisor <= smallerNumber)) {
            remainder1 = first % divisor;
            remainder2 = second % divisor;
            if ((remainder1 == 0) && (remainder2 == 0)) greatestCommonDivisor = divisor;
            divisor += 1;
        }
        System.out.println("The greatest common divisor is: " + greatestCommonDivisor);
        return greatestCommonDivisor;
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println(INVALID_VALUE_MSG);
        }

        int divisor = 1;
        while (divisor <= number) {
            if (number % divisor == 0) {
                System.out.println(divisor);
            }
            divisor++;
        }
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            System.out.println("Invalid input number");
            return false;
        }

        int perfectDivisor = 1;
        int sumOfPerfectDivisor = 0;

        while (perfectDivisor < number) {
            if (number % perfectDivisor == 0) {
                sumOfPerfectDivisor += perfectDivisor;
            }
            perfectDivisor++;
        }
        System.out.println("sum of perfect divisors = " + sumOfPerfectDivisor);

        if (number == sumOfPerfectDivisor) {
            System.out.println(number + " is a perfect number");
            return true;
        } else {
            System.out.println(number + " is not a perfect number");
            return false;
        }
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            System.out.println(INVALID_VALUE_MSG);
            return INVALID_VALUE;
        }

        if ((number >= 0) && (number < 10)) {
            System.out.println("Digits count of is 1.");
            return 1;
        }

        int digitCount = 1;
        while (number >= 10) {
            digitCount++;
            number /= 10;
        }
        System.out.println("Digits count of is " + digitCount);
        return digitCount;
    }

    public static int reverse(int number) {
        int reverseNumber = 0;
        int tempNumber = number;

        while (Math.abs(tempNumber) > 0) {
            int remainder = tempNumber % 10;
            reverseNumber *= 10;
            reverseNumber += remainder;

            tempNumber /= 10;
        }
        System.out.println("The reverse number is: " + reverseNumber);
        return reverseNumber;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println(INVALID_VALUE_MSG);
        }
        if (number == 0) {
            System.out.println("Zero");
        }

        int digitCount = getDigitCount(number);
        int reverseNumber = reverse(number);
        int digitCountReverseNumber = getDigitCount(reverseNumber);

        int lastDigit = 0;
        while (reverseNumber > 0) {
            lastDigit = reverseNumber % 10;
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println(INVALID_VALUE_MSG);
                    break;
            }
            reverseNumber /= 10;
        }

        if (digitCountReverseNumber < digitCount) {
            for (int i = digitCountReverseNumber; i < digitCount; i++) {
                System.out.println("ZERO");
            }
        }
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        return false;
    }

    public static int getLargestPrime (int number) {
        if (number <= 1) {
            System.out.println("-1");
            return -1;
        } else {
            int div = 2;
            while (div < number) {
                if (number % div != 0) {
                    div++;
                } else {
                    number = number / div;
                    div = 2;
                }
            }
            System.out.println(number);
            return number;
        }
    }

    public static void printSquarerStar (int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        }

        for(int i=0;i<number;i++)
        {
            for(int j=0;j<number;j++)

            {
                if (i==0 || j==0 || i==(number-1) || j==(number-1)) {
                    System.out.print("*");
                } else if (i==j){
                    System.out.println("*");
                } else if (i == (number-j+1)) {
                    System.out.println("*");
                } else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }

    }
}