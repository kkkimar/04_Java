package edu.kh.oop.basic;

public class AccountRun {

	public static void main(String[] args) {
		
		//Account 객체 생성
		
		Account a1 = new Account();

		//private를 적용한 변수(필드)는 외부에 보이지 않음
		//The field Account.balance is not visible
		//a1.balance;
		//a1.password;
		
		//간접 접근 기능을 이용해서 값을 세팅
		a1.setName("신형만");
		
		//간접 접근 기능을 이용해서 객체의 속성을 얻어와 출력
		String name1 = a1.getName();
		System.out.println(name1);

		a1.setAccontNumber("1234-56-789");
		a1.setPassword("7890");
		
		
		Account a2 = new Account();
		a2.setName("신짱아");
		a2.setAccontNumber("111-222-3333");
		a2.setPassword("7777");
		
		
		//각 계좌에 입금
		a1.deposit(10000000L);
		a1.deposit(2345L);
		a2.deposit(50000L);
		a2.deposit(30000L);
		
		
		System.out.println("==============================================");
		a1.withdraw("1234", 20000);
		a1.withdraw("7890", 20000);
		a1.withdraw("7890", 5000);
		System.out.println("==============================================");
		a2.withdraw("1234", 20000);
		a2.withdraw("7777", 20000);
		a2.withdraw("7777", 5000);
		
		
	}
}
