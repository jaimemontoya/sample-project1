package pkg_1;

public class Class_1 {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		byte b1 = 123;
		short sh1 = 7654;
		
		int num1 = 100;
		int num2 = 9;
		int num3 = num1 / num2;
		System.out.println(num3);
		
		if (num1 < num2) {
			System.out.println("num1 is bigger");
		} else {
			System.out.println("num1 is not bigger");
		}
		
		for (int i = 1; i <=10; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.println(i + "," + j);
			}
			System.out.println("All Iterations of J are Done");
		}
		
		String str1 = "I love Java love and Selenium";
		String str2 = "java";
		System.out.println(str1.toLowerCase().contains(str2.toLowerCase()));
		System.out.println(str1.startsWith("I"));
		System.out.println(str1.endsWith("Selenium1"));
		System.out.println(str1.indexOf("love"));
		System.out.println(str1.indexOf("love", 6));
	}

}