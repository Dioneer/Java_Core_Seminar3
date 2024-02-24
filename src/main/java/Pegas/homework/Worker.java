package Pegas.homework;

import java.math.BigDecimal;

public class Worker extends BaseEmployee{
    public Worker(String name, String SerName, int id, double salary) {
        super(name, SerName, id, salary);
    }

    @Override
    public BigDecimal salaryCount(double salary, int Workdays) {
        BigDecimal decimal;
        return decimal = new BigDecimal(salary*Workdays);
    }
}
