package day1;

public class ReCapDemo2 {

	public static void main(String[] args) {
		double [] myList = { 1.2 , 2.3 , 3.4 , 4.5 , 5.6};
		
		double total = 0;
		double max = myList[0];
		
		for (double number : myList) {
			if (max < number)
			{
				max = number;
			}
			total += number;
			System.out.println(number);
		}
		System.out.println("--------------");
		System.out.println("total = " + total);
		System.out.println("max = " + max);
		

	}

}
