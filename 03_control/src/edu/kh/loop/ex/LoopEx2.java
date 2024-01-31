package edu.kh.loop.ex;

import java.util.Scanner;

public class LoopEx2 {
	
	Scanner sc = new Scanner(System.in);

	
	/**
	 * 1234
	 * 1234
	 * 1234
	 */
	public void method1() {
		
		for(int x=3; x>=1; x--) {//3번 반복
			
			for(int i=1 ; i<=4 ; i++) {//1234출력				
				System.out.print(i);
			}
			System.out.println(); //띄어쓰기
		}
	}//method1
	
	
	/**<pre>
	 * 
	 * 다음 모양 출력하기 
	 * 
	 * 4321
	 * 4321
	 * 
	 * </pre>
	 * 
	 */
	public void method2() {
		
		for(int num=1; num<=2; num++) {
			for(int i=4 ; i>=1; i--) {
				System.out.print(i);
			}
			System.out.println();
		}	
	}//method2
	
	
	/**<pre>
	 * 
	 * 다음 모양 출력하기 
	 * 
	 * (0,0) (0,1) (0,2)
	 * (1,0) (1,1) (1,2)
	 * (2,0) (2,1) (2,2)
	 * </pre>
	 * 
	 */
	
	public void method3() {
		
		for(int x = 0 ; x <3 ; x++) {//세로 0,1,2
		//0,1,2 출력
			for(int i = 0 ; i < 3 ; i++) {//가로 0,1,2
				System.out.printf("(%d,%d)",x,i);
			}
			System.out.println();
		}

	}//method3
	
	/**<pre>
	 * 
	 * 다음 모양 출력하기 
	 * 
	 * (2,2) (2,1) (2,0)
	 * (1,2) (1,1) (1,0)
	 * (0,2) (0,1) (0,0)
	 * </pre>
	 * 
	 */
	public void method4() {
		
		for(int x = 2 ; x >=0  ; x--) {//세로 0,1,2
		//0,1,2 출력
			for(int i = 2 ; i >=0  ; i--) {//가로 0,1,2
				System.out.printf("(%d,%d)",x,i);
			}
			System.out.println();
		}
		
	}//method4
	
	
	/**
	 * 2단 ~ 9단 모두 출력
	 * 
	 * 2X1= 2 2X2= 4 .... 2X9=18
	 * 3X1= 3 3X2= 6 .... 3X9=27
	 * ...
	 * 9X1= 9 9X2= 18 .... 9X9=81
	 * 
	 */
	public void method5() {
		
		
		for(int x=2; x<=9 ; x++) {

			for(int i=1 ; i<10 ; i++) {
				System.out.printf("%dX%d= %2d ",x,i,x*i);
			}
			System.out.println();
		}

	}//method5
	
	
	
	/**
	 * <pre>
	 * 입력 받는 단 부터 9단까지 구구단 출력하기
	 * 단, 입력 값이 2~9 사이가 아니면 "잘못입력" 출력
	 * </pre>
	 * 
	 * ex)
	 * 단 입력(2~9) : 7
	 * 
	 * ===== 7단 =====
	 * 7 X 1 =  7
	 * 7 X 2 = 14
	 * ...
	 * 7 X 9 = 63
	 * 
	 * ===== 8단 =====
	 * 8 X 1 =  8
	 * 8 X 2 = 16
	 * ...
	 * 
	 * 
	 */
	public void method6() {
		
		System.out.print("입력: ");
		int input = sc.nextInt();
		
		if(input < 2 || input >9) {
			System.out.println("잘못입력");
			return;
		}
		
		for(int num = input ; num <=9 ; num++) {
			System.out.printf("===== %d ===== \n",num);
			for(int i = 1; i<=9 ; i++) {
				System.out.printf("%d X %d = %2d \n" ,num,i,num*i);
			}
			System.out.println();
		}		
	}//method6
	
	
	
	
	/**
	 * <pre>
	 * 1 2 3
	 * 4 5 6
	 * 7 8 9
	 * 
	 * </pre>
	 */
	public void method7() {
		
		int count =1;
		
		for(int i= 0 ; i<3 ; i++) {
			for(int num=1; num<=3; num++) {
				System.out.print(count++ + "");
			}
			System.out.println();
		}
	}//method7
	
	/**
	 * <pre>
	 * 
	 * ####
	 * ####
	 * ####
	 * ####
	 * 
	 * </pre>
	 */
	public void method8() {
		
		for(int i=0; i<4 ; i++) {
			for(int num =1 ; num<=4 ; num++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}//method8
	
	/**
	 * <pre>
	 * 
	 * *
	 * **
	 * ***
	 * ****
	 * 
	 * </pre>
	 */
	public void method9() {
		
		for(int row = 1; row<=4 ;row++) {
			for(int col =1 ; col<=row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}//method9
	
	
	
	
	/**
	 * ****
	 * ***
	 * **
	 * *
	 */
	public void method10() {
		
		
		
		for(int row = 1; row<=4 ;row++) {
			for(int col =4 ; col>=row; col--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}//method10
	
	
	
	
	
	
	
}
