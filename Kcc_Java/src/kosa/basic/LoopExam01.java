package kosa.basic;

import java.util.Scanner;

//import com.sun.tools.jdeprscan.scan.Scan;

public class LoopExam01 {

	public static void main(String[] args) {
		//while : �ʱ�� -> ���ǽ� -> ���ɹ� -> ������ : ��������
		// 1~10���� ��
//		int sum=0;
//		int i=1;
//		while(i<=10) {
//			sum+=i;
//			i++;
//		}
//		System.out.println("1~10�������� "+sum);
		
		//���� > ������ 7�� ���
		//7*1=7
		//7*2=14
		
//		int i=1;
//		
//		while(i<=9) {
//			System.out.println("7*"+i+"="+(7*i));
//			i++;
//		}
		
//		int sum=0;
//		for(int i=1; i<=10;i++) {
//			sum+=i;
//			
//		}
//		System.out.println("1~10��������"+sum);
		
		//���� 1~100���� 2�ǹ���� 3�� ����� �ƴ� ���ڸ� ����Ͻÿ�
		
//		for (int i = 1; i <= 100; i++) {
//			if(!(i%2==0 || i%3==0)) {
//				System.out.println(i);
//			}
//		}
		
//		for (int i = 1; i <= 100; i++) {
//			if(i%2==0 || i%3==0) {
//				continue; //�ش� ���� �ȿ��� �ݺ��� �������� �Ҷ�
//				
//			}
//			System.out.println(i);
//		}
		
		
		
		//do~while : ���ɹ��� �ѹ��� ������ �ؾ��Ҷ�
		//Ű����κ��� ���ڸ� �Է� �ޱ�
		//������ �Է��ϸ� ���� �Է� �޵��� �ϱ� ����
//		Scanner sc = new Scanner(System.in);
//		int n=0;
//		do {
//			System.out.print("�Է�: ");
//			n=sc.nextInt();
//		}while(n<0);
//		System.out.println("�Է� ���: "+n);
		
		//����> 2���� ������ �Է� �޾� b-a ��� ��� ����.
		// b > a �ǵ��� �Է� => a�� b���� ũ�� ���� �Է¹޵��� ����.
		
//		int a, b=0;
//		do {
//			System.out.println("�Է�: ");
//			a=sc.nextInt();
//			b=sc.nextInt();
//		}while(b>a);
//		System.out.println((b-a));
		
		
		
		//����3> ������ ���� 3�� �޾Ƽ� ���� ��ø���� �ʰ� ����ϱ� 
//		int n=(int) ((Math.random()*9)+1);
//		System.out.println(n);
		
		int a,b,c;
		
		do {
			a=(int)((Math.random()*9)+1);
			b=(int)((Math.random()*9)+1);
			c=(int)((Math.random()*9)+1);
		}while(a==b||b==c||c==a);
		
		System.out.println(a+","+b+","+c);
		
//		if(!(a==b&&b==c&&a==c)) {
//			System.out.println(a+","+b+","+c);
//		}
		
	}

}