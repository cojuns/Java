class Ex3_11 {
	public static void main(String args[]) { 
		double pi = 3.141592; 
		
//		double shortPi = Math.round(pi * 1000) / 1000.0;
//		System.out.println(shortPi);
		
		//���� �ڵ� ����
//		System.out.println(pi);// -> 3.141592
//		System.out.println(pi*1000);// -> 3141.592
//		System.out.println(Math.round(pi*1000));// -> 3142 ( 3141.592 �Ҽ��� ù° �ڸ� 5�� �ݿø� )
//		System.out.println(Math.round(pi*1000)/1000);// -> 3 ( int / int = ������ ������ 3�� ��� )
//		System.out.println(Math.round(pi*1000)/1000.0);// -> 3.142 ( 1000(int) / 1000.0(double) ) ���ϴ� ��� ��� 
//		System.out.println((double)Math.round(pi*1000)/1000);// -> 3.142 �� ���� double�� �ٲ㵵 ��
//		
		// 3.141�� ������� ?
		System.out.println(pi*1000); // -> 3141.592
		System.out.println((int)(pi*1000)); // -> 3141 int�� ����ȯ 
		System.out.println((int)(pi*1000)/1000.0);// -> 3.141 int / doble
		System.out.println((int)(pi*1000)/(double)1000); // -> 3.141 �� �� ����ȯ �����ص� ����
		

	}
}