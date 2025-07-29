package s1_1_HerenciaiPoliformisme_Niv1_Ex1.model;

public abstract class Instrument {
	protected String instrumentName = "";
	protected double instrumentPrice = -1;
	
	public Instrument(String instrumentName, double instrumentPrice) {
		this.instrumentName = instrumentName;
		this.instrumentPrice = instrumentPrice;
		
	}
	public abstract void play();

	
}
