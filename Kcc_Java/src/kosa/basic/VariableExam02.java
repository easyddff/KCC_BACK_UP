package kosa.basic;

import java.util.Scanner;

public class VariableExam02 {

	public static void main(String[] args) {
		//키보드로부터 데이터 입력
		//import를 해주는 이유 : 어느패키지에 있는 스캐너인지
		Scanner sc = new Scanner(System.in); //키보드로부터 데이터값을 입력 받게하는것
		
//		System.out.print("정수 입력: ");//println : 밑으로 받기 , print: 옆으로받기
//		int num = Integer.parseInt(sc.nextLine()); // parseInt이용해 정수형으로 변환
		//int num =sc.nextInt(); // 10 + enter 가 입력
		
		//sc.nextLine(); //첫번째 해결법 : 다음문자열 입력방지
		
//		System.out.print("문자열 입력: ");
//		String str=sc.nextLine();
//		
//		System.out.println(num);
//		System.out.println(str);
		
		//int <==> char : 아스키코드값
//		char ch = 'A'; //'' > char , "" > String
////		System.out.println((int)ch);
//		
//		//A~Z (for 문 이용) 전체 출력
//		for (int i = 65; i < 91; i++) {
//			System.out.println((char)i+"");
//		}
//		
		//int<==>String
		String num2="100";
		int num3 = Integer.parseInt(num2);
		int result = num3+100;
		System.out.println(result);
		
		int num4 = 10;
		String num5 = String.valueOf(num4);
		String num6 = num4 + "";
		
		String str = 7 + "7" + 7;
		System.out.println(str);
		
		String nom1="222";
		int nom2 = 333;
		int price=Integer.parseInt(nom1)+nom2;
		System.out.println(price);

	}

}
