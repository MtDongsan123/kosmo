package Chapter04.EX03;

import java.util.Scanner;

public class Using_Switch03 {

	public static void main(String[] args) {
		/*1. 문제
		 	스캐너로 "Gold"를 넣으면 "금메달 입니다"를 출력
		 	스캐너로 "Silver"를 넣으면 "은메달 입니다"를 출력
		 	스캐너로 "Bronze"를 넣으면 "동메달 입니다"를 출력
		 	그외는 "매달이 없습니다"
		
		 2.문제
		 	스캐너로 월욜 인풋받아서 해당월의 총 날짜를
		 	 "<월>은 <몇>일까지 있습니다."
		 
		 		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("보기 중 당신이 획득한 메달을 쓰시오");
		System.out.println("Gold Silver Bronze");
		
		String Winner = sc.next();
		switch (Winner) {
		case "Gold" : case "gold" :
			System.out.println("금메달입니다");
			break;
		case "Silver" : case "silver" :
			System.out.println("은메달입니다");
			break;
		case "Bronze" : case "bronze" :
			System.out.println("동메달입니다");
			break;
		default :
			System.out.println("메달이 없습니다");
		}
		
		sc.close();
		

	}

}
