
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
	
	public String getMake() { // Các hàm getters và setters trong class này có this. hay ko cx ðc
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
