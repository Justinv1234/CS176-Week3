public class CarTester {

	public static void main(String[] args) {
		Car myHybrid = new Car(50); // 50 miles per gallon
		myHybrid.addGas(20); // Tank 20 gallons
		myHybrid.drive(100); // Drive 100 miles
		//System.out.println(myHybrid.getGasInTank()); // Get gas remaining in tank 

		Car car1 = new Car(50);
		car1.addGas(20);
		car1.drive(100);
		System.out.println(car1.getGasInTank());

	}

}
