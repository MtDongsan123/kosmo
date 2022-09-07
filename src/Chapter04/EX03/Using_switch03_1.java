package Chapter04.EX03;

import java.util.Scanner;

public class Using_switch03_1 {

	public static void main(String[] args) {
		/*
		  2.문제
		 	스캐너로 월욜 인풋받아서 해당월의 총 날짜를
		 	 "<월>은 <몇>일까지 있습니다."
		 */
		
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하든가");
		
		String a = sc.next();
		
		switch (a) {
		case "1월" : case "3월" : case "5월" : case "7월" : case "8월" : case "10월": case "12월" :
			System.out.println("총 31일이 있다");
			break;
		case "4월" : case "6월" : case "9월" : case "11월" :
			System.out.println("총 30일이 있다");
			break;
		case "2월" :
			System.out.println("총 28일이 있다");
			break;
		default : 
			System.out.println("존재하지 않는 달이다");
			
		}
				sc.close(); */

			Scanner sc = new Scanner(System.in);
			System.out.println("달을 입력해 주세여 >>>");
 
			int month = sc.nextInt();
 
			int day = 0;

			switch (month) {case 1 : case 3 : case 5 : case 7 : case 8 : case 10: case 12 :
			day = 31;
			break;
			case 4 : case 6 : case 9 : case 11 :
			day = 30;
			break;
			case 2 :
			day = 28;
			break;
			default :
			System.out.println("존재하지 않는 달입니다. ");
			}
			System.out.printf("%d월은 %d일까지 존재 합니다." , month, day);

sc.close();
	}

}
