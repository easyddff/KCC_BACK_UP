package kosa.basic;

public class LoopExam02 {

	public static void main(String[] args) {
		// ��ø for��
		// ��ü ������ ��� (������������� ��� �ۼ��ؾ���)
		// ��ø for���� �̿��ؼ� ������ ���
//		for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.println(i+"*"+j+"="+(i*j));
//			}
//		}
		
		//����> 4x + 5y = 60 => x,y�� ������(��� ����� ��)
//		for (int x = 0; x <=15; x++) {
//			for (int y = 0; y <=12; y++) {
//				if((4*x)+(5*y)==60) {
//					System.out.println(x+"��"+y);
//				}
//			}
//		}
		
		
//		outerLabel:
//		for (int x = 0; x <=15; x++) {
//			for (int y = 0; y <=12; y++) {
//				if((4*x)+(5*y)==60) {
//					System.out.println(x+"��"+y);
////					break;//�ȿ��� ����� ������ �ۿ��� �ٽùݺ�
//					break outerLabel; //�ۿ� ���� �ϸ� ����
//				}
//			}
//		}
		
		//����>
		//*
		//**
		//***
		//****
		//*****

		//*****
		//****
		//***
		//**
		//*
		
		for (int i=1; i<=5; i++) {
//			System.out.print("���� i��"+i+" ");
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 5; i >0; i--) {
			for (int j=i; j >0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}