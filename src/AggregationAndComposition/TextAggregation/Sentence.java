package AggregationAndComposition.TextAggregation;

public class Sentence {
    private Word [] words;
    private String text;

    public Sentence(String text){
        this.text=text;
        String []w=text.split("[,;:.!?\\s]+");
        words=new Word[w.length];
        for(int i=0;i<w.length;i++)
            words[i]=new Word(w[i]);
    }

    public String getText(){
        return text;
    }
}
