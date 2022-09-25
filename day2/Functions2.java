package day2;

public class Functions2 {

	public static void main(String[] args) {
		String message = "Bugün hava çok güzel.";
		String message1 = message.substring(0,3);
		System.out.println(message1);
		String newMessage = city();
		System.out.println(newMessage);
		int result = plus(10,15);
		System.out.println(result);

	}
	public static void insert()
	{
		System.out.println("Eklendi");
	}
	public static void delete()
	{
		System.out.println("Silindi");
	}
	public static void update()
	{
		System.out.println("Güncellendi");
	}
	public static int plus(int number1, int number2)
	{
		return number1 + number2;
	}
	public static String city()
	{
		return "Ankara";
	}

}
