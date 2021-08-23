import java.util.Scanner;

public class eightharray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int length = 5;
		int[] num = new int[length];
		
		System.out.print("숫자 5개를 띄어쓰기로 구분하여 입력하세요: ");
		
		for( int i = 0 ; i < length ; i++) {
			num[i] = sc.nextInt();
		}
		
		System.out.println("====== 입력 완료 ======");
		System.out.println("====== 출력 시작 ======");
		
		
		int[] reverse = new int[5];
		
		for( int i = length - 1, j = 0 ; i >= 0 ; i--, j++) {
			reverse[j] = num[i];
			System.out.printf("%d\n", reverse[j]);
		}
		
		sc.close();
	}

}
