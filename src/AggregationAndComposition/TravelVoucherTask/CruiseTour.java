package AggregationAndComposition.TravelVoucherTask;

import AggregationAndComposition.TravelVoucherTask.Enums.Transport;

public class CruiseTour extends Tour {
    private String shipName;

    public CruiseTour(){
        super();
        shipName="";
    }

    public CruiseTour(String destination, int duration, boolean foodIncluded, int price, String shipName){
        super(destination, duration, Transport.Корабль, foodIncluded,price);
        this.shipName=shipName;
    }

    public String getShipName(){
        return shipName;
    }

}
