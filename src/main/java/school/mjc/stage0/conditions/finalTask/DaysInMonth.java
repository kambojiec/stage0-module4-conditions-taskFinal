package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year <= 0) {
            System.out.println("Invalid date");
            return;
        }

        if (month < 1 || month > 12) {
            System.out.println("Invalid date");
            return;
        }

        int daysInMonth;
        switch (month) {
            case 2: // February
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    daysInMonth = 29; // Leap year
                } else {
                    daysInMonth = 28; // Non-leap year
                }
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                daysInMonth = 30;
                break;
            default:
                daysInMonth = 31;
                break;
        }

        System.out.println(daysInMonth);
    }
}
