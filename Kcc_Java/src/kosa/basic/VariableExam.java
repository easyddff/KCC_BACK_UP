package kosa.basic;

public class VariableExam {
	public static void main(String[]args) {
		// ������ �����͸� ��� �׸�  ex)���ڿ�(ȫ�浿), ���ڿ�(100), �Ǽ���(3.14), ������(true)
		// byte, short, int, long, float, double, boolean, char: �⺻�� ������(primitive type)8���� :���������°� �پ��ϱ� ������
		// ����: �⺻�� ������(������Ƽ�� ������Ÿ��), �����ݽ� ������ (������Ʈ������Ÿ��)
		int num; //���� ���� : �޸� �Ҵ�
		int arr[]; //�迭 ���� : Object Type > ���� �����Ͱ�x >�����ϰ��ִ� ����
		
		num = 10; //���Կ�����
		System.out.println(num);
		
		//���� ����, �ʱ�ȭ �ѹ���
		int num2 = 100;
		
		//���ڿ� :String
		String name="ȫ�浿";
		System.out.println(name + "��");
		
		//�������� ���ǻ���
		//������ : Ư������X, ���ڽ���X, �ҹ��ڷ� ����, _
		
		//�⺻ ���ͷ� : ����� ������ ������ Ÿ�� ex) 100,"", true, ", 3.124
		// 100=>int, ""=>String, 'A'=>char, true=>boolean, 3.14=>double
		float a = 3.14f; // f���ٿ��� ����
		
		//casting(����ȯ)
		//����: byte < short < int < long < float < double, int <=> char : ���� ���� ū ������ ���� ���� ������.
		double b = 100; //������ ����ȯ
		
		int c = (int)3.14;
		System.out.println(c);
		
		float num3 = 3.14f;
		long num4 = 100L; // �����ִ°�
		
		int num5 = 010; // > 8����
		System.out.println(num5);
		
		System.out.println(10 + 3 + "��");
		System.out.println("��" + 10 + 3 );
	}
}