package Chapter10.EX09;

public class VipCustomer extends Customer {
	private int agentID;
	double saleRatio;
	
	VipCustomer(){
		customerGrade = "VIP";
		bonusRatio = 0.05;
		bonusPoint = 10;
	}
	VipCustomer(int customerID, String customerName, int agentID){
		super(customerID,customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		bonusPoint = 10;
	}

}
