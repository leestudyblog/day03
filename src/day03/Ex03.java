package day03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	/*
		int num1, num2;

		System.out.println("수 입력하기 : ");
		num1=input.nextInt();
		String s= (num1%2==0)?"짝수" :"홀수";
		System.out.println(num1 +" : "+s);
		s= (num1%3==0)?"3의 배수" :"3의 배수 아님";
		System.out.println(s);
	
		System.out.println("두 수 입력 : ");
		num1=input.nextInt();
		num2=input.nextInt();
		System.out.println("num1 : "+num1+" num2: "+num2);
		*/
		
		int no1, no2;
		System.out.println("비교할 두 수 입력 : ");
		String no;
		no1=input.nextInt();
		no2=input.nextInt();
		no = (no1>no2)? "num1이 num2보다 크다" : "num2이 num1보다 크다";
		System.out.println(no);
		
	}

}
