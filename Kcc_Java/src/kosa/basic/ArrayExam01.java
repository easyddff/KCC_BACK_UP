package kosa.basic;

import java.util.Scanner;

public class ArrayExam01 {

	public static void main(String[] args) {
		// 1. �迭 ����, ���� �и�
		int arr[];// �迭 ����
		arr=new int[5]; //�迭 ����(�޸� �Ҵ�)
		
		//2. �迭 ����, ���� �Բ�
		int arr2[]=new int[5];
		arr2[0]=10; //�迭�� 0���� ����
		arr2[1]=20;
		
		//3.�迭����, ����, �ʱ�ȭ �Բ�
		int arr3[]= {1,2,3,4,5};
		
		//�迭�� �ִ� ���� ��ü ��� for (0~4)
		for(int i=0; i<arr3.length; i++) { //�迭�� ����
			System.out.println("arr3["+i+"]"+arr3[i]);
		}// >> �ε��������� �˾ƾ��� �� ���.
		
		//���� for��
		for(int n:arr3) {
			System.out.println(n+",");
		} // >> �ȿ� ��ġ�� �����͸� �̾Ƴ� �� �ִ�. �ε������� �˾ƾ��� �� ������ �ȵ�.
		
		//�迭 ��� ���
		//1. �迭�� ���� ������Ÿ���� �����Ѵ�.
		//2. �迭�� ũ�⸦ �����Ѵ�. >> ũ�⸦ ������ų �� ����. => ArrayIndexOfBoundsExcption ���� �߻� > �迭�� ũ�⺸�� �ʰ�
		//3. �迭 ���� ��� => 1, 2, 3 ������� ����(���� ���)
		//4. �迭�� ��� �ʱ�ȭ�� ������ => ���� �ε����� ������ ������, for��, ������ �Բ� �ʱ�ȭ����
		//5. �ش��ϴ� �迭�� �����͸� ��� ����� ������ => for��, ���� for��, ���� �ε���
		
		
		//���� > Ű����κ��� ���ڿ��� �Է¹޾� �迭�� �߰��� �� ��ü�� �������
		//"q"�� �Է��Ҷ����� �Է¹޴´�.
		//>�Է�: ȫ�浿
		//>�Է�: �ڱ浿
		//>�Է�: q
		//>���: ȫ�浿, �ڱ浿
		
//		String now[];
//		now= new String[5];
		String now[]= new String[5];
		Scanner sc = new Scanner(System.in);
		int count=0;
		
//		System.out.print("���ڿ��� �Է��Ͻÿ�: ");
		
//		String plus=sc.nextLine();		
//		for (int i = 0; i <6; i++) {
//			now[i]=plus;
//		}
		
		while(true) {
			System.out.println("�Է�>");
			String str = sc.nextLine();
			if(str.equals("q"))break;
			now[count++]=str;
		}
		
		for(int i=0;i<count;i++) {
			System.out.println(now[i]+",");
		}
		
		
		
		

	}

}