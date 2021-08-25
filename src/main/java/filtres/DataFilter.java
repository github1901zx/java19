package filtres;

import java.util.Arrays;

public class DataFilter {
//    public static String data1 = "08/04/2021";
//    public static String data2 = "2021-04-08";

    public static String data(String e) {
        if (e.contains("-")) {
            return e;
        }
        String replaceStr = e.replace("/","-");
        String[] massCharData = replaceStr.split("-");
        int b = massCharData.length-1;
        String[] massToDb = new String[massCharData.length];
        for (String str:massCharData) {
            massToDb[b]=str;
            if(b>massCharData.length){
                break;
            }
            b--;
        }

        String dateTo = Arrays.toString(massToDb);
        String dateToDb = dateTo.replace(", ","-");
        String dateToDb1 = dateToDb.replace("[","");
        String dateToDb2 = dateToDb1.replace("]","");

        return dateToDb2;
    }
}
