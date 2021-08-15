import java.util.Scanner;

public class Thirdscanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("========자기소개 입력하기========");
		
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		System.out.print("혈액형 입력하세요: ");
		char bloodtype = sc.next().charAt(0);
		
		System.out.print("MBTI를 입력하세요: ");
		String mbti = sc.next();
		
		System.out.print("좌우명 한 문장을 입력하세요: ");
		sc.nextLine();
		String motto = sc.nextLine();
		
		System.out.println("========자기소개 입력 완료========\n\n");
		
		
		System.out.println("아이엠 그라운드 자기소개 시작! => 시작하려면 엔터를 누르세요.");
		String enter = sc.nextLine();
		
		System.out.printf("저는 %s입니다. 나이는 %d살 이예요.\n", name, age);
		System.out.printf("혈액형은 %c형 이구요, %s입니다.\n\n", bloodtype, mbti);
		System.out.printf("★★★%s!!!!!!!★★★\n", motto);
		
		sc.close();
	}

}
