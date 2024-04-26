//наследование родительского класса Vehicle
public class Bicycle extends Vehicle{
   //конструктор
   public Bicycle(String modelName, int wheelsCount) {
      super(modelName, wheelsCount);
   }
    //наследуется метод updateTyre()
}