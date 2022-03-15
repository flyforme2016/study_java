package ch13;

public class ProductExample2 {

	public static void main(String[] args) {
		Product<String, Integer> product = new Product<>();
	
		product.setKind("벤츠");
		product.setModel(400);
		
		System.out.println("내가 선물받은 차는: " + product.getKind() + " : " + product.getModel() + "입니다.");
		
		Product<Tv, Car> product2 = new Product<>();
		
		product2.setKind(new Tv());
		Tv rtTv = product2.getKind();
		System.out.println(rtTv);
		
		Product<Car, String> product3 = new Product<Car, String>();
		product3.setKind(new Car());
		product3.setModel("더뉴쏘나타");
		
		Car rtCar = product3.getKind();
		String rtString2 = product3.getModel();
		System.out.println(rtCar + " : " + rtString2);
	}

}
