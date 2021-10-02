package v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main1 {
    public static void main(String[] args) {
        List<String> history = new ArrayList<>();
        FieldInputText fieldInputText = new FieldInputText() {

            @Override
            public void onInput() {
                this.text=text.toLowerCase(Locale.ROOT);
                history.add(this.text);
                System.out.println(history.get(0));
            }

            @Override
            public String getText() {
                return "["+ this.text +"]";
            }
        };
        fieldInputText.inPut("hello");
        System.out.println(fieldInputText.getClass());
        System.out.println(fieldInputText.getText());

    }
}
