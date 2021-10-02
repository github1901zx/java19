package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Stream.of("Привет!","Как дела?")
                .distinct()
                .map(String::toLowerCase)//s -> s.toLowerCase(Locale.ROOT)
                .collect(Collectors.toList());
        System.out.println(strings);


//        Stream<String> stream = Stream.of("Привет!" , "Как дела?");
//        Stream<String> stream1 = stream.map(String::toLowerCase);//s -> s.toLowerCase(Locale.ROOT);
//        List<String> stream2 = stream1.collect(Collectors.toList());
//        System.out.println(stream2);
    }
}
