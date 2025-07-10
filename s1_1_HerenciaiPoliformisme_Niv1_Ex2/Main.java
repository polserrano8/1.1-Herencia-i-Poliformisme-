package s1_1_HerenciaiPoliformisme_Niv1_Ex2;

public class Main {

	public static void main(String[] args) {

		Car Bettle = new Car("Berlina");

		Bettle.accelerate();

		Car.brake();

		System.out.println("The power of the car is: " + Bettle.getPOWER());

		System.out.println("The Brand of the car is: " + Car.getBrand());

		System.out.println("The Model of the car is: " + Car.getModel());

	}

}
