class Ex3_17 {
	public static void main(String args[]) { 
		int  x, y, z;
		int  absX, absY, absZ;
		char signX, signY, signZ;

		x = 10;
		y = -5;
		z = 0;

		absX = x >= 0 ? x : -x;  // x�� ���� �����̸�, ����� �����. -> true ( absX = x )
		absY = y >= 0 ? y : -y; // -> false ( absY = -y )
		absZ = z >= 0 ? z : -z; // -> true ( absZ = z )
		signX = x > 0 ? '+' : ( x==0 ? ' ' : '-');  // ���� �����ڸ� ��ø -> true ( signX = '+' )
		signY = y > 0 ? '+' : ( y==0 ? ' ' : '-'); // -> false ( y==0 ? ' ' : '-')  -> false ( signY = '-' )
		signZ = z > 0 ? '+' : ( z==0 ? ' ' : '-'); // -> false ( z==0 ? ' ' : '-') -> true ( signZ = ' ' )

		System.out.printf("x=%c%d%n", signX, absX);
		System.out.printf("y=%c%d%n", signY, absY);
		System.out.printf("z=%c%d%n", signZ, absZ);
	}
}