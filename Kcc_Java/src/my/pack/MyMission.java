package my.pack;

import java.util.Scanner;

public class MyMission {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름: ");
//		String str = sc.nextLine();
//		
//		String name = str;
//		
//		System.out.println("내이름은 " + name + " 입니다.");
		int kor, eng, mat;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("당신의 이름이 무엇입니까? ");
		
//		String str = sc.nextLine();
//		String name = str;
		System.out.println("환영합니다. " + sc.nextLine() + "님");
		
		System.out.println("성적을 입력하십시오");
		Scanner os=new Scanner(System.in);
		System.out.print("국어: ");
		kor=os.nextInt();
		System.out.print("영어: ");
		eng=os.nextInt();
		System.out.print("수학: ");
		mat=os.nextInt();
		
		int all = kor+eng+mat;
		System.out.println("당신의 총점은 "+ all + " 입니다.");
		float aver = (float)(all/3.0); //안에 있는 데이터값이 기본이 double이다. 그렇기때문에 한번더 캐스트해줘야함
		// 캐스트는 안에있는 데이터값에 따라서 변한다. int면 int로 해줘야하는것
		System.out.println("당신의 평균은"+ aver + " 입니다.");
		
		
	}

}
