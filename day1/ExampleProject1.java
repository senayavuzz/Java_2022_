package day1;

public class ExampleProject1 {

	public static void main(String[] args) {

		int j = 2;
		int number = 5;
		boolean isPrime = true;
		if (number <= 1) 
		{
			isPrime = false;
			System.out.println("not prime");
		}
		while (j <= number / 2) 
		{
			if (number % j == 0) 
			{
				isPrime = false;
				break;
			}
			j++;
		}

		System.out.println("Is the number prime ? - " + isPrime);
		/*
		 	int number=2;
	        int remainder = number % 2;
	        
	        boolean isPrime= true;
	        if(number ==1)
	            System.out.println("Sayı asal değildir..");
	        
	        if(number <1)
	        {
	            System.out.println("Geçersiz Sayı!");
	            return;
	        }
	        
	        for (int i = 2; i < number ; i++)
	        {
	            if(number % i == 0)
	                isPrime = false;
	        }
	        if(isPrime)
	            System.out.println("Sayı asaldır.");
	        else{
	            System.out.println("Sayı asal değildir.");
	        }
		 */
	}

}
