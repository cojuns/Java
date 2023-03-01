import java.util.*;  // Scanner클래스를 사용하기 위해 추가

class Ex3_15 {
	public static void main(String args[]) { 
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';

		System.out.printf("문자를 하나 입력하세요.>");

		String input = scanner.nextLine();
		ch = input.charAt(0);

		if('0' <= ch && ch <= '9') {
			// 0~9 모두 true 일때 숫자입니다. 출력
			System.out.printf("입력하신 문자는 숫자입니다.%n");
		}

		if(('a' <= ch && ch <= 'z') || ('A'<= ch && ch <= 'Z')) {
			// a~z ||  A~Z 하나라도 true면 true 영문입니다 출력
			System.out.printf("입력하신 문자는 영문자입니다.%n");
		}
	} // main
}

// 입력칸에 1(숫자)a(문자) 입력시 먼저 입력된 숫자 1를 참고해서 숫자입니다. 출력이 됨
// 반대로 a(문자)1(숫자) 입력시 영문자입니다. 출력