import java.util.Scanner;

public class Sixthconditional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("==== ������ MBTI ��� ���� ====");
		
		System.out.print("����� MBTI�� �Է��ϼ���: ");
		String mbti = sc.next();
		
		switch(mbti) {
		case "INTP":
		case "intp":
			System.out.println("����� �鿣�����Դϴ�!");
			break;
		case "ENFJ":
		case "enfj":
			System.out.println("����� ����Ʈ�������Դϴ�!");
			break;
		case "INFJ":
		case "infj":
			System.out.println("����� Ǯ�������Դϴ�!");
			break;
		case "ISTJ":
		case "istj":
			System.out.println("����� �ۺ������Դϴ�!");
			break;
		case "ENTJ":
		case "entj":
			System.out.println("����� ��Ű�������Դϴ�!");
			break;
		case "ISFJ":
		case "isfj":
			System.out.println("����� �������������Դϴ�!");
			break;
		case "INTJ":
		case "intj":
			System.out.println("����� �����ͺм������Դϴ�!");
			break;
		case "ENFP":
		case "enfp":
			System.out.println("����� AI���Դϴ�!");
			break;
		case "ENTP":
		case "entp":
			System.out.println("����� iOS���Դϴ�!");
			break;
		case "ESFJ":
		case "esfj":
			System.out.println("����� �ȵ���̵����Դϴ�!");
			break;
		case "ESFP":
		case "esfp":
			System.out.println("����� ���� ���������Դϴ�!");
			break;
		case "ESTP":
		case "estp":
			System.out.println("����� IoT �������Դϴ�!");
			break;
		case "ESTJ":
		case "estj":
			System.out.println("����� QA���Դϴ�!");
			break;
		case "INFP":
		case "infp":
			System.out.println("����� ���ü�����Դϴ�!");
			break;
		case "ISTP":
		case "istp":
			System.out.println("����� �Ӻ���� ���������Դϴ�!");
			break;
		case "ISFP":
		case "isfp":
			System.out.println("����� ��Ʈ��ũ ���������Դϴ�!");
			break;
		default:
			System.out.println("��Ȯ�� mbti ������ �ƴϳ׿�Ф�");
		}
		
		
		sc.close();
	}

}
