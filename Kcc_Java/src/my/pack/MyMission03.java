package my.pack;

import java.util.Scanner;

public class MyMission03 {

	public static void main(String[] args) {
//		String name, address;
//		int number;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("이름: ");
//		name = sc.nextLine();
//		System.out.print("주소: ");
//		System.out.print("전화번호: ");
//		number = sc.nextInt();
//		
//		System.out.println(name+"님의 \n주소는 "+address+"이며 \n전화번호는 "+number+"입니다.");
		
		Scanner sc = new Scanner(System.in);
		String name, address;
		int num;
		
		System.out.print("이름: ");
		name=sc.nextLine();
		System.out.print("주소: ");
		address=sc.nextLine();
		System.out.print("번호: ");
		num=sc.nextInt();
		
		System.out.println("이름은 "+name+"이며\n"+"주소는 "+address+"이고\n"+"번호는 "+num+"이다.");
		
		

	}

}
