package s1_1_HerenciaiPoliformisme_Niv1_Ex1;

import java.lang.ref.PhantomReference;

public class Main {

	public static void main(String[] args) {
		PercussionInstrument drum = new PercussionInstrument("Drum" , 30.7);
		StringInstrument violin = new StringInstrument("Violin", 55.2);
		WindInstrument trumpet = new WindInstrument("Trumpet", 60.3);

		drum.play();
		violin.play();
		trumpet.play();

		PercussionInstrument.playStatic();
		StringInstrument.playStatic();
		WindInstrument.playStatic();



	}

}
