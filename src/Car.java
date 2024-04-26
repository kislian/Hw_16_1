//наследование родительского класса Vehicle
public class Car extends Vehicle {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    //к методу updateTyre() добавляется
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
