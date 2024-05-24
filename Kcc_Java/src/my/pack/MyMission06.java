package my.pack;

import java.util.Scanner;

public class MyMission06 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Scanner os = new Scanner(System.in);
//		System.out.print("정수1: ");
//		int num1=sc.nextInt();
//		System.out.print("정수2: ");
//		int num2=sc.nextInt();
//		System.out.print("연산자: ");
//		String add=os.nextLine();
//		double result = 0;
//		
//		if(add.equals("+")) {
//			result=num1+num2;
//		}else if(add.equals("-")) {
//			result=num1-num2;
//		}else if(add.equals("*")) {
//			result=num1*num2;
//		}else if(add.equals("/")) {
//			result=num1/num2;
//		}else if(add.equals("%")) {
//			result=num1%num2;
//		}
//		System.out.println("결과는 " + result + " 입니다.");
		
		Scanner sc = new Scanner(System.in);
		Scanner os = new Scanner(System.in);
		
		
		System.out.print("정수1: ");
		int num1=sc.nextInt();
		System.out.print("정수2: ");
		int num2=sc.nextInt();
		System.out.print("연산자 ");
		String doc = os.nextLine();
		
		double result=0;
		
		if(doc.equals("+")) {
			result=num1+num2;
		}else if(doc.equals("-")) {
			result=num1-num2;
		}else if(doc.equals("*")) {
			result=num1*num2;
		}else if(doc.equals("/")) {
			result=num1/num2;
		}else if(doc.equals("%")) {
			result=num1%num2;
		}
		
		System.out.println("결과는 "+result+"입니다.");
		
		
		
	}

}
