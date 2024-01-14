package course2.part2.ch3.model;

@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);
}
