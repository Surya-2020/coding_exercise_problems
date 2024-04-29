
public class Engine {
	
	private String manufacturer;
	private String engineModel;
	
	public void show() {
		System.out.println("Im in engine class...");
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getEngineModel() {
		return engineModel;
	}
	public void setEngineModel(String engineModel) {
		this.engineModel = engineModel;
	}
	@Override
	public String toString() {
		return "Engine [manufacturer=" + manufacturer + ", engineModel=" + engineModel + "]";
	}
	
	

}
