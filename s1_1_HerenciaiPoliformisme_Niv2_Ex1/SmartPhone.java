package s1_1_HerenciaiPoliformisme_Niv2_Ex1;

public class SmartPhone extends Phone implements Camera,Clock{
	

public SmartPhone(String brand, String model){
	super(brand,model);
}
public String getBrand(){
	return this.brand;
}
public String getModel(){
	return this.model;
}
@Override
public void toPhotograph() {
	System.out.println("It's being taken a photo");
}
@Override
public void alarm() {
	System.out.println("It's ringing the alarm");
}
}
