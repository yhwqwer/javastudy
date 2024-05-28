package pkg02_generic;

public class BoxEx {

  public static void main(String[] args) {
    
    // 정수를 저장할 수 있는 box1
    Box<Integer> box1 = new Box<Integer>();
    box1.setData(10);
    System.out.println(box1.getData());
    
    
    // 문자열을 저장할 수 있는 box2
    Box<String> box2 = new Box<>(); // 생성자의 구체화 타입은 생략 가능하다. 뒷부분만. // jdk1.7? 부터 가능한기술
    box2.setData("hello");
    System.out.println(box2.getData());
    
  }

}
