package AggregationAndComposition.StateAggregation;

import java.util.ArrayList;

public class State {
    private ArrayList<Region> regions;
    private ArrayList<City> cities;
    private City capital;
    private String name;
    private long square;

    public State(String name){
        this.name=name;
        regions=new ArrayList<Region>();
        cities=new ArrayList<City>();
        square=0;
        fillRegions(name);
    }

    private void fillRegions(String s){
        if(s.compareTo("Беларусь")==0)
        {
            regions.add(new Region("Минская"));
            regions.add(new Region("Брестская"));
            regions.add(new Region("Витебская"));
            regions.add(new Region("Могилевская"));
            regions.add(new Region("Гродненская"));
            regions.add(new Region("Гомельская"));
            square=207595;
            capital=new City("Минск");
        }
    }

    public String getName(){
        return name;
    }

    public void printCapital(){
        System.out.println("Столица: "+capital.getName());
    }

    public void printRegions(){
        System.out.println("областей: "+regions.size());
    }

    public void printSquare(){
        System.out.println("Площадь: "+square);
    }

    public void printRegionCenters(){
        System.out.println("Областныне центры: ");
        for (Region r:regions
        ) {
            System.out.println(r.getCenter());
        }
    }

}
