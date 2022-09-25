package day2;

public class VariableArguments {

	public static void main(String[] args) {
		int result = plus(2,3,4,5,6,7,8);
		System.out.println(result);
		int result1 = plus();
		System.out.println(result1);
	}
	public static int plus(int... numbers)
	{
		int result_ = 0;
		for(int number : numbers)
		{
			result_ += number;
		}
		return result_;
	}

}
