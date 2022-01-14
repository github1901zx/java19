package homeworks.lesson21;

import java.util.ArrayList;
import java.util.Collections;

public class NewClass {
    public static void delDyblArray(ArrayList a){
        for(int i = 0; i < a.size();i++){
            for(int j = i+1; j < a.size();j++){
                if(a.get(i).equals(a.get(j))){
                    a.remove(j);
                }
            }
        }
    }
    public void abc(String ... s){// String [] s
    ArrayList<String>  ar1 = new ArrayList<>();
    for(String a:s){
        ar1.add(a);
    }
        NewClass.delDyblArray(ar1);
        Collections.sort(ar1);
        System.out.println(ar1.toString());
    }
}
