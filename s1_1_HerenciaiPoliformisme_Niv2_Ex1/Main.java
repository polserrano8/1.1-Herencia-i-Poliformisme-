package s1_1_HerenciaiPoliformisme_Niv2_Ex1;

import s1_1_HerenciaiPoliformisme_Niv2_Ex1.model.SmartPhone;

public class Main {
	
	public static void main(String[] args) {

		SmartPhone nokia = new SmartPhone("Nokia","Nokia 3310");
		nokia.alarm();
		nokia.call("691488744");
		nokia.toPhotograph();
	}

}
