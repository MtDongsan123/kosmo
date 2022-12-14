package Chapter05.EX04;

public class Using_String01 {

	public static void main(String[] args) {

		/*
			String : 참조 데이터 타입, 문자열 처리, 아주 기능들이 많이 들어가 있다.
		*/
		
		// 1. 객체 생성을 사용 해서 값 할당. 객체 주소 별개 작동
		String str1 = new String("안녕");
							// new Heap 메모리에 값 할당
							// String() : 생성자의 매개 변수에 "안녕" 문자열 할당.
		System.out.println(str1);
		
		String str11 = new String ("안녕");
		System.out.println(str1 == str11);		// str1과 str2의 객체 주소 비교
					// false : 두 객체의 번지 수가 다르다.
		System.out.println(str1.equals(str11));	// str1과  str2의 객체의 값 비교
					// true : 객체의 저장 된 저장 값 비교
		System.out.println("==================================================================");
		
		// 2. 리터럴로 값 할당 ( 객체의 번지주소) 공유
			// 리터럴 : 변수에 들어가는 값을 통칭해서 리터럴 이라고 부름.
		String str2 = "안녕하세요";
		System.out.println(str2);
		
		String str22 = "안녕하세요";
		System.out.println(str2 == str22);		// str2와 str22는 동일한 번지 가리킴.
		System.out.println(str2.equals(str22)); //  객체의 값 비교
		
		
	}

}