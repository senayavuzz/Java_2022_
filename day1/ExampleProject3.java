package day1;

public class ExampleProject3 {

	public static void main(String[] args) {
		int number = 27;
		int total = 0;
		
		for (int i = 1; i < number; i++) 
		{
			if (number % i == 0)
				total += i;
		}
		if (total == number)
			System.out.println("Mükemmel sayıdır!");
		else
			System.out.println("Mükemmel sayı değildir.");

	}

}