package kosa.basic;

import java.util.Scanner;

public class VariableExam02 {

	public static void main(String[] args) {
		//Ű����κ��� ������ �Է�
		//import�� ���ִ� ���� : �����Ű���� �ִ� ��ĳ������
		Scanner sc = new Scanner(System.in); //Ű����κ��� �����Ͱ��� �Է� �ް��ϴ°�
		
//		System.out.print("���� �Է�: ");//println : ������ �ޱ� , print: �����ιޱ�
//		int num = Integer.parseInt(sc.nextLine()); // parseInt�̿��� ���������� ��ȯ
		//int num =sc.nextInt(); // 10 + enter �� �Է�
		
		//sc.nextLine(); //ù��° �ذ�� : �������ڿ� �Է¹���
		
//		System.out.print("���ڿ� �Է�: ");
//		String str=sc.nextLine();
//		
//		System.out.println(num);
//		System.out.println(str);
		
		//int <==> char : �ƽ�Ű�ڵ尪
//		char ch = 'A'; //'' > char , "" > String
////		System.out.println((int)ch);
//		
//		//A~Z (for �� �̿�) ��ü ���
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