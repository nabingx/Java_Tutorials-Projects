
public class EncapCar {
	private String make;
	private String model;
	private int year;
	
	EncapCar(String make, String model, int year){
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}
	
	EncapCar(EncapCar x) {
		this.copy(x);
	}
	
	public String getMake() { // C�c h�m getters v� setters trong class n�y c� this. hay ko cx �c
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}

	public void copy(EncapCar x) {
		this.setMake(x.getMake());
		this.setModel(x.getModel());
		this.setYear(x.getYear());
	}
	
}
