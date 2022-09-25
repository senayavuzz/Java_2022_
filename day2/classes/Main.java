package day2.classes;

public class Main {

	public static void main(String[] args) {
		//refercence type               //garbage collector
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.add();
		customerManager.remove();
		customerManager.update();

	}

}
