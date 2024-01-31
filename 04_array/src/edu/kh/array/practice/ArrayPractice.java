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
		 
		 //길이가 9인 배열을 선언 및 할당
		 int[] arr = new int[9];
		 int sum = 0;
		 
		 //9부터 1까지의 값을 반복문을 이용
		 //순서대로 배열의 각 인덱스 요소에 대입한 후 출력
		 
		 for (int i =0; i < arr.length ;i++) {
			 arr[i] = 9 -i ;
			 
			 if(i % 2 != 0) {
				 sum += arr[i];
			 }
		 }
		 System.out.println(Arrays.toString(arr));
		 System.out.printf("홀수 번째 인덱스 합 : %d", sum);

	 }//practice2
		 

	 /*
	  * 실습문제 3
	  * */
	 public void practice3(){
		 //사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당
		 
		 System.out.println("양의 정수 : ");
		 int input = sc.nextInt();
		 
		 if(input < 0) {
			 System.out.println();
			 return;
		 }
		 
		 int[] arr2 = new int[input];

		 
		 for(int i=0; i < arr2.length; i++ ) {
			 arr2[i] = i+1;
		 }
		 
		 System.out.println(Arrays.toString(arr2));
		 
	 }//practice3
	 
	 
	 /*
	  * 실습문제4 - 모르겠음
	  * */
	 public void practice4(){
		 
		 
		 //정수 5개를 입력 받아 배열 초기화
		 int[] arr = new int[5];
 
		 System.out.print("입력 : ");
		 int input = sc.nextInt();
		 		 
		 for(int i=0 ; i<=5 ;i++ ) {
			 arr[i] += input;			
			 System.out.printf("입력 %d : %d \n", i, arr[i]);
			 
		 
	 }

		 
	 }//practice4
	 
	 public void practice5(){
		 
		 System.out.println("정수 : ");
		 int input = sc.nextInt();
		 
		 int[] arr = new int[input];
		 
		 int sum = 0;
		 
		 System.out.println("숫자 입력 : ");
		 
		 for(int i=0; i<arr.length ;i++) {
			 int num = sc.nextInt();
			 
			 arr[i] += num;
			 sum += arr[i];
			 
			 System.out.printf("배열 %d번째 인덱스에 넣을 값 : %d \n", i, num);
		 }
		 System.out.println(Arrays.toString(arr));
		 //총합
		 System.out.println("총 합 : "+ sum);
		 
	 		 	 
	 }//practice5


	 

}
