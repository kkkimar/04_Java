package edu.kh.poly.pack3.model.dto;

public class KRRCalculator2  implements Calculator, Machine{
	
	

	@Override
	public int plus(int a, int b) {
		
		int result = a + b;
		
		return result;
	}

	@Override
	public int minus(int a, int b) {
		
		int result = a - b ;
		
		return result;
	}

	@Override
	public int multi(int a, int b) {
		
		int result = a * b ;
		
		return result;
	}

	@Override
	public double div(int a, int b) {
		
		if(b == 0) {
			return 0.0;
		}else {
			return (double)a / b ;
		}
		
		//return b == 0 ? 0.0 : (double)a/b;
	
	}

	@Override
	public int mod(int a, int b) {

		int result = a % b; 
		
		return result;
	}

	@Override
	public int sum(int... numbers) {
		
		//가변인자(...) : 전달 인자의 개수 (전달 되는 값의 개수)가 변할 수 있는 매개변수(전달 인자)
		//-> printf()가 가변인자 사용의 가장 대표적인 예시 
		
		//numbers는 int[] 타임
		
		int sum = 0 ;
		
		for(int i : numbers) {
			sum += i;
		}
		
		return sum;
	}

	@Override
	public double areaOfCircle(double r) {

		//원의 넓이 ( PI * R * R)
		
		double result = Calculator.PI * r * r;
		
		return result;
	}

	@Override
	public boolean rangeCheck(int num) {
		
		/** 전달 받은 숫자가 계산기 최대, 최소 범위 내 숫자가 맞는지 확인
		 * @param num
		 * @return 최대, 최소 범위 내 숫자가 맞으면 true, 아니면 false
		 */
		
		boolean flag = false;
		
		return num >= Calculator.MIN_NUM && num <= Calculator.MAX_NUM;

	}

	@Override
	public int pow(int a, int x) {
		
		int result = 1;
		
		for(int i =0 ; i <x ; i++) {
			result *= a;
		}		
		return result;
	}

	
	/** 전달 받은 정수를 2진수 String으로 변환해서 반환
	 * @param num
	 * @return 2진수
	 */
	@Override
	public String toBinary(int num) {
		int inputValue = num;
		String result = Integer.toBinaryString(inputValue);
		return result;
	}
	
	
	/** 전달 받은 정수를 16진수 String으로 변환해서 반환
	 * @param num
	 * @return 16진수
	 */
	@Override
	public String toHexadecimal(int num) {
		int input = num;
		String result = Integer.toHexString(input);
		return result;
	}

	@Override
	public void powerOn() {
		System.out.println("krr 계산기 실행");
	}

	@Override
	public void powerOff() {
		System.out.println("krr 계산기 꺼짐");

	}
	
}
