package com.drew.csci151.corejava.bank;

public class BankCharges {
	private int check;
	private double balance;
	private final int LOW_BALANCE = 400;
	private final int MONTHLY_FEE = 10;
	private final int EXTRA_FEE = 15;

	public BankCharges(int c, double b) {
		check = c;
		balance = b;
	}

	public int getCheck() {
		return check;
	}

	public void setCheck(int check) {
		this.check = check;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getServiceFee() {

		double totalfees = MONTHLY_FEE;

		if (balance < LOW_BALANCE) {
			totalfees += EXTRA_FEE;
		}

//	      if (check >= 60)
//	         fees += (check * 0.04);
//	      else if (check >= 40)
//	         fees += (check * 0.06);
//	      else if (check >= 20)
//	         fees += (check * 0.08);
//	      else
//	         fees += (check * 0.1);

		if (check < 20) {
			totalfees += (check * 0.10);
		}
		if (check >= 20 && check < 40) {
			totalfees += (check * 0.08);
		}
		if (check >= 40 && check < 60) {
			totalfees += (check * 0.06);
		}
		if (check >= 60) {
			totalfees += (check * 0.04);
		}

		return totalfees;

	}

}
