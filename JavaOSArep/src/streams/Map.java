package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add(" privet ");
        list.add(" kak dela ? ");
        list.add(" normalno ");
        list.add(" poka ");

        System.out.println(list);

        List<Integer> list2 = list.stream().map(e -> e.length()).collect(Collectors.toList());

        System.out.println(list2);

        List<Integer> list3 = list2.stream().map(e -> {
                    if (e % 3 == 0) {
                        e = e / 3;
                    }
                    return e;
                }
        ).collect(Collectors.toList());
        System.out.println(list3);

    }
}
