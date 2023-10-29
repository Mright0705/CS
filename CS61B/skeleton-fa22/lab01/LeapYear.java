/**
 * Class that determines whether or not a year is a leap year.
 * 
 * @author Mright
 */
public class LeapYear {

    /**
     * 判断是否是闰年
     */
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;

    }

    /** Calls isLeapYear to print correct statement. */
    private static void checkLeapYear(int year) {
        if (isLeapYear(year)) {
            System.out.printf("%d is a leap year.\n", year);
        } else {
            System.out.printf("%d is not a leap year.\n", year);
        }
    }

    /** Basic (Optional) Sanity Tests */
    public static void main(String[] args) {
        System.out.println("Checking the year 2000, which should be a leap year:");
        checkLeapYear(2000);
        System.out.println("Checking the year 1700, which should be not a leap year:");
        checkLeapYear(1700);
    }
}