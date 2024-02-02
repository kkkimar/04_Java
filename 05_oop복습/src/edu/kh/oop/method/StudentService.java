package edu.kh.oop.method;

import java.util.Scanner;

public class StudentService {

	private Scanner sc = new Scanner(System.in);
	
	public void displayMenu() {
		
		int input = 0;
		
		Student std1 = null;
		Student std2 = null;
		
		do {
			
			System.out.println("""

===== 학생 관리 프로그램 =====
1. 학생 등록
2. 학생 정보 확인
3. 학생 이름 수정
4. Java 공부하기
5. Html 공부하기
6. Java 역량 비교하기					
7. HTML 역량 비교하기
0. 프로그램 종료
					
					""");
			
			System.out.print("메뉴선택>>");
			input = sc.nextInt();
			
			switch(input) {
			case 1 :
			break;
			case 2 :
				break;
			case 3 :
				break;
			case 4 :
				break;
			case 5 :
				break;
			case 6 :
				break;
			case 7 :
				break;
			case 8 :
				break;
			default :
			
			}
			
			
			
			
			
		}while(input != 0);
		
		
				
	}
	
}