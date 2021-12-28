package CaseStudy.Task1.modell;

import CaseStudy.Task1.modell.Person.Person;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Contract extends Person {
    @Override
    public int compareTo(Person o) {
        return 0;
    }

    @Override
    public int compare(Person o1, Person o2) {
        return 0;
    }

    @Override
    public Comparator<Person> reversed() {
        return super.reversed();
    }

    @Override
    public Comparator<Person> thenComparing(Comparator<? super Person> other) {
        return super.thenComparing(other);
    }

    @Override
    public <U> Comparator<Person> thenComparing(Function<? super Person, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return super.thenComparing(keyExtractor, keyComparator);
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Person> thenComparing(Function<? super Person, ? extends U> keyExtractor) {
        return super.thenComparing(keyExtractor);
    }

    @Override
    public Comparator<Person> thenComparingInt(ToIntFunction<? super Person> keyExtractor) {
        return super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator<Person> thenComparingLong(ToLongFunction<? super Person> keyExtractor) {
        return super.thenComparingLong(keyExtractor);
    }

    @Override
    public Comparator<Person> thenComparingDouble(ToDoubleFunction<? super Person> keyExtractor) {
        return super.thenComparingDouble(keyExtractor);
    }
}
