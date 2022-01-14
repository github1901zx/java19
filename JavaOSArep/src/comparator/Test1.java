package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("ivan");
        list.add("elena");
        list.add("ramil");
        list.add("gena");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("------------------------------");
        System.out.println(list);
    }
}
