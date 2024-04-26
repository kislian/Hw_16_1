public class CarChecker extends VehicleChecker{
    public void check(Car car) {
        super.check(car);
        checkEngine();
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}