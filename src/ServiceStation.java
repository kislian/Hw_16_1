public class ServiceStation {
    public void check(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        switch (vehicle) {
            case Bicycle bicycle:
                check(bicycle);
                break;
            case Truck truck:
                check(truck);
                break;
            case Car car:
                check(car);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + vehicle);
        }
    }

    private void check(Bicycle car) {
        checkTyres(car);
        checkEngine();
    }

    private void check(Car car) {
        checkTyres(car);
        checkEngine();
    }

    public void check(Truck truck) {
        checkTyres(truck);
        checkEngine();
        checkTrailer();
    }

    private void checkTyres(Vehicle vehicle) {
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            //общий метод для классов Bicycle,Car,Truck
            updateTyre();
        }
    }

    private void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    private void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
