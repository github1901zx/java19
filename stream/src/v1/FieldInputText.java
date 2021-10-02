package v1;

import java.util.Objects;

public abstract class FieldInputText {
    protected String text;

    public void inPut(String input){
        this.text=input;
        onInput();
    }

    public abstract void onInput();

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FieldInputText that = (FieldInputText) o;
        return Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

}
