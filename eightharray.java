import java.util.Scanner;

public class eightharray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int length = 5;
		int[] num = new int[length];
		
		System.out.print("���� 5���� ����� �����Ͽ� �Է��ϼ���: ");
		
		for( int i = 0 ; i < length ; i++) {
			num[i] = sc.nextInt();
		}
		
		System.out.println("====== �Է� �Ϸ� ======");
		System.out.println("====== ��� ���� ======");
		
		
		int[] reverse = new int[5];
		
		for( int i = length - 1, j = 0 ; i >= 0 ; i--, j++) {
			reverse[j] = num[i];
			System.out.printf("%d\n", reverse[j]);
		}
		
		sc.close();
	}

}
