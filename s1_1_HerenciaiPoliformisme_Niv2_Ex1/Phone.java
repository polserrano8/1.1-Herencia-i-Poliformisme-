package s1_1_HerenciaiPoliformisme_Niv2_Ex1;

public class Phone {
	protected String brand;
	protected String model;
	
	
	public Phone(String brand2, String model2){
		this.brand = brand2;
		this.model = model2;
	};
	public void call(String phoneNumber) {
		System.out.println("Calling number: " + phoneNumber);
	}
}
