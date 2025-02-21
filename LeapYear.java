public class LeapYear {
    public static void main(String[] args) {
        int year = 2024; // You can change this to any year you want to check

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static boolean isLeapYear(int year) {
        // A year is a leap year if it is divisible by 4 but not by 100,
        // except if it is also divisible by 400.
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}