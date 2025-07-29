package s1_1_HerenciaiPoliformisme_Niv2_Ex1.model;

public class Phone {

	private String brand;
	private String model;
	
	
	public Phone(String brand2, String model2){
		this.brand = brand2;
		this.model = model2;
	};
	public void call(String phoneNumber) {
		System.out.println("Calling number: " + phoneNumber);
	}
	public String getBrand() {
		return brand;
	}



	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
