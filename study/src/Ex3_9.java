class Ex3_9 {
	public static void main(String args[]) { 
		int a = 1_000_000;    // 1,000,000   1백만 = 10의 6제곱
		int b = 2_000_000;    // 2,000,000   2백만 = 10의 6제곱
		
		
		long c = a * b;       // a * b = 2,000,000,000,000 ? 
		// -> 10의 12제곱. int의 범위는 10의 9제곱 오버플로우 발생
		System.out.println(c); // -1454759936
		
		long d = (long)a * b; // -> 둘 다 현재 int 타입이기 때문에 한 쪽을 long 타입으로 변경(둘 다 바꿔도 됨) 
		System.out.println(d);// 2000000000000
	}
}