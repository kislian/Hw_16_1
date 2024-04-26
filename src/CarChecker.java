public class CarChecker extends VehicleChecker{
    public void check(Car car) {
        super.check(car);
        car.checkEngine();
    }
}