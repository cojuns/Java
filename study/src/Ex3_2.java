class Ex3_2 {
	public static void main(String args[]) {
		int i=5, j=0;

		j = i++; // ������ ( �����ϱ� i++ �Ʒ��� ) 
		System.out.println("j=i++; ���� ��, i=" + i +", j="+ j);
		// -> j = i;
		//    i++; �ش� ������ ���Ǵ� ���� i=6, j=5
		
		
		i=5;        // ����� ���ϱ� ����, i�� j�� ���� �ٽ� 5�� 0���� ����
		j=0;

		j = ++i; // ������ ( �����ϱ� ++i ���� )
		System.out.println("j=++i; ���� ��, i=" + i +", j="+ j);
		//    ++i;
		// -> j = i; �ش� ������ ���Ǵ� ���� i=6, j=6
	}
}