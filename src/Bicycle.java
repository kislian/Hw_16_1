//наследование родительского класса Vehicle
public class Bicycle extends Vehicle{
   //конструктор
   public Bicycle(String modelName) {
      super(modelName, 2);
   }
    //наследуется метод updateTyre()
}