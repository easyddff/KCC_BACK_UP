package kosa.mission;

import java.util.Scanner;

//import com.sun.org.apache.xpath.internal.operations.Equals;

public class Mission04 {

	public static void main(String[] args) {
		//문자열 비교
//		String a="abc";
//		String b="abc";
//		//대입연산자로 만들면 주소값이 같다. 
//		//즉 객체타입은 주소값을 비교하는 것
//		
//		if(a.equals(b)) { //a.equals(b) 문자열 비교
//			System.out.println("같다");
//		}else {
//			System.out.println("틀리다");
//		}
		
		//두 정수와 연산자 문자열을 입력받아
		//사칙연산 결과를 출력하시오. (계산기)
		//ex> 	정수1: 10
		//		정수2: 20
		//		연산자: +
		//결과> 30
		
		int num1, num2;
		String pass;
		Scanner sc = new Scanner(System.in);
		Scanner os = new Scanner(System.in);
		
		System.out.print("정수1: ");
		num1=sc.nextInt();
		System.out.print("정수2: ");
		num2=sc.nextInt();
		System.out.print("연산자: ");
		pass=os.nextLine();
		double result=0;
		
		
		if(pass.equals("+")) {
			result=num1+num2;
		}else if(pass.equals("-")) {
			result=num1-num2;
		}else if(pass.equals("*")) {
			result=num1*num2;
		}else if(pass.equals("/")) {
			result=num1/num2;
		}
//		switch (pass) {
//		case ():
//			result=num1+num2;
//			System.out.println(result);
//			break;
//		
//
//		default:
//			break;
//		}
		
		System.out.println(result);
		
		

	}

}
