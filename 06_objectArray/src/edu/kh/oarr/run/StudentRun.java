package edu.kh.oarr.run;

import edu.kh.oarr.view.StudentView;

//자바 프로그램 실행용 클래스
public class StudentRun {
	public static void main(String[] args) {
		
		//실행시 View객체의 displayMenu 메서드를 호출
		new StudentView().displayMenu();
		
	}
}
