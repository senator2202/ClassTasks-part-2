package AggregationAndComposition.CarAggregation;

public class Wheel {
    private String brand;
    private int diameter;

    public Wheel(String brand, int diameter){
        this.brand=brand;
        this.diameter=diameter;
    }

    public String getBrand(){
        return brand;
    }

    public int getDiameter(){
        return diameter;
    }

    public String getInfo(){
        return "брэнд: "+brand+"; диаметр: "+diameter+" \"";
    }
}
