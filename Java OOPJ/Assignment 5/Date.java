public class Date {
    private int day;
    private int month;
    private int year;

    // Constructor
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Method to check if the date is valid
    public boolean isValid() {
        if (year < 1 || month < 1 || month > 12 || day < 1)
            return false;
        int maxDay = 31;
        if (month == 4 || month == 6 || month == 9 || month == 11)
            maxDay = 30;
        else if (month == 2) {
            maxDay = isLeapYear() ? 29 : 28;
        }
        return day <= maxDay;
    }

    // Method to get the day of the week (0 for Sunday, 1 for Monday, ...)
    public int getDayOfWeek() {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (day + x + (31*m0)/12) % 7;
    }

    // Method to check if the year is a leap year
    public boolean isLeapYear() {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    // Method to get the date of the next day
    public Date getNextDay() {
        int nextDay = day + 1;
        int nextMonth = month;
        int nextYear = year;
        int maxDay = 31;
        if (month == 4 || month == 6 || month == 9 || month == 11)
            maxDay = 30;
        else if (month == 2) {
            maxDay = isLeapYear() ? 29 : 28;
        }
        if (nextDay > maxDay) {
            nextDay = 1;
            nextMonth++;
            if (nextMonth > 12) {
                nextMonth = 1;
                nextYear++;
            }
        }
        return new Date(nextDay, nextMonth, nextYear);
    }

    // Method to get the date of the previous day
    public Date getPreviousDay() {
        int prevDay = day - 1;
        int prevMonth = month;
        int prevYear = year;
        if (prevDay < 1) {
            prevMonth--;
            if (prevMonth < 1) {
                prevMonth = 12;
                prevYear--;
            }
            int maxDay = 31;
            if (prevMonth == 4 || prevMonth == 6 || prevMonth == 9 || prevMonth == 11)
                maxDay = 30;
            else if (prevMonth == 2) {
                maxDay = isLeapYear() ? 29 : 28;
            }
            prevDay = maxDay;
        }
        return new Date(prevDay, prevMonth, prevYear);
    }

    // Override toString method to print the date in the format: dd-mm-yyyy
    @Override
    public String toString() {
        return String.format("%02d-%02d-%04d", day, month, year);
    }

    // Example Usage
    public static void main(String[] args) {
        Date date = new Date(31, 12, 2022);
        System.out.println("Is Entered date is valid: "+date.isValid()); // true
        System.out.println("The Day of Week is: "+date.getDayOfWeek()); // 6 (Saturday)
        System.out.println("Is Enter year is leapyear: "+date.isLeapYear()); // false
        Date nextDay = date.getNextDay();
        System.out.println("Next Date of Entered Date: "+nextDay); // 01-01-2023
        Date previousDay = date.getPreviousDay();
        System.out.println("Previousday of Entered Date: "+previousDay); // 30-12-2022
    }
}
