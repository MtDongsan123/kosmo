package Chapter07.EX01;

import java.util.Arrays;

public class Using_Method06 {

	static int add (int[] a ) { 
		//들어온 배열의 모든 값을 더해서 더한 값을 리턴
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum += a[i];	//sum = sum + a[i]
		}
		return sum;
	}
	
	static int div (int[] a ) {
		//들어온 배열의 모든 값을  빼서 뺀 값을 리턴
		int div = 7;
		for(int i = 0; i < a.length; i++ ) {
			if (i == 0) {continue;} //i==0 일때는 아래 내용 실행하지 않고
			div -= a[i]; 	//div = div - a[i]
		}
		return div; 
	}
	
	static long mul (int[] a ) {
		//들어온 배열의 모든 값을 곱해서 곱한 값을 리턴
		long mul = 1; //곱할 때는 초기값을 0이아닌 1로 설정
		for(int i = 0; i < a.length; i++ ) {
			mul *= a[i]; //mul1 = mil * a[i]
		}
		return mul;
	}
	
	static double avg (int[] a ) {
		//들어온 배열의 모든 값에 평균 값을 리턴
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum += a[i]; 	//sum = sum + a[i]
		}
		double avg = sum / (double) a.length;
		return avg;
	}
	
	
	
	public static void main(String[] args) {
		// 1~100까지 7의 배수만 저장후 각 메서드 호출
		
//		int[] arr = new int[14];
//		int count = 0;
//		 int n;
//		    for (n = 1; n <= 100; n++)
//		    {
//		        if (n % 7 == 0)//6으로 나누어서 나머지가 없으면
//		        {
//		         arr[count]=n;
//		         count++;
//		        }
//		    }
//		    System.out.printf("\n");
//		
//		    System.out.println("1~100사이의 7의 배수 배열: " + Arrays.toString(arr));
//		    System.out.println("배열의 합: " + add(arr));
//		    System.out.println("배열의 차: "+ div(arr));
//		    System.out.println("배열의 곱: "+ mul(arr));
//		    System.out.println("배열의 평균: "+ avg(arr));
//		    
		    int[] arr1 = new int[100/7]; //배열의 방의 갯수 지정
		    
		    for(int i=0, j = 7; i<arr1.length; i++, j+=7) {
				arr1[i] = j; //arr[0] = 7	
			}
		    
		    //배열의 각 방의 내용을 출력
		    for (int i = 0; i < arr1.length; i++ ) {
		    	System.out.println(arr1[i]+" ");
		    }
		    System.out.println();
		    System.out.println("===============");
	
		    //메서드 호출 : add(arr1)
		    int sum = add(arr1);
		    System.out.println("더한값: "+ sum);
	
		    //메서드 호출
		    int div = div(arr1);	//변수명과 메서드 명은 같아도 사용법이 다르기 때문에 괜찮음.
		    System.out.println("뺀 값: "+ div);
		    
		    //메서드 호출 : mul (arr1)
		    long mul = mul(arr1);
		    System.out.println("곱한 값: "+ mul); 
		    	//int : 1760012288
		    	//long : 4513787149822699520 
		    
		    // 메서드 호출 : avg(arr1)
		    double avg = avg(arr1);
		    System.out.println("평균값: "+ avg);
		    //double : 52.5
		    
	}

}
