class Calculator {
	
	int x;
	int y;
	
	public int sum() {
		return x + y;
	}
	
	public int sub() {
		return x - y;
	}
	
	public int div() {
		return x / y;
	}
	
	public int mul() {
		return x * y;
	}
	
	public void printResult() {
		System.out.printf("%d + %d = %d\n",x, y, sum());
		System.out.printf("%d - %d = %d\n",x, y, sub());
		System.out.printf("%d / %d = %d\n",x, y, div());
		System.out.printf("%d * %d = %d\n",x, y, mul());
	}
}



public class nineth_objectoriental {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.x = 30;
		calculator.y = 50;
		
		calculator.printResult();
	}
	
}
