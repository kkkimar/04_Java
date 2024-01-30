package edu.kh.condition.ex;

import java.util.Scanner;

/**
 * 조건문 기능용 클래스
 */
public class ConditionEx {
	
	// 필드 (객체의 속성 == 객체가 가지고 있는 값/변수)
	
	Scanner sc = new Scanner(System.in);
	
	/*
	 * 나이를 입력 받아
	 * 19세 이상은 성인, 미만은 "성인이 아닙니다"
	 * */
	
	public void method1() {
		//메서드의 지역변수 (필드X)
		System.out.print("나이입력 : ");
		int age = sc.nextInt();
		
		if(age >= 19) {
			System.out.println("성인");
		}else {
			System.out.println("성인이 아닙니다");
		}
	}
	
	
	
	/*
	 * 나이를 입력 받아
	 * 13세 이하면 어린이
	 * 13세 초과 18세 이하 청소년
	 * 18세 초과 성인
	 * */
	
	public void method2() {

		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String result ;
		
		if(age<=13)        result = "어린이";
		else if(age <= 18) result = "청소년";
		else               result = "성인";
		
		System.out.println(result);	
	}
	
	

	/**
	 * 달(월)을 입력 받아 해당 계절 출력하기
	 * 
	 * <ul>
	 * 	<li>봄 : 3,4,5</li>
	 * 	<li>여름 : 6,7,8</li>
	 * 	<li>가을 : 9,10,11</li>
	 * 	<li>겨울 : 12,1,2</li>
	 * 	<li>그외 : 잘못 입력</li>
	 * </ul>
	 */
	public void method3() {
		System.out.print("달 입력 : ");
		int month = sc.nextInt();
		
		String result;
		
		if(month >=3 && month <= 5) result = "봄";
		else if(month>=6 && month <= 8) result ="여름";
		else if(month>=9 && month <= 11) result ="가을";
		else if ( month >=1  && month <=12 ) result ="겨울";
		else result = "잘못입력";
		
		System.out.println(result);

	}
	
	// 생각하는 순서 바꾸기
	
	public void method3a() {
		System.out.print("달(월) 입력 : ");
		int month = sc.nextInt();
		
		String result;
		if(month < 1 || month > 12)  result = "잘못 입력";
		else if(month >= 3 && month <= 5) 	result = "봄";
		else if(month >= 6 && month <= 8) 	result = "여름";
		else if(month >= 9 && month <= 11) 	result = "가을";
		else result = "겨울";
		
		System.out.println(result);
	}
	
	//잘못된 경우에 메서드를 중간에 종료
	public void method3b() {
		System.out.print("달(월) 입력 : ");
		int month = sc.nextInt();
		
		if(month < 1 || month > 12) {
			System.out.println("잘못 입력");
			return; // 메서드를 종료하고 호출한 곳으로 돌아감
		}
		
		String result;
		if(month >= 3 && month <= 5) 	result = "봄";
		else if(month >= 6 && month <= 8) 	result = "여름";
		else if(month >= 9 && month <= 11) 	result = "가을";
		else result = "겨울";
		
		System.out.println(result);
	}
	
	
	
	
	public void method3c() {
		System.out.print("달(월) 입력 : ");
		int month = sc.nextInt();
		
		String result;
		
		//switch문 매개면수로는 정수, 문자열, 문자만 가능
		
		switch(month) {
//		case 3: case 4: case 5: result="봄"; break;
			case 3, 4, 5:   result="봄"; break;  // month가 3,4,5 인 경우
			case 6, 7, 8:   result="여름"; break;  
			case 9, 10, 11: result="가을"; break;  
			case 12, 1, 2:  result="겨울"; break;  
			default : result = "잘못 입력";
		}
		
		System.out.println(result);
	}
	
	
	
	/** P/F 판별하기
	 * <pre>
	 * 	중간고사, 기말고사, 과제 점수를 입력 받아
	 *  총점 60점 이상일 경우 PASS, 아니면 FAIL
	 *  
	 *  - 중간고사(40%), 기말고사(50%), 과제(10%)
	 *  - 각각 100점 만점
	 *  
	 *  + pass인 경우 
	 *  90점 이상 A
	 *  80점 이상 B
	 *  70점 이상 C
	 *  60점 이상 D 
	 * </pre>
	 */
	
	public void method4() {
		System.out.print("중간 점수 입력 : ");
		int input1 = sc.nextInt();
		
		System.out.print("기말 점수 입력 : ");
		int input2 = sc.nextInt();
		
		System.out.print("과제 점수 입력 : ");
		int input3 = sc.nextInt();

		
		double result1 = input1 * 0.4;
		double result2 = input2 * 0.5;
		double result3 = input3 * 0.1;
		double result = result1+result2+result3;
		
		
		// 변수가 아무런 값도 대입되지 않은 경우 사용 불가능(에러)
		// 해결1) 모든 경우에 변수에 값을 대입 
		// 해결2) 변수 선언 시 특정합 값으로 초기화 진행
		// -> 숫자는 0, String은 null 이나 "" 빈문자열, boolean false로 많이 함
		// -> 이외의 객체는 null
		
		String str = null; //또는 빈문자열 ""
		
		if(result>=60) {
			
			if(result >=90) str ="A";
			else if(result >=80) str ="B";
			else if(result >=70) str ="C";
			else if(result >=60) str ="D";
			
		}else {
			str ="FAIL";
		}
		
		System.out.println(str);
		

		
	}//method4
		
	/**
	 * 
	 * <pre>
	 * 국어, 영어, 수학, 사탐, 과탐 점수를 입력 받아
	 * 40점 미만 과목이 있으면 FAIL
	 * 평균이 60점 미만인 경우도 FAIL
	 * 모든 과목 40점 이상, 평균 60점 이상인 경우 PASS
	 * 
	 * 
	 * 
	 * [출력 예시]
	 * 
	 * 1) 40점 미만 과목이 존재하는 경우
	 * 
	 * FAIL [ 40점 미만 과목 : 국어, 영어 ]
	 * 
	 * 2) 평균 60점 미만인 경우
	 * 
	 * FAIL [점수 : 50.4(평균미달)]
	 * 
	 * PASS인 경우
	 * 
	 * PASS[점수 : 80.4 / 100]
	 * 
	 * 
	 * </pre>*/
	public void method5() {
		
		//5개 입력 받기
		System.out.print("국어 점수 : ");
		int lanScore = sc.nextInt();
		System.out.print("영어 점수 : ");
		int engScore = sc.nextInt();
		System.out.print("수학 점수 : ");
		int mathScore = sc.nextInt();
		System.out.print("사탐 점수 : ");
		int socScore = sc.nextInt();
		System.out.print("과탐 점수 : ");
		int scienceScore = sc.nextInt();
		
		//평균
		double result = ( (double)lanScore+engScore+mathScore+socScore+scienceScore ) / 5 ;
		
		//40점 미만 과목은 fail,평균이 60점 미만인 경우도 FAIL
		
		String str ="";
		String sub = "";
		
		
			if(lanScore<40) {
				str = "FAIL";
				sub += " 국어";
			}
			if(engScore<40) {
				str = "FAIL";
				sub += " 영어";
			}
			if(mathScore<40) {
				str = "FAIL";
				sub += " 수학";
			}
			if(socScore<40) {
				str = "FAIL";
				sub += " 사탐 ";
			}	if(scienceScore<40) {
				str = "FAIL";
				sub += " 과탐";
			}
			
			System.out.println(str+" 40점 미만 과목 :" + sub);
			
			if(result< 60) {
				str ="FAIL";
				System.out.println(str+" 점수 : " + result+" 평균미달");
			}else {
				str ="PASS";
				System.out.println(str+" 점수 : " + result + " / 100");
			}
			
		

	}//method5

}
