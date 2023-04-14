package day03;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 -연산자
		  : +, -, *, /(몫), %(나머지)
		 - 복합 대입 연산자
		  : num += 10; (num = num+10;)
		 - 관계 연산자 :true 또는 false 결과만 나옴
		  : >, <, >=, <=, ==, !=(같지 않으면 참)
		    a=10; b=20;
		    a > b(a가 b보다 큰지)  -> false
		 - 논리 연산자 : true & false (여러 식을 묶어 한번에 계산)
		  : &&(and - 모든 값이 참일때만 참), ||(or - 하나라도 참이면 참), !(not - 결과 반전)
		 - 증감 연산자 (결과적으로 자기 자신을 1 증가 또는 감소)
		  : ++num, num++, --num. num--
		    num = num+1
		  */
		int num1=9, num2=2;
		System.out.println(num1/num2);
		System.out.println(num1/(float)num2);
		System.out.println(num1%num2);

		//복합 대입 연산자 
		System.out.println("===복합 대입 연산자===");
		int su1, su2;
		su1 =su2 =5;
		
		su1+=1;
		System.out.println(su1); // 5+1=6
		su1-=1;
		System.out.println(su1);//6-1=5
		su1*=su2;
		System.out.println(su1);//5*5=25
		su1/=su2;
		System.out.println(su1);//25/5=5
		su1%=su2;
		System.out.println(su1);//5%5=0

		//관계 연산자
		System.out.println("===관계 연산자===");
		double  do01= 1.1, do02 = 1.2;
		System.out.println(do01 >= do02);
		System.out.println(do01 <= do02);
		System.out.println(do01 == do02);
		System.out.println(do01 != do02);
		
		//논리 연산자
		System.out.println("===논리 연산자===");
		int num =10;
		System.out.println(num > 5);
		System.out.println(num > 5 && num %2 ==0); // 5 비교, 짝수 판별 
		System.out.println(num % 2 == 1); // 홀수 판별 
		System.out.println("--OR--");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println("--AND--");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println("--NOT--");
		System.out.println("!true" + !true);
		System.out.println("!false" + !false);

		//증감 연산자
		System.out.println("===증감 연산자===");
		int n;
		n=5;
		System.out.println("--전위--");
		++n;
		System.out.println(n);
		n=5;
		System.out.println("--후위--");
		n++;
		System.out.println(n);
		System.out.println("--연산시 전위 후위 차이--");
		int a,b,c;
		c=10;
		a= ++c +10;
		c=10;
		b=c++ +10;
		System.out.println("a : "+a); //10 +1 11+10 =21
		System.out.println("b : "+b); // 10+10 =20 (모든 연산 후에 결과값)
		System.out.println("c : "+c);
		
		//비트 연산자
		System.out.println("===비트 연산자===");
		System.out.println(10&5);//false
		System.out.println(3&5);//true
		

		
	}

}
