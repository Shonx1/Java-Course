public class Car {
	
	public static int carsCount = 0;
	
	private String brand;
	private String model;

	public Car() {
		this.brand = "";
		this.model = "";	
		carsCount++;
	}

	public Car(String brand, String model) {
		this();
		this.brand = brand;
		this.model = model;
	}

	public static int getCarsCount() {
		return carsCount;
	}
}