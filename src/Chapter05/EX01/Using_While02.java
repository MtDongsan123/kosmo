package Chapter05.EX01;

import java.util.Scanner;

public class Using_While02 {

	public static void main(String[] args) {
		// "그만" 할 때까지 정수값을 넣어서 합계 평균을 출력
			// 힌트 : 문자열을 정수로 변환
		//1. String s = sc.nextLine(); 인풋 받는다.
		//2. s.splite(" "); <== 공백을 기준으로 잘라서 배열에 저장
		//3. 문자형 String을 정수형으로 변환 , Inter.PerseInt()
		//4. 합계와 평균을 구하면 된다
		
		Scanner sc = new Scanner(System.in);

		
		String s;
		do {
			
			int b; 
			int sum = 0; 
			int count = 0;
			System.out.println("정수 값을 공백을 기준으로 입력하세요. '그만'으로 종료를 알리세요.>>>");
					s = sc.nextLine();
					
					
					if(s.equals("그만")) {
						System.out.println("프로그램을 종료합니다");
						break;
					}
					String [] arr; 
					
					arr = s.split(" "); 
	
					
					for(int i = 0; i < arr.length; i++) {
					  
							b= Integer.parseInt(arr[i]); //
							sum += b;
							count++;
						
					}
			System.out.println("정수의 갯수: "+ count);
			System.out.println("합 : "+ sum);
			System.out.println("평균 : "+ sum/ (double) count);

			
		}while (true);
		
		sc.close(); 
		
		
		
		
		
		
	}

}
