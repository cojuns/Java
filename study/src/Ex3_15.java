import java.util.*;  // ScannerŬ������ ����ϱ� ���� �߰�

class Ex3_15 {
	public static void main(String args[]) { 
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';

		System.out.printf("���ڸ� �ϳ� �Է��ϼ���.>");

		String input = scanner.nextLine();
		ch = input.charAt(0);

		if('0' <= ch && ch <= '9') {
			// 0~9 ��� true �϶� �����Դϴ�. ���
			System.out.printf("�Է��Ͻ� ���ڴ� �����Դϴ�.%n");
		}

		if(('a' <= ch && ch <= 'z') || ('A'<= ch && ch <= 'Z')) {
			// a~z ||  A~Z �ϳ��� true�� true �����Դϴ� ���
			System.out.printf("�Է��Ͻ� ���ڴ� �������Դϴ�.%n");
		}
	} // main
}

// �Է�ĭ�� 1(����)a(����) �Է½� ���� �Էµ� ���� 1�� �����ؼ� �����Դϴ�. ����� ��
// �ݴ�� a(����)1(����) �Է½� �������Դϴ�. ���