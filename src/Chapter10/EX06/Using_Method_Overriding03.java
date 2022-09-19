package Chapter10.EX06;

class Animal{
	//자식 클래스에서 2개의 메서드를 오버 라이딩
	// Animal 타입으로 정의, 배열의 저장후, 오버라이딩된 메서드 출력 (for, Enhanced For)
	
	void run() {
		System.out.println("모든 동물은 달립니다. ");
	}
	void eat() {
		System.out.println("모든 동물은 먹습니다. ");
	}
}
class Tiger extends Animal{
	@Override
	void run() {
	System.out.println("호랑이는 달립니다");
}
	void eat() {
		System.out.println("호랑이는 고기를 먹습니다. ");
	}
	
}
class Eagle extends Animal{
	@Override
	void run() {
		System.out.println("독수리는 하늘을 납니다. ");
		
	}
	void eat() {
		System.out.println("독수리는 고기를 먹습니다. ");
	}
	
}
class Fish extends Animal{
	@Override
	void run() {
		System.out.println("물고기는 헤엄칩니다");
		
	}
	void eat() {
		System.out.println("물고기는 해초를 먹습니다. ");
	}
}
class Dog extends Animal{
	@Override
	void run() {
		System.out.println("멍멍이는 달립니다");
		
	}
	void eat() {
		System.out.println("멍멍이는 사료를 먹습니다. ");
	}
}
public class Using_Method_Overriding03 {

	public static void main(String[] args) {
		
		Animal aa = new Animal();
		Tiger bb = new Tiger();
		Eagle cc = new Eagle();
		Fish dd = new Fish();
		Dog ee = new Dog();
		
		aa.run();
		aa.eat();
		bb.run();
		bb.eat();
		cc.run();
		cc.eat();
		dd.run();
		dd.eat();
		
		System.out.println("==============");

		//2. Animal 타입으로 선언 + 자식 클래스로 객체 생성 
			// 자식의 객체를 생성할 때 부모 타입으로 정의후 부모의 메서드를 호출시 오버라이딩된 메서드 출력
				//오버라이딩을 사용해서 하나의 타입으로 정의, 배열이나 컬렉션에 저장해서 관리를 쉽게 할 수 있다.
		
		Animal aa1 = new Animal();
		Animal bb1 = new Tiger();
		Animal cc1 = new Eagle();
		Animal dd1 = new Fish();
		Animal ee1 = new Dog();
		
		aa1.run();
		aa1.eat();
		bb1.run();
		bb1.eat();
		cc1.run();
		cc1.eat();
		dd1.run();
		dd1.eat();
		//Animal 타입으로 선언이 되어 있으므로 배열이나 컬렉션에 넣어서 아주 쉽게 관리	
		//	배열의 특징 : 1. 동일한 타입을 저장, 2. 방의 크기가 선언되면 바꿀 수 없다.
		
		int[] arr1 = new int[6];	//배열의 방크기 지정후 값을 할당.
		int[] arr2 = new int[] {1,2,3,4,6};	// 배열 선언과 동시에 값을 할당.
		//타입[] 배열변수 = 
		
		//객체를 배열에 저장 : Animal 객체를 배열에 저장
		System.out.println("== 객체를 배열에 저장후 출력 ==");
		Animal[] arr3 = new Animal[] {aa1, bb1, cc1, dd1, ee1};
		
		//for문을 사용해서 출력
		System.out.println("== For 문으로 출력 ==");
		for(int i = 0 ; i < arr3.length; i++) {
			arr3[i].run(); arr3[i].eat();	
		}
		
		//향상된 for문을 사용해서 출력
		System.out.println("== 향상된 For 문 == ");
		for (Animal k : arr3) {
			k.run(); k.eat(); //오버라이딩된 메서드가 출력
		}
	
	}

}
