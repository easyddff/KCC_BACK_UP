package my.pack;

import java.util.Scanner;

public class MyMission06 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Scanner os = new Scanner(System.in);
//		System.out.print("����1: ");
//		int num1=sc.nextInt();
//		System.out.print("����2: ");
//		int num2=sc.nextInt();
//		System.out.print("������: ");
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
//		System.out.println("����� " + result + " �Դϴ�.");
		
		Scanner sc = new Scanner(System.in);
		Scanner os = new Scanner(System.in);
		
		
		System.out.print("����1: ");
		int num1=sc.nextInt();
		System.out.print("����2: ");
		int num2=sc.nextInt();
		System.out.print("������ ");
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
		
		System.out.println("����� "+result+"�Դϴ�.");
		
		
		
	}

}
