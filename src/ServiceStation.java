public class ServiceStation {
    private CarChecker carChecker = new CarChecker();
    private BicycleChecker bicycleChecker = new BicycleChecker();
    private TruckChecker truckChecker = new TruckChecker();
    public void check(Vehicle vehicle) {
        System.out.print("Обслуживаем " + vehicle.getModelName());
        System.out.println();
        switch (vehicle) {
            case Bicycle bicycle:
                bicycleChecker.check(bicycle);
                break;
            case Truck truck:
                truckChecker.check(truck);
                break;
            case Car car:
                carChecker.check(car);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + vehicle);
        }
        System.out.println("***** Обслуживание закончилось *****");
        System.out.println("!!!!! Спасибо, что воспользовались услугами нашего Сервис Центра !!!!");
    }
}
