package Chapter04.EXmy;

import java.util.Scanner;

public class My03 {

	public static void main(String[] args) {
		/*
		 스케너로 나이를 인풋받아서 출력 : 
		 
		 나이가(age) 8세 미만이면 : "취학 전 아동입니다"
		 					"입장료는 <1000>원 입니다.
		 나이가 14세 미만이면 : "초등학생입니다."
		 					입장료는 <2000>원 입니다.
		 나이가 17세 미만이면 : "중학생입니다."
		 					입장료는 <2500>원 입니다.
		 나이가 20세 미만이면 : "고등학생 입니다."
		 					입장료는 <3000>원 입니다.
		 나이가 20세 이상이면 : "성인 입니다."
		 					입장료는 <4000>원 입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요.");
		
		int age = sc.nextInt();
		int price = 0;
		
		if (age < 8) {
			price = 1000;
			System.out.println("취학 전 아동입니다");
		} else if (age < 14) {
			price = 2000;
			System.out.println("초등학생입니다");
		}else if (age < 17) {
			price = 2500;
			System.out.println("중학생입니다");
		}else if (age < 20) {
			price = 3000;
			System.out.println("고등학생입니다");
		}else if (age >= 20) {
			price = 4000;
			System.out.println("성인입니다");
		}
		
		System.out.printf("입장료는 %d원입니다", price);
		
		sc.close();
	}

}
