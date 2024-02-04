package edu.kh.oop.field.pack1;

public class FieldRun1 {
	
	public static void main(String[] args) {
		
		//FieldTest1 객체 생성
		FieldTest1 f1 = new FieldTest1();
		// Heap 메모리 영역에 FieldTest1 객체를 만든 후에
		// 만들어진 객체의 주소를 왼쪽 FieldTest1 참조형 변수에 대입
		// f1이 FieldTest1 객체를 참소할 수 있다
		
		System.out.println(f1.publicValue);
		System.out.println(f1.protectedValue);
		System.out.println(f1.defaultValue);
		
		// private는 접근불가
		// 왜? 다른 클래스에서 접근 불가
		// System.out.println(f1.privateVlaue); //오류발생
		
		
	}
	
}
