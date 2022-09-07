package Chapter04.EXmy;

import java.util.Scanner;

public class My06 {

	public static void main(String[] args) {
		//아메리카노를 주문할 경우 2,500원
		//카페라떼 || 카페라테 를 주문할 경우 3,500원
		//자바칩_프라푸치노, 아포카토 주문할 경우 가격이 5,500원
		//그 외에 메뉴를 출력할 경우 : 우리 매장에 없는 메뉴입니다
		
		//출력 : 주문하신 <카페라떼>는 가격이 <3,500>원 입니다.
		// 우리 매장에 없는 메뉴입니다
		// Switch 문으로 처리
				// 스캐너 사용
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("음료를 입력하시오");
		
		String b = sc.next();
		
		int a = 0;
		
		switch (b) {
		case "에스프레소":
		}
		
		sc.close();
		
		
	}

}
