package Chapter09.EX04;

class Student{
	
	static int serialNum = 1000; //모든 객체에서 공유하는 필드, 객체를 생성할때 마다 1씩 중가
	int studentID;		//학생 공유 ID
	String studentName;	//학생 이름
	int grade = 4;			//학년	: 기본 값으로 4학년
	String address = "서울";		//주소	: "서울"
	
	
	Student(){
	
		this.studentID = serialNum;
		serialNum++;	//객체를 생성시 1씩 증가
		grade = 4;
		address = "서울";
		
	}
	
	Student(String studentname){
		this();
		this.studentName = studentname;
	}
	
	
	
}

public class Student_Test {

	public static void main(String[] args) {

		//객체를 생성시 자동으로 학번이 1000번부터 1씩 자동으로 학번이 저장되어야 한다.
		// studentID : 1000 부터 학생객체를 생성할 때 마다 고유한 값으로 적용 되어 있어야 한다.
		
		Student lee = new Student("이지원"); //1001
		
		Student hong = new Student("홍지원"); //1002
		
		Student jung = new Student("정지원"); //1003
		
		Student park = new Student("박지원"); //1001

		System.out.println("학번 : " + lee.studentID + ", 이름 :" + lee.studentName + ", 학년 : "+ lee.grade + ", 주소 : " + lee.address);
		
		System.out.println("학번 : " + hong.studentID + ", 이름 :" + hong.studentName + ", 학년 : "+ hong.grade + ", 주소 : " + lee.address);
		
		System.out.println("학번 : " + jung.studentID + ", 이름 :" + jung.studentName + ", 학년 : "+ jung.grade + ", 주소 : " + jung.address);
		
		System.out.println("학번 : " + park.studentID + ", 이름 :" + park.studentName + ", 학년 : "+ park.grade + ", 주소 : " + park.address);
		
		
	}

}
