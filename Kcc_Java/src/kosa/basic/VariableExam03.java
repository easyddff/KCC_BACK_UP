package kosa.basic;

public class VariableExam03 {

	public static void main(String[] args) {
		//����(����)���� Ư¡ 2����
		//�ݵ�� �ʱ�ȭ�Ŀ� ���
		//����� ������ ���ǵ� �����ȿ����� ���
		
		int num=0;
		num = num+1;
		System.out.println(num);
		
		int a=0;
		if(num==1) {
			a=100;
			
		}
		System.out.println("a:"+a);
		
		
		
		int i=1; //for�� �ݺ��ϴ� i���� �ۿ��� ����ϰ����ؼ�
		for (; i <= 10; i++) {
			System.out.print(i);
		}
		System.out.println("���� i��"+i);
		
		//���� ���� ����?
		//1. � ������ ������? => ������Ÿ�� ���� ����
		//2. �����͸� ������ ���? => ���� ���� ��ġ ����
		
		//������ %
		System.out.println(10%3);
		
		if(11%2==0) {
			System.out.println("2�ǹ��");
		}else {
			System.out.println("2�ǹ�����ƴ�");
		}
		
		
		int num2=1;
//		num2=num2+1;
//		num2+=1; >> ���տ�����
		num2++; // >> ����������
		
		System.out.println(num2);
		
		
		
		int x=10;
		int y=0;
		
		y= x++; //��ġ������>> x�� 11�� ���������� y���� ������ �ڿ� �ֱ⶧���� ������ �����ʴ´�.
		
		System.out.println(x++); // ���� ��ġ�����ڿ� ���� ���� ��µǰ� �����Ѱ�
		System.out.println(++x); // ��ġ�����ڿ� ���� ���� ��µǰ� �����Ѱ�
		System.out.println(y);
		
		
		double d = 3.14+1;
		System.out.println(d);
		if(d==4.14) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}//����� �ٸ���. ������ ���ǵ� �κ��� ���� 4.140000000000001���� ���´�.> ��Ȯ��������
		
		
		
		int b=10;
		int c=20;
		
		int max=(b>c)?b:c;
		System.out.println(max);
		
	}//end

}