public class TruckChecker extends CarChecker{
    public void check(Truck truck) {
        super.check(truck);
        truck.checkTrailer();
    }
}
