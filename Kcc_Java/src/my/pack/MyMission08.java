package my.pack;

import java.util.Scanner;

public class MyMission08 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("������ �Է��ϼ���: ");
//		int num1 = sc.nextInt();
//		
//		if(num1>=90) {
//			System.out.println("A�����Դϴ�.");
//		}else if(num1>=80) {
//			System.out.println("B�����Դϴ�.");
//		}else if(num1>=70) {
//			System.out.println("C�����Դϴ�.");
//		}else if(num1>=60) {
//			System.out.println("D�����Դϴ�.");
//		}else if(num1<60) {
//			System.out.println("F�����Դϴ�.");
//		}
		
		int num1=(int)((Math.random()*6)+1);
		
		System.out.println(num1+"�� ���Խ��ϴ�.");
		
//		if(num1%2==0) {
//			System.out.println("¦���Դϴ�.");
//		}else {
//			System.out.println("Ȧ���Դϴ�.");
//		}
		int num2 = (num1%2==0)?1:0;
		
	}

}