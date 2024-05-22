package pkg02_constructor;

public class Car {

  // field
  private String model; // String 도 참조 타입, 참조타입에서만 null 값이 발생
  
  public Car() {
    
  }
  
  
//    public Car(String model) {
//    this.model = model;
//  }
  
  public void printCar() {
    System.out.println(model);
  }

  public String getModel() {
    return model;
  }

  public Car(String model) {
    super();
    this.model = model;
  }





  public void setModel(String model) {
    this.model = model;
  }
  
  
  
}
