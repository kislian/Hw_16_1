//наследование родительского класса Vehicle
public class Car extends Vehicle {

    public Car(String modelName) {
        super(modelName, 4);
    }
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


}
