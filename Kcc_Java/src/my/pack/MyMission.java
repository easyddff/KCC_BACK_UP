package my.pack;

import java.util.Scanner;

public class MyMission {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�̸�: ");
//		String str = sc.nextLine();
//		
//		String name = str;
//		
//		System.out.println("���̸��� " + name + " �Դϴ�.");
		int kor, eng, mat;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("����� �̸��� �����Դϱ�? ");
		
//		String str = sc.nextLine();
//		String name = str;
		System.out.println("ȯ���մϴ�. " + sc.nextLine() + "��");
		
		System.out.println("������ �Է��Ͻʽÿ�");
		Scanner os=new Scanner(System.in);
		System.out.print("����: ");
		kor=os.nextInt();
		System.out.print("����: ");
		eng=os.nextInt();
		System.out.print("����: ");
		mat=os.nextInt();
		
		int all = kor+eng+mat;
		System.out.println("����� ������ "+ all + " �Դϴ�.");
		float aver = (float)(all/3.0); //�ȿ� �ִ� �����Ͱ��� �⺻�� double�̴�. �׷��⶧���� �ѹ��� ĳ��Ʈ�������
		// ĳ��Ʈ�� �ȿ��ִ� �����Ͱ��� ���� ���Ѵ�. int�� int�� ������ϴ°�
		System.out.println("����� �����"+ aver + " �Դϴ�.");
		
		
	}

}