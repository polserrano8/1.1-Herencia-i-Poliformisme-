package s1_1_HerenciaiPoliformisme_Niv1_Ex1;

public class PercussionInstrument extends Instrument {
	
	public PercussionInstrument(String instrumentName, double instrumentPrice) {
		super(instrumentName,instrumentPrice);
	}

	public void play() {
		System.out.println("A percussion instrument is playing");
	}

	public static void playStatic(){
		System.out.println("A percussion instrument is playing");
	}


}
