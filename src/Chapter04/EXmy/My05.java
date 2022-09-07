package Chapter04.EXmy;

public class My05 {

	public static void main(String[] args) {
		// 10점 이상인 경우 pass, 그렇지 않은 경우 fail
	int	a = 5;
	switch (a) {
	case 10 : case 11 : case 12 :
		System.out.println("pass");
		break;
	default : 
		System.out.println("fail");
	}
	

	}

}
