package Pegas.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * first two tasks
         */
        List<BaseEmployee> employees = new ArrayList<>(){{
            add(new Freelancer("Ivan","Ivanov", 5, 32500));
            add(new Freelancer("Pavel","Pavlov", 15, 18600));
            add(new Freelancer("Petr","Petrov", 52, 16540.50));
            add(new Worker("Mariya","Ivanova", 2, 17800));
            add(new Worker("Uliana","Pavlova", 12, 19540.50));
            add(new Worker("Kira","Petrova", 22, 19000));
        }};
        System.out.println("Before sort" + employees);
        System.out.println("======================================================================");
        /**
         * third task
         */
        employees.sort(new MyComparator(SortType.ASCENDING));
        System.out.println("After sort" + employees);
        /**
         * forth task v1
         */
        Iterator<BaseEmployee> iterator = employees.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        /**
         * forth task v2
         */
        for (Integer i: Range.fromTo(0, employees.size()-1)){
            System.out.println(employees.get(i));
        }

    }
}
