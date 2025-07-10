package s1_1_HerenciaiPoliformisme_Niv1_Ex1;

public class StringInstrument extends Instrument {
	public StringInstrument(String instrumentName, double instrumentPrice) {
		super(instrumentName,instrumentPrice);
	}

	public void play() {
		System.out.println("A string instrument is playing");
	}
	public static void playStatic(){
		System.out.println("A string instrument is playing");
	}
}
