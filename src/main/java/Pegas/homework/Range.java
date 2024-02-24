package Pegas.homework;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import java.util.Iterator;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Range implements Iterable<Integer>{
    int start;
    int end;

    public static Range fromTo(int start, int end){return new Range(start,end);}

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator(start);
    }
    class MyIterator implements Iterator<Integer>{
        int start;

        public MyIterator(int start) {
            this.start = start;
        }

        @Override
        public boolean hasNext() {
            if(start<=end) return true;
            return false;
        }

        @Override
        public Integer next() {
            return start++;
        }
    }
}
