package Chapter10.EX05;

// 메서드 오버로딩 ( Method Overloading) :
//	- 동일한 메서드 이름에 대해서 시그니쳐가 다를 경우 다른 메서드로 식별 하는 경우.
//	- 시그니쳐 : 메서드의 입력매개변수의 갯수, 타입
//					리턴 타입은 시그니쳐에 포함되지 않습니다.
//	- 생성자, 메서드 
// 메서드 오버라이딩 (Method Overriding) : 상속관계일때만 사용가능
//	- 부모의 메서드를 자식클래스에서 새롭게 정의해서 사용하는 것
//	- 자식 클래스에서 부모 클래스의 메서드를 오버라이딩 하기 위한 조건
//		: 1. 리턴 타입이 같아야 한다. 2. 메서드 이름이 같아야 한다. 3. 시그니쳐가 같아야 한다.
//		: 4. 접근 제어자는 부모 클래스의 접근 제어자와 같거나 넓어야 한다.
//	-부모의 메서드는 삭제되지 않고, 덮어씌워져 있다.
//	@Override : @ <==어노테이션, 자식클래스에서 메서드 오버라이딩을 할때 오류를 방지하는 기능>


class A{
	void print() {
		System.out.println("A클래스 출력");
	}
}
class B extends A{	
	
	@Override		//메서드 오버라이딩 오류를 방지하는 설정
	void print() {	//메서드 오버라이딩 : 
		System.out.println("B 클래스 출력");
		
	}
}


public class Using_Method_Overriding {

	public static void main(String[] args) {
		// 1. A 객체 생성을 A 타입으로 지정
		A aa1 = new A();
		aa1.print();	//A 클래스 출력
		
		//2. B 객체 생성을 B 타입으로 지정
		B bb1 = new B();
		bb1.print();	// B 클래스 출력
		
		// 3. B 객체를 A 타입으로 지정해서 출력 
		A aa2 = new B();
		aa2.print(); 	// B클래스 출력 (오버라이딩된 메서드가 출력됨)
		

	}

}
