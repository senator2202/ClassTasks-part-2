package AggregationAndComposition.StateAggregation;

import java.util.ArrayList;

public class City {
    private ArrayList<District> districts;
    private String name;

    public City(String name){
        this.name=name;
        districts=new ArrayList<District>();
    }

    private void fillDistricts(String s){
        if(s.compareTo("Минск")==0){
            districts.add(new District("Ленинский"));
            districts.add(new District("Первомайский"));
            districts.add(new District("Партизанский"));
            districts.add(new District("Заводской"));
            districts.add(new District("Центральный"));
        }
    }

    public String getName(){
        return name;
    }
}
