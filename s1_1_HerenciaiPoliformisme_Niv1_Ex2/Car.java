package s1_1_HerenciaiPoliformisme_Niv1_Ex2;

import java.util.Scanner;

public class Car {
	// Me falta ver las diferencias y poderlos instanciar!
	private static final String BRAND ="Mercedes";
	private static String Model  = "";
	private final int POWER = 150;//Horsepower

	public  Car(String model){
		Car.Model= model;
	}

	
	public  void accelerate() {
		System.out.println("The vehicle is accelerating");
	}
	public static void brake() {
		System.out.println("The vehicle is breaking");
	}

	public static String getModel() {
		return Model;
	}

	public int getPOWER() {
		return POWER;
	}
	public static String getBrand(){
		return BRAND;
	}

}
