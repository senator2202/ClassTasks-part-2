package AggregationAndComposition.TravelVoucherTask;

import AggregationAndComposition.TravelVoucherTask.Enums.Transport;

public class ExcursionTour extends Tour {
    private String sights;//достопримечательности

    public ExcursionTour(){
        super();
        sights=new String();
    }

    public ExcursionTour(String destination, int duration, boolean foodIncluded,int price, String sights){
        super(destination,duration, Transport.Автобус,foodIncluded, price);
        this.sights=sights;
    }

    public String getSights(){
        return sights;
    }
}
