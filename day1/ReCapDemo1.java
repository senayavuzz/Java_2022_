package day1;

public class ReCapDemo1 {

	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 50;
		int number3 = 30;
		int max = 0;
		if (number1 > number2 && number1 > number3)
		{
			 max = number1;
		}
		else if(number2 > number1 && number2 > number3) 
		{
			 max = number2;
		}
		else if(number3 > number1 && number3 > number2)
		{
			 max = number3;
		}
		System.out.println(max);
		/*
		 	max = number1;
		 	
		 	if(max < number2)
            	max = number2;
        	if(max < number3)
            	max = number3;
        	System.out.println(max);
		 */
	}

}
