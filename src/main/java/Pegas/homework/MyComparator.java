package Pegas.homework;

import java.util.Comparator;

public class MyComparator implements Comparator<BaseEmployee> {
    private SortType sortType;
    public MyComparator(SortType sortType) {
        this.sortType = sortType;
    }
    @Override
    public int compare(BaseEmployee o1, BaseEmployee o2) {
        int result = sortType==SortType.ASCENDING? Double.compare(o1.getSalary(),o2.getSalary()):Double.compare(o2.getSalary(),o1.getSalary());
        if(result==0){
            result = sortType==SortType.ASCENDING? o1.getSerName().compareTo(o2.getSerName()):o2.getSerName().compareTo(o1.getSerName());
            if(result==0){
                result = sortType==SortType.ASCENDING? o1.getName().compareTo(o2.getName()):o2.getName().compareTo(o1.getName());
            }
        }
        return result;
    }
}
