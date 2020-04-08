package AggregationAndComposition.CarAggregation;

public class Car {
    private Engine engine;
    private Wheel[] wheels;
    private String brand;
    private int fuelRemains;
    private boolean isMoving;

    public Car(String brand, Engine engine, Wheel wheel, int num){
        this.brand=brand;
        this.engine=engine;
        wheels=new Wheel[num];
        for(int i=0;i<num;i++)
            wheels[i]=new Wheel(wheel.getBrand(),wheel.getDiameter());
        fuelRemains=0;
        isMoving=false;
    }

    public String getEngineInfo(){
        return engine.getInfo();
    }

    public String getWheelInfo(){
        return wheels[0].getInfo();
    }

    public String getBrand(){
        return brand;
    }

    public String move(){
        if(fuelRemains>0) {
            if(isMoving==false) {
                isMoving = true;
                return "Машина движется!";
            }
            else
                return "Машина и так движется!";
        }
        else
            return "Закончилось топливо!";
    }

    public String stop(){
        if(isMoving==true){
            isMoving=false;
            return "Машина остановилась!";
        }
        else
            return "Машина и так стоит!";
    }

    public String refuel(){
        if(fuelRemains<100){
            fuelRemains=100;
            return "Полный бак заправлен!";
        }
        else
            return "Бак и так полный!";
    }

    public String changeWheel(){
        if(isMoving==false)
            return "Колесо заменено!";
        else
            return "Сначала остановитесь!";
    }

    public void printBrand(){
        System.out.println(brand);
    }
}
