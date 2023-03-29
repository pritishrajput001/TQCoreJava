package Test5;

public class Engine {
	private String engineType;
	private float price;

	public Engine(String engineType, float price) {
		super();
		this.engineType = engineType;
		this.price = price;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return " engineType=" + engineType + ", price=" + price + "";
	}

}
