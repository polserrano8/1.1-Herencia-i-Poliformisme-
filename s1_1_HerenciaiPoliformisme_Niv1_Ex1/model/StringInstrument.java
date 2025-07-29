package s1_1_HerenciaiPoliformisme_Niv1_Ex1.model;

public class StringInstrument extends Instrument {
	public StringInstrument(String instrumentName, double instrumentPrice) {
		super(instrumentName,instrumentPrice);
	}

	static {
		System.out.println("Static block that gets executed when loading the class to JVM");
	}
	{
		System.out.println("Initialization block it gets executed every time that the class is instantiated");
	}

	public void play() {
		System.out.println("A string instrument is playing");
	}
	public static void playStatic(){
		System.out.println("A string instrument is playing");
	}
}
