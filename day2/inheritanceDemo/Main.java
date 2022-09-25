package day2.inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		KrediUI krediUI = new KrediUI();
		krediUI.creditCalculate(new OgretmenKrediManager());
		krediUI.creditCalculate(new AskerKrediManager());


	}	
}
