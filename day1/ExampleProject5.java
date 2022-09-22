package day1;

public class ExampleProject5 {

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0, 15 };
		int toFind = 15;
		boolean isThere = false;

		for (int number : numbers) 
		{
			if (number == toFind) 
			{
				isThere = true;
				break;
			}
		}
		if (isThere)
			System.out.println("Sayı mevcuttur.");
		else
			System.out.println("Sayı mevcut değildir.");

	}

}
