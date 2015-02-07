package pack1;


import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int month;
        int year;


        Scanner input = new Scanner(System.in);

        do {

            System.out.println("Please enter a year after 1900.");
            year = input.nextInt();
            System.out.println("Please enter a valid month.");
            month = input.nextInt();

            if (year >= 1900 && month < 13 && month > 0) {
                break;
            }

        } while (true);


        printCalendar(month, year);


    }

    //methods

    private static String monthName(int monthNum) {
        String name;
        if (monthNum == 1) {
            name = "January";
            return name;
        } else if (monthNum == 2) {
            name = "February";
            return name;
        } else if (monthNum == 3) {
            name = "March";
            return name;
        } else if (monthNum == 4) {
            name = "April";
            return name;
        } else if (monthNum == 5) {
            name = "May";
            return name;
        } else if (monthNum == 6) {
            name = "June";
            return name;
        } else if (monthNum == 7) {
            name = "July";
            return name;
        } else if (monthNum == 8) {
            name = "August";
            return name;
        } else if (monthNum == 9) {
            name = "September";
            return name;
        } else if (monthNum == 10) {
            name = "October";
            return name;
        } else if (monthNum == 11) {
            name = "November";
            return name;
        } else if (monthNum == 12) {
            name = "December";
            return name;
        }

        return "Invalid";
    } //done

    private static boolean leapYear(int year) {
        return (year % 4) == 0 && (year % 100) == 0 && (year % 400 == 0);

    } //done

    /**
     * Finds the amount of days in the specified month and year.
     * @param month the provided month to check
     * @param year the provided year to check
     * @return the amount of days in the month.
     */
    private static int daysInMonth(int month, int year) {
        if (month == 1) {
            return 31;

        } else if (month == 2) { //if february
            if (leapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        } else if (month == 3) {
            return 31;
        } else if (month == 4) {
            return 30;
        } else if (month == 5) {
            return 31;
        } else if (month == 6) {
            return 30;
        } else if (month == 7) {
            return 31;
        } else if (month == 8) {
            return 31;
        } else if (month == 9) {
            return 30;
        } else if (month == 10) {
            return 31;
        } else if (month == 11) {
            return 30;
        } else if (month == 12) {
            return 31;
        }


        return 0;
    } //done

    private static int getStartingDay(int month, int year) {

        int days;
        int dayTotal = 0;

        for (int i = 1900; i < year; i++) { //years
            if (leapYear(i)) {
                dayTotal += 366;
            } else {
                dayTotal += 365;
            }
        }


        for (int l = 1; l < month; l++) {
            dayTotal += daysInMonth(l, year);

        }

        days = dayTotal % 7;

        return days;
    } //done

    private static void printCalendar(int month, int year) {

        String monthName = monthName(month);
        int startingDay = getStartingDay(month, year);


        System.out.println(monthName + " " + year);
        System.out.println("Su\tM\tTu\tW\tTh\tF\tSa");


        if (startingDay == 6) {
            System.out.print(1);
        } else if (startingDay == 0) {
            System.out.print("\t" + 1);

        } else if (startingDay == 1) {
            System.out.print("\t\t" + 1);


        } else if (startingDay == 2) {
            System.out.print("\t\t  " + 1);


        } else if (startingDay == 3) {
            System.out.print("\t\t\t " + 1);


        } else if (startingDay == 4) {
            System.out.print("\t\t\t\t" + 1);


        } else if (startingDay == 5) {
            System.out.print("\t\t\t\t\t " + 1);

        }


        for (int x = 2; x < daysInMonth(month, year); x++) {

            if (startingDay % 7 == 5) {
                System.out.print("\n" + x);
            } else {
                System.out.print("\t" + x);
            }
            startingDay++;

        }


    }


}
