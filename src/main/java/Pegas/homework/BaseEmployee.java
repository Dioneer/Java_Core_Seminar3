package Pegas.homework;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public abstract class BaseEmployee {
    private String name;
    private String SerName;
    private int id;
    private double salary;
    public abstract BigDecimal salaryCount(double salary, int Workdays);
}
