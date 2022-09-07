package Chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if {

	public static void main(String[] args) {
		// 문제 : Scanner로 정수값을 인풋 받아서 
		//국어(aa), 영어(bb), 수학(cc), 과학(dd), 음악(ee) 점수를 인풋 받습니다.
		// if문을 사용해서 평균이 90점이상이면 "A학점", 80점 이상 : "B학점"
		// 70점이면 "C학점", 60점 이상이면 "D학점" , 나머지 : "F학점"
		
		//<완료시간 : 15시50분까지.

		Scanner sc = new Scanner (System.in);
		
		int aa, bb, cc, dd, ee ;
		
		System.out.println("국어, 영어, 수학, 과학, 음악 (점수를 입력하세요>>>");
		
		aa = sc.nextInt();
		bb = sc.nextInt();
		cc = sc.nextInt();
		dd = sc.nextInt();
		ee = sc.nextInt();


		double avg = (aa+bb+cc+dd+ee)/5.0;
		
		if (avg >= 90.0) { 						 
			System.out.println("A 학점" + avg);
		}else if ( avg >= 80) {				  
			System.out.println("B 학점" + avg);
		}else if ( avg > 70 ) {
			System.out.println("C 학점" + avg );
		}else if ( avg > 60 ) {
			System.out.println("D 학점" + avg);
		}else {
			System.out.println("F 학점" + avg);
		}
		 
		sc.close();
		
	}

}
