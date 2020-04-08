package AggregationAndComposition.TravelVoucherTask;

import java.util.ArrayList;
import java.util.Random;

public class Offers {
    private ArrayList<CruiseTour> cruiseTours;
    private ArrayList<ExcursionTour> excursionTours;
    private ArrayList<MedicalTour> medicalTours;
    private ArrayList<RelaxTour> relaxTours;
    private ArrayList<ShoppingTour> shoppingTours;
    private String[] destinations = {"Франция", "Италия", "Монголия", "ОАЭ", "Египет"};

    {
        initCruiseTours();
        initExcursionTours();
        initMedicalTours();
        initRelaxTours();
        initShoppingTours();
    }




    private void initCruiseTours() {
        cruiseTours = new ArrayList<CruiseTour>();
        String[] shipNames = {"Роза", "Царь морей", "Адмирал Кузнецов", "Потемкин", "Титаник"};
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            String dest = destinations[r.nextInt(5)];
            int dur = r.nextInt(20) + 5;
            boolean food = r.nextBoolean();
            int price = r.nextInt(500) + 500;
            String ship = shipNames[r.nextInt(5)];
            CruiseTour ct = new CruiseTour(dest, dur, food, price, ship);
            cruiseTours.add(ct);
        }
    }

    private void initExcursionTours() {
        excursionTours = new ArrayList<ExcursionTour>();
        String[] sights = {"Соборы", "Фонтаны", "Парки", "Площади", "Театры"};
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            String dest = destinations[r.nextInt(5)];
            int dur = r.nextInt(20) + 5;
            boolean food = r.nextBoolean();
            int price = r.nextInt(500) + 500;
            String s = sights[r.nextInt(5)];
            ExcursionTour ex = new ExcursionTour(dest, dur, food, price, s);
            excursionTours.add(ex);
        }
    }

    private void initMedicalTours(){
        medicalTours=new ArrayList<MedicalTour>();
        String[] therapyObjects = {"ЦНС", "Сердце", "Позвоночник", "Кожа", "Заикание"};
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            String dest = destinations[r.nextInt(5)];
            int dur = r.nextInt(20) + 5;
            boolean food = r.nextBoolean();
            int price = r.nextInt(500) + 500;
            String t = therapyObjects[r.nextInt(5)];
            MedicalTour m=new MedicalTour(dest,dur,food,price,t);
            medicalTours.add(m);
        }
    }

    private void initRelaxTours(){
        relaxTours=new ArrayList<RelaxTour>();
        String[] appartments = {"Бунгало", "Отель", "Хижина", "Квартира", "Открытое небо"};
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            String dest = destinations[r.nextInt(5)];
            int dur = r.nextInt(20) + 5;
            boolean food = r.nextBoolean();
            int price = r.nextInt(500) + 500;
            String a = appartments[r.nextInt(5)];
            RelaxTour rel=new RelaxTour(dest,dur,food,price,a);
            relaxTours.add(rel);
        }
    }

    private void initShoppingTours(){
        shoppingTours=new ArrayList<ShoppingTour>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            String dest = destinations[r.nextInt(5)];
            int dur = r.nextInt(20) + 5;
            boolean food = r.nextBoolean();
            int price = r.nextInt(500) + 500;
            int weight=r.nextInt(20)+50;
            ShoppingTour sh=new ShoppingTour(dest,dur,food,price,weight);
            shoppingTours.add(sh);
        }
    }

    public String getCruiseTours(boolean food, int days){
        String res=new String();
        res="Круизные туры:\n";
        for (CruiseTour c:cruiseTours
             ) {
                if(c.isFoodIncluded==food && c.duration>=days) {
                res += "направление: " + c.destination + "; продолжительность: " + c.duration + "; траспорт: " + c.transport;
                res += "; питание: " + c.isFoodIncluded + "; цена: " + c.price + "; корабль: " + c.getShipName() + "\n";
            }
        }
        return res;
    }

    public String getExcursionTours(boolean food, int days){
        String res=new String();
        res="Экскурсионные туры:\n";
        for (ExcursionTour c:excursionTours
        ) {
            if(c.isFoodIncluded==food && c.duration>=days) {
                res += "направление: " + c.destination + "; продолжительность: " + c.duration + "; траспорт: " + c.transport;
                res += "; питание: " + c.isFoodIncluded + "; цена: " + c.price + "; достопримечательности: " + c.getSights() + "\n";
            }
        }
        return res;
    }

    public String getMedicalTours(boolean food, int days){
        String res=new String();
        res="Лечебные туры:\n";
        for (MedicalTour c:medicalTours
        ) {
            if(c.isFoodIncluded==food && c.duration>=days) {
                res += "направление: " + c.destination + "; продолжительность: " + c.duration + "; траспорт: " + c.transport;
                res += "; питание: " + c.isFoodIncluded + "; цена: " + c.price + "; направление лечения: " + c.getTherapyObject() + "\n";
            }
        }
        return res;
    }

    public String getRelaxTour(boolean food, int days){
        String res=new String();
        res="Туры для отдыха:\n";
        for (RelaxTour c:relaxTours
        ) {
            if(c.isFoodIncluded==food && c.duration>=days) {
                res += "направление: " + c.destination + "; продолжительность: " + c.duration + "; траспорт: " + c.transport;
                res += "; питание: " + c.isFoodIncluded + "; цена: " + c.price + "; жилье: " + c.getAppartments() + "\n";
            }
        }
        return res;
    }

    public String getShoppingTours(boolean food, int days){
        String res=new String();
        res="Шоппинг туры:\n";
        for (ShoppingTour c:shoppingTours
        ) {
            if(c.isFoodIncluded==food && c.duration>=days) {
                res += "направление: " + c.destination + "; продолжительность: " + c.duration + "; траспорт: " + c.transport;
                res += "; питание: " + c.isFoodIncluded + "; цена: " + c.price + "; вес товара: " + c.getPurchasesWeight() + "\n";
            }
        }
        return res;
    }
}
