
public class Car extends Engine {

	private String name;
	private String price;
	private String model;

	public String getName() {
		return name;
	}

	public void show() {
		System.out.println("Im in Car class...");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + ", model=" + model + "]";
	}

}
