class Student{
	
	String s;
	int a;
	int b;
	int c;
	
	Student(String s, int a, int b, int c){
		this.s = s;
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void getAverage() {
		System.out.printf("%sÀÇ Æò±Õ Á¡¼ö : %f\n", this.s , (float) (this.a + this.b + this.c) / 3);
	}
}

public class tenthobjectoriental2 {

	public static void main(String[] args) {
		Student student1 = new Student ("ÄÚ¹Â", 100, 80, 75);
		Student student2 = new Student ("±èº¯¼ö", 96, 58, 90);

		student1.getAverage();
		student2.getAverage();
	}

}
