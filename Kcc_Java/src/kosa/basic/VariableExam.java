package kosa.basic;

public class VariableExam {
	public static void main(String[]args) {
		// 변수는 데이터를 담는 그릇  ex)문자열(홍길동), 숫자열(100), 실수형(3.14), 논리값(true)
		// byte, short, int, long, float, double, boolean, char: 기본형 데이터(primitive type)8가지 :데이터형태가 다양하기 때문에
		// 종류: 기본형 데이터(프리미티브 데이터타입), 레버펀스 데이터 (오브젝트데이터타입)
		int num; //변수 선언 : 메모리 할당
		int arr[]; //배열 선언 : Object Type > 실제 데이터값x >참조하고있는 내용
		
		num = 10; //대입연산자
		System.out.println(num);
		
		//변수 선언, 초기화 한번에
		int num2 = 100;
		
		//문자열 :String
		String name="홍길동";
		System.out.println(name + "님");
		
		//변수선언 주의사항
		//변수명 : 특수문자X, 숫자시작X, 소문자로 시작, _
		
		//기본 리터럴 : 어떤값이 가지는 데이터 타입 ex) 100,"", true, ", 3.124
		// 100=>int, ""=>String, 'A'=>char, true=>boolean, 3.14=>double
		float a = 3.14f; // f만붙여도 가능
		
		//casting(형변환)
		//기준: byte < short < int < long < float < double, int <=> char : 작은 것이 큰 것으로 가는 것은 괜찮다.
		double b = 100; //묵시적 형변환
		
		int c = (int)3.14;
		System.out.println(c);
		
		float num3 = 3.14f;
		long num4 = 100L; // 정해주는것
		
		int num5 = 010; // > 8진수
		System.out.println(num5);
		
		System.out.println(10 + 3 + "우");
		System.out.println("우" + 10 + 3 );
	}
}
