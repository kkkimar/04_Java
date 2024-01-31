package edu.kh.loop.ex;

import java.util.Scanner;

/**
 * 
 */
public class LoopEx {
	
	//필드 ( 객체의 속성 == 변수)
	//java.util.Scanner
	
	//Scanner 객체 생성
	Scanner sc = new Scanner(System.in);
	

	/**
	 * 1 부터 10까지 출력
	 */
	public void method1() {
		for(int i = 1; i <= 10; i++ ) {
			System.out.println(i);
		}
	} //method1
	
	
	
	/**
	 * 첫번째 입력 받은 수 부터
	 * 두번째 입력 받은 수 까지
	 * 1씩 증가하며 출력
	 */
	public void method2() {
		System.out.print("입력 (1 2) : ");
		int input1 = sc.nextInt(); //첫번째 입력
		int input2 = sc.nextInt(); //두번째 입력
		
		for(int i = input1 ; i<= input2 ; i++) {
			System.out.println(i);
		}
	}//method2
	
	
	
	/**
	 * 10부터 1까지 1씩 감소
	 */
	public void method3() {
		for(int i = 10 ; i>=1 ; i--) {
			System.out.println(i);
		}
	}
	
	
	/**
	 * 두수를 입력 받아서 반복 출력하는 구문 작성
	 * 
	 * (첫번째 입력을 A, 두번째 입력을 B)
	 * 
	 * 조건1 : B가 A보다 큰 경우 -> A ~ B까지 1씩 증가하며 출력
	 * 조건2 : A가 B보다 큰 경우 -> A ~ B까지 1씩 감소하며 출력
	 * 조건3 : A와 B가 같다면 -> "같은 수 입력됨"
	 */
	public void method4() {
		System.out.println("입력 (1 2) : ");
		int a = sc.nextInt(); //대문자는 상수(final)일때 씀
		int b = sc.nextInt();
		
		//걸러낼 수 있는 경우 if문으로 따로 처리
		//조건3부터 적어줌
		if(a == b) {//조건3
			System.out.println("같은 수 입력됨");
			return; //현재 메서드 종료 후 호출한 곳으로 돌아감
		}
		
		if(b>a) { //조건1
			for(int i=a ; i<=b ; i++) {
				System.out.println(i);
			}
		}else {// a가 b보다 크거나 같다
			for(int i = a ; i>=b ;i--) {
				System.out.println(i);
			}
		}
	}//method4
	
	
	
	
	
	/**
	 * 두수를 입력 받아 1씩 증가하며 반복 출력
	 * 
	 * (첫번째 입력 A , 두번째 입력 B)
	 * 
	 * - 입력 받은 두 수 중 
	 * 	 작은 값이 초기식, 큰 값잉 조건식에 대입되게 사용되게 작성
	 * 	(같은 경우 초기식 A, 조건식 B)
	 */
	public void method5() {
		
		System.out.println("입력 (1 2) : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int min; //최소
		int max; //최대
		
		if(a<=b) {
			min = a;
			max = b;
		}else {
			min = b;
			max = a;
		}
		
		for(int i=min; i<=max ;i++) System.out.println(i);

		
	}//method5
	
	
	/**
	 * 최대 최소값 구하기 (Math)
	 * -> Java API 이용방법
	 */
	public void method5b() {
		System.out.println("입력 (1 2) : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int min = Math.min(a, b); //두수 중 작은 값 반환
		int max = Math.max(a, b); //두수 중 큰 값 반환
		
		for(int i=min; i<=max ; i++) System.out.println(i);
	}//method5b
	
	
	
	/**
	 * 변수 값 교환(swap)
	 */
	public void method5c() {
		System.out.println("입력 (1 2) : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		for(int i=a; i<=b ; i++) System.err.println(i);

	}//method5c
	
	
	/**
	 * 1 ~ 100사이 7의 배수 개수
	 */
	public void method6() {
		
		int count = 0;
		
		for(int i=1; i<=100;i++) {
			if(i%7 == 0) count++; //i가 7의 배수인 경우 count1 증가
		}
		
		System.out.println(count);
	
	}//method6
	
	public void method6a() {
		
		int count = 0;
		
		for(int i=7; i<=100 ; i+=7) {
			count++; 
		}
		
		System.out.println(count);
	}//method6a
	
	
	/**
	 * 1 ~ 100 사이 정수 중
	 * 3의 배수의 개수
	 * 3의 배수를 제외한 수 들의 합 출력
	 */
	public void method7() {
		
		//3의 배수의 개수
		int count = 0;
		
		//합계
		int sum = 0;
		
		for(int i=1 ; i<=100 ; i++) {
			if(i % 3 == 0) { //3의 배수
				count++;
				System.out.println(count);
			}else { //3의 배수 제외
				sum += i;
				System.out.println(sum);
			}
		}
		
	}
	
	
	/**
	 * 구구단 5단 출력
	 * 5 X 1 = 5
	 * 5 X 2 = 10
	 * 5 X 3 = 15
	 * ...
	 * 5 X 9 = 45
	 */
	public void method8() {
		

		for(int i = 1 ; i <= 9 ; i++ ) {
			System.out.printf("5 X %d = %2d \n",i,5*i);
			//System.out.println(5 * i);
		}
	}//method8
	

	
}
