package edu.kh.poly.pack3.run;

import edu.kh.poly.pack3.model.dto.Calculator;
import edu.kh.poly.pack3.model.dto.KRRCalcultor;
import edu.kh.poly.pack3.model.dto.KRRCalculator2;
import edu.kh.poly.pack3.model.dto.Machine;

public class CalculatorRun {
	public static void main(String[] args) {
		
		
		// 인터페이스 장점 : 
		// 상속 받은 클래스들의 형태가 똑같거나 비슷하기때문에 
		// 코드 유지 보수 시 참조하는 객체만 변경하면 유지 보수가 완료됨!!
		
		//Calculator cal = new KRRCalcultor();
		Calculator cal = new KRRCalculator2();
		
		
		System.out.println(cal.plus(1, 2));
		System.out.println(cal.minus(0, 0));
		System.out.println(cal.multi(0, 0));
		System.out.println(cal.div(2, 2));
		System.out.println(cal.mod(10,2));
		
		System.out.println("=============================");
	 
		System.out.println(cal.sum(10,2,5));
		System.out.println(cal.areaOfCircle(5));
		System.out.println(cal.rangeCheck(500));

		System.out.println(cal.pow(2, 10)); //1024
		System.out.println(cal.toBinary(15));
		System.out.println(cal.toHexadecimal(15));
		
		
		//참조변수의 자료형을 Machine으로 강제 형변화 해야지만 
		//poweron, poweroff 호출 가능
		Machine machine = (Machine)cal;
		
		
		
		
		
		
	}
}
