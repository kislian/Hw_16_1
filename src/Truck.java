//наследование класса Car
public class Truck extends Car{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    //добавляется ещё один метод  к методам updateTyre() и checkEngine()
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}

