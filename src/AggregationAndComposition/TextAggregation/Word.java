package AggregationAndComposition.TextAggregation;

public class Word {
    private String word;

    public Word(){
        word="";
    }

    public Word(String s){
        word=new String(s);
    }

    public void setWord(String word){
        this.word=word;
    }

    public String getWord(String word){
        return word;
    }

}
