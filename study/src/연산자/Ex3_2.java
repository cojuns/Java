class Ex3_2 {
	public static void main(String args[]) {
		int i=5, j=0;

		j = i++; // 후위형 ( 후위니까 i++ 아래로 ) 
		System.out.println("j=i++; 실행 후, i=" + i +", j="+ j);
		// -> j = i;
		//    i++; 해당 순서로 계산되니 답은 i=6, j=5
		
		
		i=5;        // 결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경
		j=0;

		j = ++i; // 전위형 ( 전위니까 ++i 위로 )
		System.out.println("j=++i; 실행 후, i=" + i +", j="+ j);
		//    ++i;
		// -> j = i; 해당 순서로 계산되니 답은 i=6, j=6
	}
}
