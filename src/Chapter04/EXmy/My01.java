package Chapter04.EXmy;

import java.util.Scanner;

public class My01 { 
	public static void main(String[] args) {
		// 스캐너로 나이 이름 몸무게 
		// 나이는 int고 이름은 String이고 몸무게는 double
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이, 이름, 몸무게를 입력하세요");
		int abc = sc.nextInt();
		String cde = sc.next();
		double efg = sc.nextDouble();
		
		
		
		System.out.println(abc);
		System.out.println(cde);
		System.out.println(efg);
		
		
		
	}

}
