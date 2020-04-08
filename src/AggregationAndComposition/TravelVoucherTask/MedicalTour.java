package AggregationAndComposition.TravelVoucherTask;

import AggregationAndComposition.TravelVoucherTask.Enums.Transport;

public class MedicalTour extends Tour {
    private String therapyObject;//объет лечения

    public MedicalTour(){
        super();
        therapyObject=new String();
    }

    public MedicalTour(String destination, int duration,  boolean foodIncluded,int price, String therapyObject ){
        super(destination, duration, Transport.Самолет, foodIncluded,price);
        this.therapyObject=therapyObject;
    }

    public String getTherapyObject(){
        return therapyObject;
    }
}
