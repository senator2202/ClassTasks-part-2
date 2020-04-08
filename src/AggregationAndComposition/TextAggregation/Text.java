package AggregationAndComposition.TextAggregation;

import java.util.ArrayList;

public class Text {
    private ArrayList<Sentence> sentences;
    private String text;
    private String title;

    public Text(){
        sentences=new ArrayList<Sentence>();
    }

    public Text(String title){
        this.title=title;
        sentences=new ArrayList<Sentence>();
    }

    public void setText(String text){
        this.text=text;
        addSentences(text);
    }

    public String getText(){
        return text;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public String getTitle(){
        return title;
    }

    private void addSentences(String text){
        String []sent=text.split("[.!?]");
        for(int i=0;i<sent.length;i++)
            sentences.add(new Sentence(sent[0]));
    }

    public void addText(String newText){
        text+=newText;
        addSentences(newText);
    }

    public void printText(){
        System.out.print("\n"+text);
    }

    public void printTitle(){
        System.out.println("\n"+title);
    }
}
