package Chapter03.EX03;

public class ShiftOperator {

	public static void main(String[] args) {
		//산술 시프트 ( << , >>)
		// -부호비트 고정되어 있다
		//  - 대량의 계산을 빠르게 처리 할 수 있다 

		// << 각 비트를 외쪽으로 이동
		System.out.println(3<<1); // 3*2^1=6 3을 왼쪽으로 1비트 이동해라
		System.out.println(3<<2); //3*2^2=10 3을 왼쪽으로 1비트 이동해라
		System.out.println(3<<3); // 3* 2^3 = 24 3을 왼쪽으로 1비트 이동해라
		
		
		System.out.println(-3 << 1);
		
		// >> 각 비트를 오른쪽으로 이동

		System.out.println(5 >> 1); //2
		System.out.println(5 >> 2);
		
		//논리 시프트 ( >>> )
		System.out.println(3 >>>1);
		
		
		
	}

}
