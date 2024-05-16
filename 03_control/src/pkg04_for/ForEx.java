package pkg04_for;

public class ForEx {

  public static void main(String[] args) {
    
    /*
     * for
     * 1. 형식
     *  for(초기상태 ; 조건식 ; 상태변화){
     *    실행문
     *  }
     * 2. 실행 순서
     *  초기상태 -> 조건식 -> 실행문 -> 상태변화 -> 조건식 -> 실행문 -> 상태변화 -> ...(조건을 만족할때까지)
     */

    // 1 ~ 5 출력하기

    for(int a = 1; a < 6; a++) {
      System.out.println(a);
    }
    
    // 5 ~ 1 출력하기
    
    for(int b = 5; b > 0; b--) {
      System.out.println(b);
    }
    
  }

}
