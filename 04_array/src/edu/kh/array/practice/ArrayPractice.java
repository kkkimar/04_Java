package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	Scanner sc = new Scanner(System.in);
	
	
	/*
	 * 실습문제 1
	 * */
	 public void practice1(){
		 
		 int[] arr = new int[9];
		 
		 int sum = 0;
		 
		 //짝수 번째 인덱스 값의 합을 출력
		 for(int i=0; i< arr.length; i++) {
			 arr[i] = i+1;
			 if(i % 2 == 0 || i == 0) {
				 sum += arr[i];
			 }
		 }
		 System.out.println(Arrays.toString(arr));
		 System.out.printf("짝수 번째 인덱스 합 : %d", sum);
		 
	 }//practice1
	 
	 
	 /*
	  * 실습문제 2
	  * */
	 
	 public void practice2(){
		 //길이가 9인 배열을 선언 및 할당하고
		 
		 //9부터 1까지의 값을 반복문을 이용하여
		 
		 //순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		 
		 //홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
		 
		 int[] arr2 = new int[9];
		 int sum =0;
		 
		 for(int i=0; i< arr2.length; i++) {
			 System.out.println(i);
			 for(int x=9 ; x>0 ; i--) {
				 
			 }
			 
		 }
		 
		 System.out.println(Arrays.toString(arr2));
	 }
	 
		 

		 


}
