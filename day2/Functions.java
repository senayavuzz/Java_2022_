package day2;

public class Functions {

	public static void main(String[] args) {
		numberFind();
		numberFind();
		numberFind();
		numberFind();
	}
	
	public static void numberFind ()
	{
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
			messagePrint("Sayı mevcuttur: " + toFind);
		else
			messagePrint("Sayı mevcut değildir: " + toFind);
	}
	public static void messagePrint (String message)
	{
		System.out.println(message);
	}

}
