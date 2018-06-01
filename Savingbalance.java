package com.basic;

public class Savingbalance {
public static int annualinterestrate;
double savingbalance;
public Savingbalance(double balance)
{
	this.savingbalance=balance;
}
public void calculatemonthlyinterest() {
	double interest=(savingbalance*(annualinterestrate/100.0)/12);
	savingbalance=savingbalance+interest;
}
public static void ModifyInterestRate(int newvalue)
{
	annualinterestrate=newvalue;
}
public void showbalance() {
	System.out.println("balance"+savingbalance);
}
public static void main(String args[])
{
	Savingbalance a=new Savingbalance(2000);
	Savingbalance b=new Savingbalance(3000);
	Savingbalance.ModifyInterestRate(4);
	a.showbalance();
	b.showbalance();
	a.calculatemonthlyinterest();
	b.calculatemonthlyinterest();
	a.showbalance();
	b.showbalance();
	Savingbalance.ModifyInterestRate(5);
	a.showbalance();
	b.showbalance();
	a.calculatemonthlyinterest();
	b.calculatemonthlyinterest();
	a.showbalance();
	b.showbalance();	
}
}