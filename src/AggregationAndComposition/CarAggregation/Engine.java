package AggregationAndComposition.CarAggregation;

public class Engine {
    private double capacity;
    private String fuelType;
    private int power;

    public Engine(double capacity,String fuelType,int power){
        this.capacity=capacity;
        this.fuelType=fuelType;
        this.power=power;
    }

    public double getCapacity(){
        return capacity;
    }

    public String getFuelType(){
        return fuelType;
    }

    public int getPower(){
        return power;
    }

    public String getInfo(){
        return "объем: "+capacity+"; топливо: "+fuelType+"; мощность: "+power+" л.с.";
    }
}
