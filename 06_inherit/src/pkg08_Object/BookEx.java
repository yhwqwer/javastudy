package pkg08_Object;

/*
 * 해시코드 : 그룹 비교 (같은 그룹은 같은 해시를 가짐)
 * 동등비교 : 실제 두 대상을 비교
 * 오브젝트 클래스
 * 1. 만능이다. 타이틀로 잡아놓으면 모든것을 저장할 수 있다.
 * 2. 오브젝트에 저장된 기능을 사용하려면 다운캐스팅해야된다.
 */

public class BookEx {

  public static void main(String[] args) {
    
    // Book 클래스 타입의 인스턴스 생성
    Book book1 = new Book("홍길동전", "허균");
    Book book2 = new Book("홍길동전", "허균");
    
    // 참조 타입의 인스턴스 동등 비교
    System.out.println(book1.equals(book2));
    
    // 인스턴스의 문자열 확인
    System.out.println(book1);
    System.out.println(book2);
  }

}
