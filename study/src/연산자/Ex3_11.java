class Ex3_11 {
	public static void main(String args[]) { 
		double pi = 3.141592; 
		
//		double shortPi = Math.round(pi * 1000) / 1000.0;
//		System.out.println(shortPi);
		
		//위에 코드 과정
//		System.out.println(pi);// -> 3.141592
//		System.out.println(pi*1000);// -> 3141.592
//		System.out.println(Math.round(pi*1000));// -> 3142 ( 3141.592 소수점 첫째 자리 5를 반올림 )
//		System.out.println(Math.round(pi*1000)/1000);// -> 3 ( int / int = 나머지 버리고 3만 출력 )
//		System.out.println(Math.round(pi*1000)/1000.0);// -> 3.142 ( 1000(int) / 1000.0(double) ) 원하는 결과 출력 
//		System.out.println((double)Math.round(pi*1000)/1000);// -> 3.142 한 쪽을 double로 바꿔도 됨
//		
		// 3.141을 얻을라면 ?
		System.out.println(pi*1000); // -> 3141.592
		System.out.println((int)(pi*1000)); // -> 3141 int로 형변환 
		System.out.println((int)(pi*1000)/1000.0);// -> 3.141 int / doble
		System.out.println((int)(pi*1000)/(double)1000); // -> 3.141 둘 다 형변환 진행해도 가능
		

	}
}
