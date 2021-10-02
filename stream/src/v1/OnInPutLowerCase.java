package v1;

import java.util.Locale;

public class OnInPutLowerCase extends FieldInputText{
    @Override
    public void onInput() {
        this.text=text.toLowerCase(Locale.ROOT);
    }
}
