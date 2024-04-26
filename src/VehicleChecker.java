//родительский класс  для проверок
public abstract class VehicleChecker {
    public void check(Vehicle vehicle) {
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            //общий метод для классов Bicycle,Car,Truck
            System.out.print((i+1)+"-ое"+ " колесо. ");
            vehicle.updateTyre();
        }
    }
}
