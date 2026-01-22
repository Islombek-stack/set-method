import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(4);
        list.add(2);

        Collections.sort(list);

        Set<Integer> set = new LinkedHashSet<>(list);

        System.out.println(set);

        Set<String> list2 = new TreeSet<>();
        list2.add("Alex");
        list2.add("Bob");
        list2.add("Alex");
        list2.add("Don");

        System.out.println(list2);
    }
}