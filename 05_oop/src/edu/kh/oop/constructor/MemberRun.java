package edu.kh.oop.constructor;

public class MemberRun {
	
	public static void main(String[] args ) {
		
		//회원 객체 생성
		//-> 기본 생성자를 이용해서 생성
		Member member1 = new Member();
		
		//null == '참조하는 객체가 없다'를 나타내는 "값"
		//			 (저장된 주소가 없다)
		
		member1.inform();
		
		
		//member1이 참조하는 Member객체의 필드값 세팅
		member1.setMemberId("member01");
		member1.setMemberPw("pass01");
		member1.setMemberName("김회원");
		member1.setMemberAge(27);
		
		//새로은 Member 객체 생성 후 필드 값 세틍
		Member member2 = new Member(); //기본 생성자 이용
		
		member2.setMemberId("member02");
		member2.setMemberPw("pass02");
		member2.setMemberName("최회원");
		member2.setMemberAge(30);		
		
		System.out.println("[member1]");
		member1.inform();
		System.out.println("[member2]");
		member2.inform();
		
		//-------------------------------------------
		// 매개 변수 생성자를 이용한 Member 객체 생성
		Member member3 = new Member("test3","pwpw", "김테스트", 20);
		System.out.println("[member3]");
		member3.inform();
		
		Member member4 = new Member("test4","pwpw11", "박테스트", 30);
		System.out.println("[member4]");
		member4.inform();
		
		//** 프로그래밍 언어에서 변수명, 함수명, 메서드명 중복 허용X
		
		//변수명 중복
		int a = 10;
		//int a = 20;
		
		
	}//main
	
	// 메서드명 중복
	public void test() {}
	//public void test() {}
	
	

}//MemberRun
