package Chapter05.EX01;

import java.util.Arrays;

public class Using_Array05 {

	public static void main(String[] args) {
		// 1 ~ 500 까지 3의 배수를 배열에 저장
		// 출력 : 1.직접 출력, 2.for문을 써서 출력, 3.Enhanced For, 4. toString()
		// 합계 :		평균 :
		
		// 배열선언 (3의배수의갯수:166개) 
	/*	int[] aar = new int[500];
		
		//1.배열의 3의 배수 저장
		int[] num = new int [166];
		    int n;
		    int count=0;
		    int sum=0;
		    for (n = 1; n <= 500; n++)
		    {
		        if (n % 3 == 0)
		        { 
		        num[count]=n;
		        sum+=n; //sum = sum+n
		        count++;
		          System.out.printf("%d", n);
		          System.out.println();
		        }
		    }
		    System.out.printf("%d", count);
		    System.out.println("===========");
			
			//출력 
			for(int i = 0; i<count; i++) {
				System.out.println(num[i]);
			}
			System.out.println("===향상된 for문을 사용해서 출력");
			for(int k : num) {
				System.out.println(k);
			}
			
			System.out.println("===Arrays.toString()를 사용");
			System.out.println(Arrays.toString(num));
			System.out.println("합계 : " + sum);
			System.out.println("평균은 :" + sum /(double) count);
			
			
			 */
			 int[] arr = new int[166];
			 
			 int count = 0;
			 for(int i = 0, j = 3; i < arr.length; i++, j+=3){
			 if(j <= 500){
			 arr[i] = j;
			 count++;
			   }
			 }
			 
			  System.out.println("==1. 직접출력==");
			  System.out.println(arr[0]);
			  
			  System.out.println("==2. for 출력=="); 
			  for (int i = 0; i < arr.length; i++) {
			  System.out.println(arr[i]);
			  }
			   System.out.println("총 3의 배수 갯수 :" + count);
			   
			   System.out.println(" ==3. Enhanced for 출력 ==");
			   for (int k : arr){
			   System.out.println(k); 
			   } 
			   
			   System.out.println("==4. Arrays.toString() 출력==");
			   System.out.println(Arrays.toString(arr)); 
				// 합계 구하기
				  int sum = 0;
				for (int i = 0; i < arr.length; i++) {
				 sum += arr[i]; 
				 }
				System.out.println("합계 : " + sum);
				System.out.println("평균 :" + sum / (double) count); 
			  
			
		}

	}

