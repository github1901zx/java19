package v1;

public class Main {
    public static void main(String[] args) {
//        FieldInputText fieldInputText = new FieldInputText();
//        fieldInputText.inPut(" Привет! как дела? ");
//        System.out.println(fieldInputText.getText());

        OnInPutLowerCase onInPutLowerCase = new OnInPutLowerCase();
        onInPutLowerCase.inPut("Hello! How are you?");
        System.out.println(onInPutLowerCase.getText());
    }
}
