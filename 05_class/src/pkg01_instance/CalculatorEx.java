package pkg01_instance;

public class CalculatorEx {

  public static void main(String[] args) {

    // 클래스 Calculator 타입을 가진 인스턴스 생성하기
    
    // 인스턴스 선언
    Calculator calculator1;
    
    // 인스턴스 생성
    calculator1 = new Calculator();
    
    // 인스턴스가 가진 멤버(필드, 메소드) 사용해보기
    
    // 인스턴스.필드
    calculator1.number = 100;
    System.out.println(calculator1.number);
    
 // 인스턴스.메소드()
    calculator1.method(); // 메소드 호출, 메소드를 실행하기 위해서 해당 메소드를 부른다.
    
    Calculator calculator2 = new Calculator();
    calculator2.number = 300;
    System.out.println(calculator2.number);
    calculator2.method();
    
    
    
    
  }

}
