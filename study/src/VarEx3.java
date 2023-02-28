////		true, false만 가능 ( 다른 값 넣을시 mismatch에러 )
//		
//		byte b = 127;
////		-128~127 값 까지만 가능 ( 그 이상 값 넣을시 mismatch에러 )
//		
//		int oct = 010; // 8진수, 10진수로 8
//		int hex = 0x10; // 16진수, 10진수로 16
////		System.out.println(oct);
////		System.out.println(hex);
//		// println은 10진수로만 출력 접두사 접미사 출력 x
//		
//		long l = 100_000_000; // 인티저 최대치 20억이 안되기 때문에 값 입력 가능
//		long lo = 10_000_000_000L; // 인티저 최대치가 20억이 넘기 때문에 뒤에 접미사 L 
//		
//		float f = 3.14f; // f는 생략 불가
//		double d = 3.14d; // d는 생략 가능 ( f도 가능 d가 더 큰 그릇이기 때문에 )
//		
//		// 모두 실수
////		System.out.println(10.); // -> 10.0
////		System.out.println(.10); // -> 0.1
////		System.out.println(10f); // -> 10.0 (접미사 f 생략되서 출력 )
////		System.out.println(1e3); // -> 1000.0
//		
//		char ch = 'A'; // -> A
//		int i = 'A'; // -> 65
//		
//		String str = ""; // -> 빈 문자열(empty string)
//		char ch2 = ' '; // ''안에 반드시 하나의 문자가 필요 ( 공백 문자blank)로 변수 ch2를 초기화
//		
//		String str2 = "ABCD";
//		String str3 = "123";
//		String str4 = str2 + str3; // -> ABCD123
//		
////		System.out.println(""+7+7);// -> 77
////		System.out.println(7+7+"");// -> 14
//		//덧셈 연산자는 왼쪽에서 오른쪽 방향으로 연산을 수행하기 때문에 결합순서에 따라 결과 값이 달라짐
//		
//		// x와 y에 저장된 값 바꾸기
//		int x = 4, y = 2;
//		int tmp;
//		// 값을 임시로 저장할 tmp 변수 하나 더 선언
//		tmp = x; // 1. x의 값을 tmp에 저장
//		x = y;   // 2. y의 값을 x에 저장
//		y = tmp; // 3. tmp의 값을 y에 저장
//		
////		System.out.println("x="+x);
////		System.out.println("y="+y); 
		
//		System.out.printf("%d%n", 15); // ->15 (%d10진수) (%n개행)
//		System.out.printf("%#o%n", 15);// ->017 (# 접두사  0)(%o8진수) (%n개행)
//		System.out.printf("%#x%n", 15);// ->0xf (# 접두사 0x )(%x16진수) (%n개행)
//		System.out.printf("%s", Integer.toBinaryString(15));// -> 1111 ( 2진수 지시자는 없기 때문에 메서드 사용 2진 문자열로 바꿔줌 )
//		
//		float f = 123.456789f;
//		System.out.printf("%f%n", f); // ->123.456787 float는 정밀도가 7자리라 123.4567까지 정확 나머지는 의미 x 
//		double d = 123.456789d;
//		System.out.printf("%f%n", d); // ->123.456789 double는 정밀도가 15자리라 123.456789까지 정확하게 출력
//		System.out.printf("%e%n", d); // ->1.234568e+02 지수형식 (e+02=10 2제곱)6다음 8인 이유는 반올림 
//		System.out.printf("%g%n", d); // ->123.457 간략한 형식 소수점 포함 7자리로 출력 이것도 반올림
		
//		System.out.printf("[%5d]%n", 10);// -> [   10] 5개 공간 지정 기본 오른쪽 정렬 나머지는 빈 공간으로 채움
//		System.out.printf("[%-5d]%n", 10);// -> [10   ] 왼쪽 정렬
//		System.out.printf("[%05d]%n", 10);// -> [00010] 공백 대신에 0으로 채움
//		System.out.printf("[%05d]%n", 1234567);// -> [1234567] 5개 공간 지정했지만 넘어도 출력 됨
//		
//		double d = 1.23456789;
//		System.out.printf("%f%n", d);// -> 1.234568 마지막 8은 반올림 됨
//		System.out.printf("%14.10f", d);// ->  1.2345678900 -> 소수점 포함 14자리 공간 지정 소수점 아래 10자리 출력
//		System.out.printf("%14.6f", d);// -> 1.234568 소수점 아래 6자리 출력
//		
//		System.out.printf("[%s]%n", "www.google.com");// -> [www.google.com] 문자열 출력 지시자 %s
//		System.out.printf("[%20s]%n", "www.google.com");// -> [      www.google.com] 공간을 20자리 확보 후 오른쪽 정렬( 기본 값 )
//		System.out.printf("[%-20s]%n", "www.google.com");// -> [www.google.com      ] 공간을 20자리 확보 후 왼쪽 정렬로 변경
//		System.out.printf("[%.10s]%n", "www.google.com");// -> [www.google] 앞에서 10자리 짤라서 출력 
		
//	}
//
//}
