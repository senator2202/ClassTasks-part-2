
import AggregationAndComposition.BankClientAggregation.BankClient;
import AggregationAndComposition.CarAggregation.Car;
import AggregationAndComposition.CarAggregation.Engine;
import AggregationAndComposition.CarAggregation.Wheel;
import AggregationAndComposition.StateAggregation.State;
import AggregationAndComposition.TextAggregation.Text;
import AggregationAndComposition.TravelVoucherTask.Offers;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class ClassTasks {
    public static void main(String[] args) {
        task55();
    }

    /**Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
     * консоль текст, заголовок текста*/
    static void task11(){
        Text text=new Text("Сказка о золотой рыбке");
        text.setText("Жил старик со своею старухой у самого синего моря.");
        text.addText("\nОни жили в ветхой землянке ровно тридцать лет и три года.");
        text.addText("\nСтарик ловил неводом рыбу старуха пряла свою пряжу.");
        text.printTitle();
        text.printText();
    }


    /**Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
     * менять колесо, вывести на консоль марку автомобиля*/
    static void task22(){
        Car car=new Car("Хонда",new Engine(2.0,"бензин",200),new Wheel("Мишлен", 19),4);
        System.out.println(car.move());
        System.out.println(car.refuel());
        System.out.println(car.move());
        System.out.println(car.changeWheel());
        System.out.println(car.stop());
        System.out.println(car.changeWheel());
        car.printBrand();
    }


    /**Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
     * столицу, количество областей, площадь, областные центры*/
    static void task33(){
        State state=new State("Беларусь");
        state.printCapital();
        state.printRegions();
        state.printSquare();
        state.printRegionCenters();
    }


    /**Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
     * счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
     * всем счетам, имеющим положительный и отрицательный балансы отдельно*/
    static void task44(){
        BankClient bc=new BankClient("Харитонов", 100);
        bc.addAccount(200);
        bc.addAccount(-300);
        bc.addAccount(400);
        bc.addAccount(-500);
        System.out.println(bc.getAllAccounts());
        System.out.println(bc.getSortedAccounts());
        System.out.println("Общий баланс: "+bc.getTotalBalance());
        System.out.println("Общий положительный баланс: "+bc.getPositiveBalance());
        System.out.println("Общий отрицательный баланс: "+bc.getNegativeBalance());
    }


    /**Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
     * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
     * возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок*/
    static void task55(){
        Offers of=new Offers();
        Scanner sc=new Scanner(System.in);
        int i=1;
        while(i!=0){
            System.out.println("1-выбрать тур; 0-выход");
            i=sc.nextInt();
            if(i==1){
                System.out.println("1-Круизные; 2-Экскурсионные; 3-Лечебные; 4-Туры для отдыха; 5-Шоппинг туры");
                i=sc.nextInt();
                System.out.println("Включит ли питание в тур: 1-да, 0-нет");
                boolean f;
                if(sc.nextInt()==1)
                    f=true;
                else
                    f=false;
                System.out.println("Укажите минимальное количество дней: ");
                int d=sc.nextInt();

                switch (i){
                    case 1:
                        System.out.println(of.getCruiseTours(f,d));
                        break;
                    case 2:
                        System.out.println(of.getExcursionTours(f,d));
                        break;
                    case 3:
                        System.out.println(of.getMedicalTours(f,d));
                        break;
                    case 4:
                        System.out.println(of.getRelaxTour(f,d));
                        break;
                    case 5:
                        System.out.println(of.getShoppingTours(f,d));
                        break;
                }
            }
        }
    }
}
