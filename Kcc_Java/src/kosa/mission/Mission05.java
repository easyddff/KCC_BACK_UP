package kosa.mission;

import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {
		// 메뉴를 선택해서 해당 메뉴를 명령문으로 실행해 보자.
		// 1.추가 2.출력 3.검색 4.종료
//		String add, call, sear, end;
//		String all="1.a\n2.b\n3.c";
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println(all);
//		System.out.println("메뉴를 추가하시겠습니까?");
//		add=sc.nextLine();

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.추가 2.출력 3.검색 4.종료");
			System.out.println("메뉴: ");
			String menu = sc.nextLine();
			
			switch(menu) {
			case "1":
				System.out.println("추가선택");
				break;
			case "2":
				System.out.println("출력선택");
				break;
			case "3":
				System.out.println("검색선택");
				break;
			case "4":
				System.out.println("프로그램종료");
				return;
			}
			
		}	
		
		
		
	}

}
