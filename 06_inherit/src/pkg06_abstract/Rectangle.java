package pkg06_abstract;

public class Rectangle extends Shape {

  private double width;
  private double height;
  
  
  public Rectangle() {
    // TODO Auto-generated constructor stub
  }


  public Rectangle(double width, double height) {
    super();
    this.width = width;
    this.height = height;
  }


  public double getWidth() {
    return width;
  }


  public void setWidth(double width) {
    this.width = width;
  }


  public double getHeight() {
    return height;
  }


  public void setHeight(double height) {
    this.height = height;
  }


  @Override
  public double getArea() {
    return width * height;
  }


  @Override
  public double getCircum() {
    return 2 * (width + height);
  }
  
  
}
