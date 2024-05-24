package kosa.basic;

import java.util.Scanner;

public class ArrayExam01 {

	public static void main(String[] args) {
		// 1. 배열 선언, 생성 분리
		int arr[];// 배열 선언
		arr=new int[5]; //배열 생성(메모리 할당)
		
		//2. 배열 선언, 생성 함께
		int arr2[]=new int[5];
		arr2[0]=10; //배열은 0부터 시작
		arr2[1]=20;
		
		//3.배열선언, 생성, 초기화 함께
		int arr3[]= {1,2,3,4,5};
		
		//배열에 있는 내용 전체 출력 for (0~4)
		for(int i=0; i<arr3.length; i++) { //배열의 길이
			System.out.println("arr3["+i+"]"+arr3[i]);
		}// >> 인덱스값까지 알아야할 때 사용.
		
		//향상된 for문
		for(int n:arr3) {
			System.out.println(n+",");
		} // >> 안에 위치한 데이터만 뽑아낼 수 있다. 인덱스값을 알아야할 때 도움이 안됨.
		
		//배열 사용 방법
		//1. 배열에 사용될 데이터타입을 결정한다.
		//2. 배열의 크기를 결정한다. >> 크기를 변동시킬 수 없다. => ArrayIndexOfBoundsExcption 예외 발생 > 배열의 크기보다 초과
		//3. 배열 생성 방법 => 1, 2, 3 어떤것으로 할지(위의 방법)
		//4. 배열을 어떻게 초기화할 것인지 => 직접 인덱스에 접근할 것인지, for문, 생성과 함께 초기화할지
		//5. 해당하는 배열의 데이터를 어떻게 출력할 것인지 => for문, 향상된 for문, 직접 인덱스
		
		
		//퀴즈 > 키보드로부터 문자열을 입력받아 배열에 추가한 후 전체를 출력하자
		//"q"를 입력할때까지 입력받는다.
		//>입력: 홍길동
		//>입력: 박길동
		//>입력: q
		//>출력: 홍길동, 박길동
		
//		String now[];
//		now= new String[5];
		String now[]= new String[5];
		Scanner sc = new Scanner(System.in);
		int count=0;
		
//		System.out.print("문자열을 입력하시오: ");
		
//		String plus=sc.nextLine();		
//		for (int i = 0; i <6; i++) {
//			now[i]=plus;
//		}
		
		while(true) {
			System.out.println("입력>");
			String str = sc.nextLine();
			if(str.equals("q"))break;
			now[count++]=str;
		}
		
		for(int i=0;i<count;i++) {
			System.out.println(now[i]+",");
		}
		
		
		
		

	}

}
