import java.util.Scanner;

public class seventhfor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		int num = sc.nextInt();
		
		int a ;
		int sum = 0;
		
		for( a = 0 ; a < num ; a++) {
			sum += a + 1 ;
		}
		
		System.out.printf("1���� %d������ ���� %d�Դϴ�.", num, sum);
		
		sc.close();
	}

}
