import java.util.Scanner;

public class Thirdscanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("========�ڱ�Ұ� �Է��ϱ�========");
		
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = sc.next();
		
		System.out.print("���̸� �Է��ϼ���: ");
		int age = sc.nextInt();
		
		System.out.print("������ �Է��ϼ���: ");
		char bloodtype = sc.next().charAt(0);
		
		System.out.print("MBTI�� �Է��ϼ���: ");
		String mbti = sc.next();
		
		System.out.print("�¿�� �� ������ �Է��ϼ���: ");
		sc.nextLine();
		String motto = sc.nextLine();
		
		System.out.println("========�ڱ�Ұ� �Է� �Ϸ�========\n\n");
		
		
		System.out.println("���̿� �׶��� �ڱ�Ұ� ����! => �����Ϸ��� ���͸� ��������.");
		String enter = sc.nextLine();
		
		System.out.printf("���� %s�Դϴ�. ���̴� %d�� �̿���.\n", name, age);
		System.out.printf("�������� %c�� �̱���, %s�Դϴ�.\n\n", bloodtype, mbti);
		System.out.printf("�ڡڡ�%s!!!!!!!�ڡڡ�\n", motto);
		
		sc.close();
	}

}
