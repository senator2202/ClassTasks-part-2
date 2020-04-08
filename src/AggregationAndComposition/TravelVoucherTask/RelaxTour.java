package AggregationAndComposition.TravelVoucherTask;

import AggregationAndComposition.TravelVoucherTask.Enums.Transport;

public class RelaxTour extends Tour {
    private String appartments;

    public RelaxTour(){
        super();
        appartments=new String();
    }

    public RelaxTour(String destination, int duration,  boolean foodIncluded, int price, String appartments ){
        super(destination, duration, Transport.Самолет, foodIncluded,price);
        this.appartments=appartments;
    }

    public String getAppartments(){
        return appartments;
    }
}
