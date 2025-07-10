package s1_1_HerenciaiPoliformisme_Niv1_Ex1;

public class WindInstrument extends Instrument {
	
	public WindInstrument(String instrumentName, double instrumentPrice) {
		super(instrumentName,instrumentPrice);
	}
	public void play() {
		System.out.println("A wind instrument is playing");
	}
	public static void playStatic(){
		System.out.println("A wind instrument is playing");
	}

}
