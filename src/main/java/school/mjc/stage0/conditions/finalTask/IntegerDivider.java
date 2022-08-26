package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        System.out.println(divider==0? "division by zero":dividend==divider*divider?"can be divided completely":"cannot be divided completely");
    }
}
