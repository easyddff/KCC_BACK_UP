package my.pack;

import java.util.Scanner;

public class MyMission03 {

	public static void main(String[] args) {
//		String name, address;
//		int number;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("�̸�: ");
//		name = sc.nextLine();
//		System.out.print("�ּ�: ");
//		System.out.print("��ȭ��ȣ: ");
//		number = sc.nextInt();
//		
//		System.out.println(name+"���� \n�ּҴ� "+address+"�̸� \n��ȭ��ȣ�� "+number+"�Դϴ�.");
		
		Scanner sc = new Scanner(System.in);
		String name, address;
		int num;
		
		System.out.print("�̸�: ");
		name=sc.nextLine();
		System.out.print("�ּ�: ");
		address=sc.nextLine();
		System.out.print("��ȣ: ");
		num=sc.nextInt();
		
		System.out.println("�̸��� "+name+"�̸�\n"+"�ּҴ� "+address+"�̰�\n"+"��ȣ�� "+num+"�̴�.");
		
		

	}

}
