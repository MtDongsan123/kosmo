package Chapter07.EX01;

public class Using_Method07 {

	static void print() {
		System.out.println("입력된 데이터가 없습니다. -매개변수 없음");
	}
	
	static void print(int a) {
		System.out.println(a+" 값이 입력되었습니다. -매개변수 : 정수1");
	}
	//위에 메서드와 시그니쳐가 같다 : 메서드명, 매개변수 타입, 매개변수 갯수
//	static int print (int c) {
//		//매개변수의 타입과 갯수가 같아서 오류 발생 : 시그니쳐가 같다 : 매서드명, 매개변수의 타입,갯수
//	}
	static void print (double a) {
		System.out.println(a+" : 값이 입력 되었습니다. -매개변수 : 실수1 ");
	}
	static void print (double a, double b) {
		System.out.println(a+","+b+"값이 입력 되었습니다. -매개변수 : 실수1 실수1");
	}
	static void print(int a, int b) {
		System.out.println(a+","+b+": 값이 입력 되었습니다.  -매개변수 : 정수1 정수1");
	}
	static void print(int a, double b) {
		System.out.println(a+","+b+": 값이 입력 되었습니다. -매개변수 : 정수1 실수1 ");
	}
	//위의 메서드와 시그니쳐가 동일 함 : 메서드명,입력매개변수 타입, 갯수
//	static int print (int c, double d) {
//		System.out.println("시그니쳐가 중복됨 ");
//	}
//	
	public static void main(String[] args) {
		// 메서드 오버로딩 (Method Overloading) : 
		// 		: 동일한 메서드 이름에 대해서 시그니쳐가 다른 경우 다른 메서드로 인식 한다.
		//			시그니쳐(식별자) : 메서드명, 입력매개변수 타입, 입력매개변수 갯수
		//				*리턴 타입은 시그니쳐가 아니다.
		// 메서드 오버라이딩 (Method Overriding) : 상속
		//		: 부모 클래스에서 정의된 매서드를 자식 클래스에서 재정의 해서 사용하는 것.
		
		//매개변수 없는 메서드 호출 : print()
		print();
		System.out.println("========================");
		//매개변수 : print(정수);
		print(10);
		System.out.println("============================");
		//매개변수: print(실수);
		print(20.0);
		System.out.println("===========================");
		//매개변수 : print(정수, 정수);
		print(30,40);
		System.out.println("==============================");
		//매개변수 : print(실수, 실수)
		print(10.1,20.1);
		System.out.println("=================================");
		print(10,20.0);
		
		
		
		
	}

}
