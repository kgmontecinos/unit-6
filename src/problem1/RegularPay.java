package problem1;

//RegularPay class extends PayCalculator
public class RegularPay extends PayCalculator {

	//constructor w payRate argument invoking from superclass
	public RegularPay(float payRate){
		super(payRate);	
	}
	//computePay implementation for abstract method
	@Override
	public float computePay(int hours) {
		// TODO Auto-generated method stub
		float regPay = this.payRate * ((float)hours);
		return regPay;
	}

}
