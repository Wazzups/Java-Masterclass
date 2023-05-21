public class NumberOfDaysInMonthChallenge {

/* Number Of Days In Month
Write a method isLeapYear with a parameter of type int named year.
The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false.
Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false.
A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.

Examples of input/output:
isLeapYear(-1600); →  should return false since the parameter is not in the range (1-9999)
isLeapYear(1600); → should return true since 1600 is a leap year
isLeapYear(2017); → should return false since 2017 is not a leap year
isLeapYear(2000); → should return true because 2000 is a leap year  */

    public static void main(String[] args) {
        getDaysInMonth(1, 2020);
        getDaysInMonth(2, 2020);
        getDaysInMonth(2, 2018);
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month >= 1 && month <= 12) && (year >= 1 && year <= 9999)) {
            return switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 4, 6, 9, 11 -> 30;
                case 2 -> isLeapYear(year) ? 29 : 28;
                default -> -1;
            };
        } else {
            return -1;
        }
    }
}
