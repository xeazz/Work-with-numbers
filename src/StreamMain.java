import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    private List<Integer> list;

    public StreamMain(List<Integer> list) {
        this.list = list;
    }

    public void newStream(List<Integer> list) {
        Stream<Integer> stream = list.stream();
        list.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }
}
