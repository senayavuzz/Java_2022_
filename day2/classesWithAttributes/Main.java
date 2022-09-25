package day2.classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		//Product product = {1,"Laptop","Asus Laptop",10000,5,"Siyah"};
		Product product = new Product();
		product.setId(1); 
		product.setName("Laptop");
		product.setDescription("Asus Laptop");
		product.setPrice(10000);
		product.setStockAmount(5);
		

		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		System.out.println(product.getCode());

	}

}
