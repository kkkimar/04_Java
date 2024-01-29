package edu.kh.variable.ex;

public class VariableEx1 {
	
	public static void main(String[] args){
		
		// 변수 : 메모리에 값을 저장하기 위한 공간
		//       이때, 저장되는 값이 변할 수 있어 변수
		
		// 자료형(data type) -> 아래 정리 무조건 암기 ! 
		// - 변수 또는 값의 크기와 형식

		/* *** 자바 기본 자료형(Java Primitive Types) ***
		 * 
		 * [논리형]
		 * boolean (1byte) - true/false
		 * 
		 * [정수형]
		 * byte (1byte)
		 * short(2byte)
		 * int  (4byte) * 정수 기본형 *
		 * long (8byte) - 숫자 뒤에 L 을 써줌
		 * 
		 * [실수형]
		 * float (4byte) - 숫자 뒤에 f를 써줌
		 * double(8byte) * 실수 기본형 *
		 * 
		 * 
		 * [문자형]
		 * char (2byte) - 문자 하나, 문자 양옆에 '' (홑따옴표)
		 * 
		 */
	
		// 변수 선언: 메모리에 공간 할당
		boolean isTrue; // 메모리에 boolean 저장 공간 1byte 할당하고
										// 그 공간은 isTrue라고 부르겠다
		
		double number1; // 메모리에 double 저장 공간 8byte 할당하고
									 // 그 공간은 number1라고 부르겠다
		
		// 값 대입 : 변수에 값을 집어 넣는 것
		//					(이미 값이 있는 변수에 대입할 경우 -> 덮어쓰기)
		
		isTrue = true;
		System.out.println("isTrue : " + isTrue); //true
		
		isTrue = false;
		System.out.println("isTrue : " + isTrue); //false
		
		// 변수 선언 + 초기화 + 값의 범위 확인
		int number2 = 2100000000; // 21억 오류 안남
		long number3 = 2200000000L; // int 22억 오류 남
		//The literal 2200000000 of type int is out of range 
		// -> int 범위 초과
		
		// [해결방법] : int보다 범위가 큰 자료형으로 변경
		//-> 자료형을 long, 숫자 뒤에 L 리터럴 표기법 추가
		
		// 'L' 같은 리터럴 표기법은 
		// 컴퓨터가 자료형을 구분하기 위한 기호일뿐
		// 출력시 보여지지 않는다
		

		System.out.println("number2 : "+number2);
		System.out.println("number3 : "+number3);
		
		/* 다른 리터럴 표기법 확인*/

		char temp1 = '가';
		float temp2 = 1.23f; //f붙여주기 ! 안붙이면 오류남
		double temp3 = 3.14;
		
		//-----------------------------------------------------------
		/*String(문자열)
		 * - 기본 자료형이 아닌 객체
		 * - String을 저장하는 변수는 객체 대신 주소를 저장하기 때문에
		 * 	 "참조형" 이라고 한다
		 * 
		 * (저장된 주소에 위치한 객체를 참조)
		 * 
		 * - String에 리터럴 표기법 : 쌍따옴표 ("")
		 * 
		 * */
		
		String str1 = "쌍따옴표가 String 리터럴 표기법";
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
