import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class WeekCalender {

    public static void main(String[] args) {
        int year = 2025;

        LocalDate startOfYear = LocalDate.of(year, 1, 1);
        LocalDate endOfYear = LocalDate.of(year, 12, 31);

        LocalDate currentMonthStart = startOfYear.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
        LocalDate currentMonthEnd;

        while (!currentMonthStart.isAfter(endOfYear)) {
            currentMonthEnd = currentMonthStart.plusWeeks(4).with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));

            if (currentMonthEnd.isAfter(endOfYear)) {
                currentMonthEnd = endOfYear;
            }

            System.out.println("Month Start: " + currentMonthStart);
            System.out.println("Month End: " + currentMonthEnd);

            LocalDate weekStart = currentMonthStart;
            while (!weekStart.isAfter(currentMonthEnd)) {
                LocalDate weekEnd = weekStart.plusDays(6);
                if (weekEnd.isAfter(currentMonthEnd)) {
                    weekEnd = currentMonthEnd;
                }
                System.out.println("  Week: " + weekStart + " to " + weekEnd);
                weekStart = weekStart.plusWeeks(1);
            }

            System.out.println();

            currentMonthStart = currentMonthEnd.plusDays(1).with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        }
    }
}
