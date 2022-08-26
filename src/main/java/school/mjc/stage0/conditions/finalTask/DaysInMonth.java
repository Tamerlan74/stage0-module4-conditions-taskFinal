package school.mjc.stage0.conditions.finalTask;

import java.time.LocalDate;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year<0 || month<1 ||month>12){
            System.out.println("invalid date");
        }else {
            System.out.println(LocalDate.of(year, month, 1).lengthOfMonth());

        }
    }
}
