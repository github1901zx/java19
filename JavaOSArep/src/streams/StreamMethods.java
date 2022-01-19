package streams;

import lambda.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);
        list.add(3);
        int e = list.stream().reduce((a, b) -> a=a+b).get();
        System.out.println(e);


        Students st1 = new Students("Irina",20,'f');
        Students st2 = new Students("Oleg",25,'m');
        Students st3 = new Students("Elena",22,'f');
        Students st4 = new Students("Olga",22,'f');
        Students st5 = new Students("Ivan",21,'m');

        ArrayList<Students> stdList = new ArrayList<>();

        stdList.add(st1);
        stdList.add(st2);
        stdList.add(st3);
        stdList.add(st4);
        stdList.add(st5);

        ArrayList <Students> sorted = (ArrayList<Students>) stdList.stream().sorted((x,y)->Integer.compare(x.getAge(), y.getAge())).collect(
                Collectors.toList());
        System.out.println(sorted);

        List<Integer> ditinctList = list.stream().distinct().collect(Collectors.toList());
        ditinctList.forEach(System.out::println);

        int a = ditinctList.stream().min((x,y)->{return Integer.compare(x,y);}).get();
        System.out.println("min " + a);
    }
}
