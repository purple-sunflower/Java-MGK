import java.util.Scanner;

public class seventhwhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		int a = 0;
		int sum = 0;
		
		while ( a < num ) {
			sum += a + 1;
			a++;
		}
		
		System.out.printf("1부터 %d까지의 합은 %d입니다.", num, sum);
		
		sc.close();

	}

}
