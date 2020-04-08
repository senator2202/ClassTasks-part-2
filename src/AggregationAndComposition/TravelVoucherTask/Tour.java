package AggregationAndComposition.TravelVoucherTask;

import AggregationAndComposition.TravelVoucherTask.Enums.Transport;

public class Tour {
    protected Transport transport;
    protected boolean isFoodIncluded;
    protected int duration;
    protected String destination;
    protected int price;

    public Tour(){
        transport=Transport.Undefined;
        isFoodIncluded =false;
        duration=0;
        destination=new String();
        price=0;
    }

    public Tour(String destination, int duration, Transport transport,boolean isFoodIncluded, int price){
        this.destination=destination;
        this.duration=duration;
        this.transport=transport;
        this.isFoodIncluded = isFoodIncluded;
        this.price=price;
    }

    public Transport getTransport(){
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public String getDestination(){
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDuration(){
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isFoodIncluded() {
        return isFoodIncluded;
    }

    public void setFoodIncluded(boolean foodIncluded) {
        isFoodIncluded = foodIncluded;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

