package edu.altaspace;

public class Card {

    public Card(String name, String text) {
        setName(name);
        setText(text);
    }

    private String name;
    private String text;

    public void setName(){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Card [\n\tname: " + this.getName() + "\n\ttext:  " + this.getText() + "\n]";
    }
}
