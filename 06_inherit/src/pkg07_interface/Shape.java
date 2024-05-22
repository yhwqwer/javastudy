package pkg07_interface;

/*
 * abstract class to interface
 * 1. class  : abstract class → interface
 * 2. method : public abstract 생략 가능
 * 추상 메소드 "만" 가지고 있는 추상 클래스는 interface 라고 부를 수 있다.
 */

/*
 * interface
 * 1. 대부분 추상 메소드로 구성되어 있다.
 * 2. 구성 요소
 *  1) 상수 : public static final
 *  2) 추상 메소드
 *  3) 클래스 메소드 (static)  : interface 로 호출하는 메소드, jdk 1.8 이후
 *  4) 디폴트 메소드 (default) : 본문이 있는 메소드, jdk 1.8 이후
 */



public interface Shape {
  double getArea();
  double getCircum();
}
