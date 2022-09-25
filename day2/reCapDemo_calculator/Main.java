package day2.reCapDemo_calculator;

public class Main {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int result1 = calculator.plus(5,7);
		int result2 = calculator.minus(10,2);
		int result3 = calculator.multiply(8,9);
		int result4 = calculator.dividedBy(100,25);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

	}

}
