package kosa.mission;

import java.util.Scanner;

//import com.sun.org.apache.xpath.internal.operations.Equals;

public class Mission04 {

	public static void main(String[] args) {
		//���ڿ� ��
//		String a="abc";
//		String b="abc";
//		//���Կ����ڷ� ����� �ּҰ��� ����. 
//		//�� ��üŸ���� �ּҰ��� ���ϴ� ��
//		
//		if(a.equals(b)) { //a.equals(b) ���ڿ� ��
//			System.out.println("����");
//		}else {
//			System.out.println("Ʋ����");
//		}
		
		//�� ������ ������ ���ڿ��� �Է¹޾�
		//��Ģ���� ����� ����Ͻÿ�. (����)
		//ex> 	����1: 10
		//		����2: 20
		//		������: +
		//���> 30
		
		int num1, num2;
		String pass;
		Scanner sc = new Scanner(System.in);
		Scanner os = new Scanner(System.in);
		
		System.out.print("����1: ");
		num1=sc.nextInt();
		System.out.print("����2: ");
		num2=sc.nextInt();
		System.out.print("������: ");
		pass=os.nextLine();
		double result=0;
		
		
		if(pass.equals("+")) {
			result=num1+num2;
		}else if(pass.equals("-")) {
			result=num1-num2;
		}else if(pass.equals("*")) {
			result=num1*num2;
		}else if(pass.equals("/")) {
			result=num1/num2;
		}
//		switch (pass) {
//		case ():
//			result=num1+num2;
//			System.out.println(result);
//			break;
//		
//
//		default:
//			break;
//		}
		
		System.out.println(result);
		
		

	}

}
