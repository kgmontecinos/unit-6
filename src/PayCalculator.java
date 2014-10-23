/**Create an abstract class PayCalculator that has an attribute payRate given in dollars per hour. 
 * The class should also have a method computePay(hours) that returns the pay for a given amount of time.
Derive a class RegularPay from PayCalculator, as described above. It should have a constructor that has a 
parameter for the pay rate. Then derive a class HazardPay from PayCalculator that overrides the computePay method. 
The new method should return the amount returned by the base class method multiplied by 1.5.*/
//abstract class PayCalculator
abstract class PayCalculator {
	//class attribute
	public float payRate;
	//default constructor
	PayCalculator(float payRate){
		this.payRate =payRate;
	}
	//method to compute pay from payRate
	abstract public float computePay(int hours);
	//main method
	public static void main(String [] args){
		PayCalculator a = new RegularPay((float)9.5999996);
		PayCalculator b = new HazardPay((float)12.5);
		System.out.print("Regular pay of ");
		System.out.printf("$%-5.2f %s\n", a.computePay(12), "for 12 hrs");
		System.out.print("Hazard pay of ");
		System.out.printf("$%-5.2f %s\n", b.computePay(12),"for 12 hrs");
	}
	
	
	
}
