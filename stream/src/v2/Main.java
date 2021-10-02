package v2;

public class Main {
    public static void main(String[] args) {
        IDataProcessor dataProcessor = new IDataProcessor() {
            @Override
            public int StringToInt(String text) {
                return text.length();
            }

            @Override
            public String IntToString(int val) {
                return "Число - " + val;
            }
        };
        System.out.println(dataProcessor.IntToString(5));
        System.out.println(dataProcessor.StringToInt("Hello world"));
    }
}
