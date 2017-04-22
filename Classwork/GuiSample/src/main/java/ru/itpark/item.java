package ru.itpark;

/**
 * Created by Student20 on 19.04.2017.
 */
public class item {
    private String text;
    private boolean done;

    public item(String text) {
        this.text = text;
    }

    public void setDone (boolean done) {
        this.done = done;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public boolean isDone() {
        return done;
    }
}
