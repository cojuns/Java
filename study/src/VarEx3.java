////		true, false�� ���� ( �ٸ� �� ������ mismatch���� )
//		
//		byte b = 127;
////		-128~127 �� ������ ���� ( �� �̻� �� ������ mismatch���� )
//		
//		int oct = 010; // 8����, 10������ 8
//		int hex = 0x10; // 16����, 10������ 16
////		System.out.println(oct);
////		System.out.println(hex);
//		// println�� 10�����θ� ��� ���λ� ���̻� ��� x
//		
//		long l = 100_000_000; // ��Ƽ�� �ִ�ġ 20���� �ȵǱ� ������ �� �Է� ����
//		long lo = 10_000_000_000L; // ��Ƽ�� �ִ�ġ�� 20���� �ѱ� ������ �ڿ� ���̻� L 
//		
//		float f = 3.14f; // f�� ���� �Ұ�
//		double d = 3.14d; // d�� ���� ���� ( f�� ���� d�� �� ū �׸��̱� ������ )
//		
//		// ��� �Ǽ�
////		System.out.println(10.); // -> 10.0
////		System.out.println(.10); // -> 0.1
////		System.out.println(10f); // -> 10.0 (���̻� f �����Ǽ� ��� )
////		System.out.println(1e3); // -> 1000.0
//		
//		char ch = 'A'; // -> A
//		int i = 'A'; // -> 65
//		
//		String str = ""; // -> �� ���ڿ�(empty string)
//		char ch2 = ' '; // ''�ȿ� �ݵ�� �ϳ��� ���ڰ� �ʿ� ( ���� ����blank)�� ���� ch2�� �ʱ�ȭ
//		
//		String str2 = "ABCD";
//		String str3 = "123";
//		String str4 = str2 + str3; // -> ABCD123
//		
////		System.out.println(""+7+7);// -> 77
////		System.out.println(7+7+"");// -> 14
//		//���� �����ڴ� ���ʿ��� ������ �������� ������ �����ϱ� ������ ���ռ����� ���� ��� ���� �޶���
//		
//		// x�� y�� ����� �� �ٲٱ�
//		int x = 4, y = 2;
//		int tmp;
//		// ���� �ӽ÷� ������ tmp ���� �ϳ� �� ����
//		tmp = x; // 1. x�� ���� tmp�� ����
//		x = y;   // 2. y�� ���� x�� ����
//		y = tmp; // 3. tmp�� ���� y�� ����
//		
////		System.out.println("x="+x);
////		System.out.println("y="+y); 
		
//		System.out.printf("%d%n", 15); // ->15 (%d10����) (%n����)
//		System.out.printf("%#o%n", 15);// ->017 (# ���λ�  0)(%o8����) (%n����)
//		System.out.printf("%#x%n", 15);// ->0xf (# ���λ� 0x )(%x16����) (%n����)
//		System.out.printf("%s", Integer.toBinaryString(15));// -> 1111 ( 2���� �����ڴ� ���� ������ �޼��� ��� 2�� ���ڿ��� �ٲ��� )
//		
//		float f = 123.456789f;
//		System.out.printf("%f%n", f); // ->123.456787 float�� ���е��� 7�ڸ��� 123.4567���� ��Ȯ �������� �ǹ� x 
//		double d = 123.456789d;
//		System.out.printf("%f%n", d); // ->123.456789 double�� ���е��� 15�ڸ��� 123.456789���� ��Ȯ�ϰ� ���
//		System.out.printf("%e%n", d); // ->1.234568e+02 �������� (e+02=10 2����)6���� 8�� ������ �ݿø� 
//		System.out.printf("%g%n", d); // ->123.457 ������ ���� �Ҽ��� ���� 7�ڸ��� ��� �̰͵� �ݿø�
		
//		System.out.printf("[%5d]%n", 10);// -> [   10] 5�� ���� ���� �⺻ ������ ���� �������� �� �������� ä��
//		System.out.printf("[%-5d]%n", 10);// -> [10   ] ���� ����
//		System.out.printf("[%05d]%n", 10);// -> [00010] ���� ��ſ� 0���� ä��
//		System.out.printf("[%05d]%n", 1234567);// -> [1234567] 5�� ���� ���������� �Ѿ ��� ��
//		
//		double d = 1.23456789;
//		System.out.printf("%f%n", d);// -> 1.234568 ������ 8�� �ݿø� ��
//		System.out.printf("%14.10f", d);// ->  1.2345678900 -> �Ҽ��� ���� 14�ڸ� ���� ���� �Ҽ��� �Ʒ� 10�ڸ� ���
//		System.out.printf("%14.6f", d);// -> 1.234568 �Ҽ��� �Ʒ� 6�ڸ� ���
//		
//		System.out.printf("[%s]%n", "www.google.com");// -> [www.google.com] ���ڿ� ��� ������ %s
//		System.out.printf("[%20s]%n", "www.google.com");// -> [      www.google.com] ������ 20�ڸ� Ȯ�� �� ������ ����( �⺻ �� )
//		System.out.printf("[%-20s]%n", "www.google.com");// -> [www.google.com      ] ������ 20�ڸ� Ȯ�� �� ���� ���ķ� ����
//		System.out.printf("[%.10s]%n", "www.google.com");// -> [www.google] �տ��� 10�ڸ� ©�� ��� 
		
//	}
//
//}
