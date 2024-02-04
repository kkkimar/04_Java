package edu.kh.oop.field.pack1;

public class FieldTest1 {
	// 필드(Field)
	// - 객체의 속성을 나타냄 
	// => 특별한 경우를 제외하고 캡슐화 원칙 적용
	// 웬만하면 다 private을 사용
	
	
	// - 필드 == 멤버 변수
	
	// * 작성법 *
	
	// [접근제한자] [예약어] 자료형 변수명 [=초기값];
	
	// 접근 제한자별 필드 선언
	public    int publicValue = 10;
	protected int protectedValue = 20;
						int defaultValue = 30 ;
  private   int privateValue = 40;						
	
  // 모든 접근 제한자가 같은 클래스 내부에 접근 가능하기 때문에 
  // 오류 없음 
  public void method1() {
  	System.out.println(protectedValue);
  	System.out.println(defaultValue);
  }
  
}
