package AggregationAndComposition.StateAggregation;

import java.util.ArrayList;

public class Region {
    private ArrayList<City> cities;
    private String name;
    private City center;

    public Region(String name){
        this.name=name;
        cities=new ArrayList<City>();
        fillRegions(name);
    }

    public String getName(){
        return name;
    }

    public String getCenter(){
        return center.getName();
    }


    private void fillRegions(String s){
        if(s.compareTo("Минская")==0){
            cities.add(new City("Минск"));
            cities.add(new City("Жодино"));
            center=new City("Минск");
        }
        if(s.compareTo("Витебская")==0){
            cities.add(new City("Витебск"));
            cities.add(new City("Орша"));
            center=new City("Витебск");
        }
        if(s.compareTo("Брестская")==0){
            cities.add(new City("Брест"));
            cities.add(new City("Барановичи"));
            center=new City("Брест");
        }
        if(s.compareTo("Гомельская")==0){
            cities.add(new City("Гомель"));
            cities.add(new City("Мозырь"));
            center=new City("Гомель");
        }
        if(s.compareTo("Гродненская")==0){
            cities.add(new City("Гродно"));
            cities.add(new City("Лида"));
            center=new City("Гродно");
        }
        if(s.compareTo("Могилевская")==0){
            cities.add(new City("Могилев"));
            cities.add(new City("Бобруйск"));
            center=new City("Могилев");
        }
    }
}
