package Chapter04.EXmy;

import java.util.Scanner;

public class My04 {

	public static void main(String[] args) {
		
		//아메리카노를 주문할 경우 2,500원
		//카페라떼 || 카페라테 를 주문할 경우 3,500원
		//자바칩_프라푸치노, 아포카토 주문할 경우 가격이 5,500원
		//그 외에 메뉴를 출력할 경우 : 우리 매장에 없는 메뉴입니다
		
		//출력 : 주문하신 <카페라떼>는 가격이 <3,500>원 입니다.
		// 우리 매장에 없는 메뉴입니다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문할 커피를 입력해주세요");
		
		String od = sc.next();
		
		int price = 0;
		
		if (od.equals("아메리카노")) {
			price = 2500;
		}else if (od.equals("카페라테") || od.equals("카페라떼") ) {
			price = 3500;
		}else if (od.equals("자바칩_프라푸치노") || od.equals("아포카토")) {
			price = 5500;
		}else {
			System.out.println("우리 매장에 없는 메뉴입니다.");
		}
		System.out.printf("주문하신 %s는 가격이 %d원 입니다.", od, price);
		
		sc.close();

	}

}
