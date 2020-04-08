package AggregationAndComposition.TravelVoucherTask;

import AggregationAndComposition.TravelVoucherTask.Enums.Transport;

public class ShoppingTour extends Tour {
    private int purchasesWeight;//вес покупок

    public ShoppingTour(){
        super();
        purchasesWeight=0;
    }

    public ShoppingTour(String destination, int duration, boolean foodIncluded, int price, int purchasesWeight ){
        super(destination, duration, Transport.Автобус, foodIncluded,price);
        this.purchasesWeight=purchasesWeight;
    }

    public int getPurchasesWeight(){
        return purchasesWeight;
    }
}
