package Chapter10.EX07;

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
	
	int count;	//호랑이 수
	//생성자 : 정수를 인풋 받아서 count 필드에 값을 할당.
	 Tiger(int count) {
		this.count = count;
	}

	void count() {
		System.out.println("호랑이의 수 : ");
	}
	
	@Override
	void run() {
	System.out.println("호랑이는 달립니다");
}
	void eat() {
		System.out.println("호랑이는 고기를 먹습니다. ");
	}
	
	
}
class Eagle extends Animal{
	
	int count;	//독수리 수
	 Eagle(int count) {
		this.count = count;
	}

	void count() {
		System.out.println("독수리의 수 : ");
	}
	
	@Override
	void run() {
		System.out.println("독수리는 하늘을 납니다. ");
		
	}
	void eat() {
		System.out.println("독수리는 고기를 먹습니다. ");
	}
	
}
class Fish extends Animal{
	
	int count;	//물고기 수
	 Fish(int count) {
		this.count = count;
	}

	void count() {
		System.out.println("물고기의 수 : ");
	}
	
	@Override
	void run() {
		System.out.println("물고기는 헤엄칩니다");
		
	}
	void eat() {
		System.out.println("물고기는 해초를 먹습니다. ");
	}
	
}
class Dog extends Animal{
	
	int count;	//멍멍이 수
	
	 Dog(int count) {
		this.count = count;
	}
	@Override
	void run() {
		System.out.println("멍멍이는 달립니다");
		
	}
	void eat() {
		System.out.println("멍멍이는 사료를 먹습니다. ");
	}
	
	
}

public class Using_Method_Overriding04 {

	public static void main(String[] args) {
		//1. 객체 생성
			//생성자를 통해서 각각의 필드에 값을 할당.
		
		Animal aa1 = new Animal();
		Animal bb1 = new Tiger(10);
		Animal cc1 = new Eagle(5);
		Animal dd1 = new Fish(50);
		Animal ee1 = new Dog(70);

		//객체를 배열에 저장
		
		System.out.println("== 객체를 배열에 저장후 출력 ==");
		Animal[] arr3 = new Animal[] {aa1, bb1, cc1, dd1, ee1};
		
		//For문을 사용해서 출력 : eat(), run() , 동물의 총 마리수 : 00
			//1. For문을 사용해서 객체를 Animal 객체로 뽑아서
			//2. 다운캐스팅 해서 자식 필드의 count 읽어서 총 더한 값을 출력	
		
		// 동물의 총 합을 구하는 변수 선언
		int sum = 0;
		
		for (int i = 0; i < arr3.length;i++) {
			
			//배열에 각 방에 저장된 객체를 Animal 객체에 저장
			Animal aa = arr3[i];
			aa.eat();		//Animal의 eat() 메서드 : 오버라이딩된 메서드 출력
			aa.run();		//Animal의 run() 메서드 : 오버라이딩된 메서드 출력
			
			if(aa instanceof Tiger) {
				Tiger t1 = (Tiger) aa;
				sum += t1.count;		//sum = sum + t1.count
			}
			if(aa instanceof Eagle) {
				Eagle t1 = (Eagle) aa;
				sum += t1.count;		//sum = sum + t1.count
			}
			if(aa instanceof Fish) {
				Fish t1 = (Fish) aa;
				sum += t1.count;		//sum = sum + t1.count
			}
			if(aa instanceof Dog) {
				Dog t1 = (Dog) aa;
				sum += t1.count;		//sum = sum + t1.count
			}
		}
		System.out.println("총 동물의 수는 : " + sum);
		
//		System.out.println("== 향상된 For 문 == ");
//		for (Animal k : arr3) {
//			k.run(); k.eat(); //오버라이딩된 메서드가 출력
//		}
//		
//		if (arr3 instanceof count) {
//			i arr3 = (i) arr3;
//			System.out.println(arr3.i);
//			System.out.println(arr3.i);
//			System.out.println(arr3.i);
//			
//			arr3.i();
//			arr3.i();
//			arr3.c();
//			
//		}
	}

}
