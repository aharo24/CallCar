public class CallCar {
   public static void main(String[] args) {
      Car myCar = new Car();
      ElectricCar electricCar = new ElectricCar();

      myCar.setBrand("Honda");
      myCar.setModel("Civic");
      electricCar.setBrand("Tesla");
      electricCar.setModel("Model X");
      electricCar.setRange("315 miles");

      System.out.println(myCar);
      System.out.println(electricCar);
   }
}