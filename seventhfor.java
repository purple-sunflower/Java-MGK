import java.util.Scanner;

public class seventhfor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		int a ;
		int sum = 0;
		
		for( a = 0 ; a < num ; a++) {
			sum += a + 1 ;
		}
		
		System.out.printf("1부터 %d까지의 합은 %d입니다.", num, sum);
		
		sc.close();
	}

}
