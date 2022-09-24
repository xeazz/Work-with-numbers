import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        StreamMain streamMain = new StreamMain(list);
        streamMain.newStream(list);
        List<Integer> newList = new ArrayList<>();
        for (int x : list) {
            if (x > 0) {
                if (x % 2 == 0) newList.add(x);
            }
        }
        Collections.sort(newList);
        System.out.println(newList);
    }
}