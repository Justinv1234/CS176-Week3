public class Car {
	private double mpg; 
	private double fuelRemaining;
	
	
	public Car(double initMPG) {
		mpg = initMPG;
		fuelRemaining = 0;
	}
	
	public void drive(double miles) {
		fuelRemaining -= miles/mpg;
	}
	
	public void addGas(double addedAmount) {
		fuelRemaining += addedAmount;
	}
	
	public double getGasInTank() {
		return fuelRemaining;
	}	
}
