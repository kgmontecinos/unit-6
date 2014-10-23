package problem1;

//HazardPay class extends PayCalculator
public class HazardPay extends PayCalculator {
	//constructor w payRate argument invoking from superclass
	public HazardPay(float payRate){
		super(payRate);
	}
	//computePay implementation for abstract method
	@Override
	public float computePay(int hours) {
		// TODO Auto-generated method stub
		float hazPay= (this.payRate*hours) *((float)1.5);
		return hazPay;
	}

}
