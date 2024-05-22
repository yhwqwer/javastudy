package pkg08_this;

/*
 * this
 * 1. 현재 인스턴스의 정보(참조)를 의미한다.
 * 2. 오직 동일한 클래스 내부에서만 사용 할 수 있는 키워드이다.
 * 3. 현재 인스턴스와 동일하게 사용 할 수 있다.
 *  1) this.필드
 *  2) this.메소드()
 * 4. 생성자 내부에서 this() 호출을 이용하여 다른 생성자를 호출 할 수 있다. -- 나중에 공부해 보기
 * 5. 메소드 체이닝(메소드호출 이후 .을 찍고 다시 메소드를 호출하는 방법)을 위해서 return this; 를 활용 할 수 있다. -- 나중에 공부해 보기
 */



public class Computer {

  // model 필드
  String model;
  
  
  // 생성자
  Computer(String model){
    this.model = model;
  } 
  
  void print() {
    System.out.println(this);
    System.out.println(model);
  }
  
  
}
