package kosa.mission;

import java.util.Scanner;

public class Mission02 {

	public static void main(String[] args) {
		// �������� ����
		//����, ����, ���� ������ Ű����κ��� �Է� �ް�
		// ������ ����� ����ϼ���. (�� ����� �Ǽ���)
		Scanner sc = new Scanner(System.in);
//		String str=sc.nextLine();
		
		System.out.print("����: ");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.print("����: ");
		int eng = Integer.parseInt(sc.nextLine());
		System.out.print("����: ");
		int math = Integer.parseInt(sc.nextLine());
		
		int all = kor + eng+ math;
		System.out.println("������ " + all + "�Դϴ�.");
//		int sev = all/3; //�������� ����
//		double sev = all/3.0; //double �Ǽ��� 
		int sev = (int) (all/3.0); //�������� ����
		
		System.out.println("����� " + sev + "�Դϴ�.");
		
		//������ 90 �̻� => A����
		//80 �̻� => B����
		//70 �̻� => C����
		//60 �̻� => D����
		//60 �Ʒ� => F����
		
		if(sev>=90) {
			System.out.println("A����");
		}else if(sev>=80) {
			System.out.println("B����");
		}else if(sev>=70) {
			System.out.println("C����");
		}else if(sev>=60) {
			System.out.println("D����");
		}else {
			System.out.println("F����");
		};
		
		
		

	}

}