package generics;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<String> ar1 = new ArrayList<>();
        // ArrayList ar1 = new ArrayList<>();
        ar1.add("adfa");
        // String a = (String)"adfa";
        ar1.add("adfasdfasd");
        ar1.add("adfaghjg");
        ar1.add("adfakljt564");
        System.out.println(GetMethod.getFistElement(ar1));
        ArrayList<Integer> ar2 = new ArrayList<>();
        ar2.add(1);
        ar2.add(2);
        ar2.add(3);
        ar2.add(4);
        ar2.add(5);
        System.out.println(GetMethod.getFistElement(ar2));
    }
}

class GetMethod{
    public static <T> T getFistElement(ArrayList<T> arrayList){
        return arrayList.get(1);
    }
}
