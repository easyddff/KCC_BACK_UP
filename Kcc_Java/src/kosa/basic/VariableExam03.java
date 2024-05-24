package kosa.basic;

public class VariableExam03 {

	public static void main(String[] args) {
		//지역(로컬)변수 특징 2가지
		//반드시 초기화후에 사용
		//선언된 변수는 정의된 범위안에서만 사용
		
		int num=0;
		num = num+1;
		System.out.println(num);
		
		int a=0;
		if(num==1) {
			a=100;
			
		}
		System.out.println("a:"+a);
		
		
		
		int i=1; //for문 반복하는 i값을 밖에서 사용하고자해서
		for (; i <= 10; i++) {
			System.out.print(i);
		}
		System.out.println("최종 i값"+i);
		
		//변수 사용시 고민?
		//1. 어떤 종류의 데이터? => 데이터타입 선언 결정
		//2. 데이터를 어디까지 사용? => 변수 선언 위치 결정
		
		//연산자 %
		System.out.println(10%3);
		
		if(11%2==0) {
			System.out.println("2의배수");
		}else {
			System.out.println("2의배수가아님");
		}
		
		
		int num2=1;
//		num2=num2+1;
//		num2+=1; >> 복합연산자
		num2++; // >> 증강연산자
		
		System.out.println(num2);
		
		
		
		int x=10;
		int y=0;
		
		y= x++; //후치증감자>> x는 11로 증가하지만 y값은 증가가 뒤에 있기때문에 영향을 받지않는다.
		
		System.out.println(x++); // 위의 후치증감자와 같게 먼저 출력되고 증가한것
		System.out.println(++x); // 전치증감자와 같게 먼저 출력되고 증가한것
		System.out.println(y);
		
		
		double d = 3.14+1;
		System.out.println(d);
		if(d==4.14) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}//결과는 다르다. 더블형 정의된 부분을 찍어보면 4.140000000000001으로 나온다.> 정확하지않음
		
		
		
		int b=10;
		int c=20;
		
		int max=(b>c)?b:c;
		System.out.println(max);
		
	}//end

}
