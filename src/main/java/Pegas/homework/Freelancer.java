package Pegas.homework;

import java.math.BigDecimal;

public class Freelancer extends BaseEmployee{
    private final static int WIRKINGHOUR = 8;
    public Freelancer(String name, String SerName, int id, double salary) {
        super(name, SerName, id, salary);
    }

    @Override
    public BigDecimal salaryCount(double salaryPerHour, int Workdays) {
        BigDecimal decimal;
        return decimal = new BigDecimal(salaryPerHour*Workdays*WIRKINGHOUR);
    }
}
