package my.pack;

import java.util.Scanner;

public class MyMission08 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수를 입력하세요: ");
//		int num1 = sc.nextInt();
//		
//		if(num1>=90) {
//			System.out.println("A학점입니다.");
//		}else if(num1>=80) {
//			System.out.println("B학점입니다.");
//		}else if(num1>=70) {
//			System.out.println("C학점입니다.");
//		}else if(num1>=60) {
//			System.out.println("D학점입니다.");
//		}else if(num1<60) {
//			System.out.println("F학점입니다.");
//		}
		
		int num1=(int)((Math.random()*6)+1);
		
		System.out.println(num1+"이 나왔습니다.");
		
//		if(num1%2==0) {
//			System.out.println("짝수입니다.");
//		}else {
//			System.out.println("홀수입니다.");
//		}
		int num2 = (num1%2==0)?1:0;
		
	}

}
