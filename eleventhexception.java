import java.util.Scanner;

public class eleventhexception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		while(true) {
			try {
				System.out.print("���ڸ� �Է��ϼ���: ");
				int i = sc.nextInt();
				if( i >= 0 && i <= 9) {
					System.out.println(value[i]);
					System.out.println("���α׷� ����");
					break;
				}
				else {
					System.out.println("0~9 ������ ���� �Է��ϼ���.");
				}
				} catch(ArrayIndexOutOfBoundsException e) {
					continue;
				}
			
			}
		
		}
			
	}



