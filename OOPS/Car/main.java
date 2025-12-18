
/*Create a class Car with attributes brand, model, and price.
Create two objects and print their details. */
class Car{
  String brand;
  String model;
  int price;
  Car(String brand, String model, int price){
    this.brand=brand;
    this.model=model;
    this.price=price;
  }
  void printDetails(){
    System.out.println("Brand: "+this.brand);
    System.out.println("Model: "+this.model);
    System.out.println("Price: "+this.price);
  }
}
public class main{
    public static void main(String[] args) {
        Car car1=new Car("Toyota","Camry",30000);
        Car car2=new Car("Honda","Accord",28000);
        car1.printDetails();
        System.out.println();
        car2.printDetails();
    }
}