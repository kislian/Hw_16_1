public class TruckChecker extends CarChecker{
    public void check(Truck truck) {
        super.check(truck);
       checkTrailer();
    }
    public void checkTrailer(){
        System.out.println("Проверяем прицеп");
    }

}
