package kosa.mission;

import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {
		// �޴��� �����ؼ� �ش� �޴��� ���ɹ����� ������ ����.
		// 1.�߰� 2.��� 3.�˻� 4.����
//		String add, call, sear, end;
//		String all="1.a\n2.b\n3.c";
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println(all);
//		System.out.println("�޴��� �߰��Ͻðڽ��ϱ�?");
//		add=sc.nextLine();

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.�߰� 2.��� 3.�˻� 4.����");
			System.out.println("�޴�: ");
			String menu = sc.nextLine();
			
			switch(menu) {
			case "1":
				System.out.println("�߰�����");
				break;
			case "2":
				System.out.println("��¼���");
				break;
			case "3":
				System.out.println("�˻�����");
				break;
			case "4":
				System.out.println("���α׷�����");
				return;
			}
			
		}	
		
		
		
	}

}