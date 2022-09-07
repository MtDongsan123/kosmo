package Chapter05.EX01;


import java.util.Arrays;
import java.util.Scanner;

public class Using_Array08 {

	public static void main(String[] args) {
		
			// 스캐너로 인풋받아 임의의 정수 10개 등록후
			// 정수 배열 방 10개를 생성하고
			// 임의의 값을 10개에 방에 저장
			// 그 중 최대값을 뽑아서 출력 하는 프로그램을 생성해 보세요.
			// 출력 : 배열방 10개에서 최대값은 : 000
		
		Scanner sc = new Scanner(System.in);
		
		
		int[] arr = new int[10];
		System.out.println("10개의 랜덤한 정수를 입력하세요");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println((i+1)+"번째 수:");
			arr[i] = sc.nextInt();
		}
		System.out.println("arr=" + Arrays.toString(arr));
		Arrays.sort(arr);
		int max = arr[arr.length-1];
		int min = arr[0];
		
		System.out.println("최대값:"+ max);
		System.out.println("최소값: "+ min);
		 
		
		
		
		//int[] arr = new[10];
		//	int max = 0;
		// int min = 0;
		// System.out.println("임의의 정수값 10개를 입력해 주세요>>");
		// for(int i =0; i<10 : i++){
		// arr[i] = sc.nextInt();
		// }
		//
		//for (int i = 0; i < 10; i++) [
		// if(arr[i]>max) {
		// max = arr[i];
		// }
		// System.out.println("최대값:"+ max);
		//for (int i = 0; i < 10; i++) [
				// if(arr[i]<min) {
				// min = arr[i];
				// }
				// System.out.println("최소값:"+ min);
		
		System.out.println("==2번째 방법은 Arrays.sort()메소드를 사용해서 출력==");
		Arrays.sort(arr); //배열 방의 값은 정렬을 한다. 0 (최소값), 1, 2, 3...arr.lenght -1
		System.out.println("최대값 :" + arr[arr.length-1]);	//최대값
		System.out.println("최소값 :" + arr[0]);	//최소값
		
		System.out.println("=== String을 사용하는 경우===");
		System.out.println("최대값 : "+ Arrays.stream(arr).max().getAsInt());
		System.out.println("최소값 :" + Arrays.stream(arr).min().getAsInt());
		
		
		sc.close();
		
		
		
		
		
		
		
	}

	}
