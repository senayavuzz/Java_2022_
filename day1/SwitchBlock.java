package day1;

public class SwitchBlock {

	public static void main(String[] args) {
		char grade = 'A';

		switch (grade) 
		{
			case 'A':
				System.out.println("Mükemmel : Geçtiniz");
				break;
			case 'B':
				System.out.println("Çok iyi : Geçtiniz");
				break;
			case 'C':
				System.out.println("İyi : Geçtiniz");
				break;
			case 'D':
				System.out.println("Ortalama : Geçtiniz");
				break;
			case 'F':
				System.out.println("Başarısız : Kaldınız");
				break;
			default:
				System.out.println("Hatalı giriş!");
		}

	}

}
