import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<String> stringClass = String.class;
        Method[] methods = stringClass.getMethods();
        for (Method m:methods){
            System.out.println(m.getName());
        }
        //ВЫЗВАТЬ МЕТОД С ПОМОЩЬЮ РЕФЛЕКСИИ....
    }



}
