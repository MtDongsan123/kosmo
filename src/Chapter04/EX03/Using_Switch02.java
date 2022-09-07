package Chapter04.EX03;

import java.util.Scanner;

public class Using_Switch02 {

	public static void main(String[] args) {
		// Switch 문으로 처리
		// 스캐너 사용
		// 에스프레소, 카페라떼, 아포카토 주문할 경우 가격이 3,500원
		//아메리카노 를 주문할 경우 2,500원
		//그 외에 메뉴를 출력할 경우 : 우리 매장에 없는 메뉴입니다
		
		//출력 : 주문하신 <에스프레소>는 가격이 <3,500>원 입니다.
		// 우리 매장에 없는 메뉴입니다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문할 커피를 입력해주세요");
		
		String Order = sc.next();
		
		int price = 0;
		
		switch (Order) {
		case "에스프레소" : case "카페라떼" : case "아포카토" :
			price = 3500;
			break;
		case "아메리카노" :
			price = 2500;
			break;
		default :
			System.out.println("우리 매장에 없는 메뉴입니다.");
		}
		System.out.printf("주문하신 커피는 %s 이고, %d원 입니다." , Order,price );
		
		sc.close();
	

	}

}
