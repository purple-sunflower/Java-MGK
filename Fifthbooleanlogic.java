
public class Fifthbooleanlogic {

	public static void main(String[] args) {
		int a = 7;
		int b= 13;
		
		System.out.printf("%d > %d �� %b\n", a, b, a > b );
		System.out.printf("%d >= %d �� %b\n", a, b, a >= b );
		System.out.printf("%d < %d �� %b\n", a, b, a < b );
		System.out.printf("%d <= %d �� %b\n", a, b, a <= b );
		System.out.printf("%d == %d �� %b\n", a, b, a == b );
		System.out.printf("%d != %d �� %b\n\n", a, b, a != b );
		
		int c = 2 ; 
		int d = 6 ;
		int e = 5 ;
		
		System.out.printf("%d > %d && %d < %d�� %b\n", c, d, d, e, c > d && d < e );
		System.out.printf("%d > %d || %d < %d�� %b\n", c, d, d, e, c > d || d < e );
		System.out.printf("%d < %d && %d > %d�� %b\n", c, d, d, e, c < d && d > e );
		System.out.printf("%d < %d || %d > %d�� %b\n\n", c, d, d, e, c < d || d > e );
		
		System.out.printf("!(%d == %d)�� %b\n", c, d, !(c == d));
		System.out.printf("!(%d != %d)�� %b\n", c, d, !(c != d));
		
	
	}

}
