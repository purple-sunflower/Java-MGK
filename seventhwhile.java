import java.util.Scanner;

public class seventhwhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		int num = sc.nextInt();
		
		int a = 0;
		int sum = 0;
		
		while ( a < num ) {
			sum += a + 1;
			a++;
		}
		
		System.out.printf("1���� %d������ ���� %d�Դϴ�.", num, sum);
		
		sc.close();

	}

}
