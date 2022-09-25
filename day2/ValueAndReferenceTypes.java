package day2;

public class ValueAndReferenceTypes {

	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 20;
		number2 = number1;
		number1 = 30;
		System.out.println(number2);
		//result : 10
		
		int[] numbers1 = new int[] {1,2,3};
		int[] numbers2 = new int[] {2,3,4};
		numbers2 = numbers1;
		numbers1[0] = 30;
		System.out.println(numbers2[0]);
		//result : 30
	}

}
