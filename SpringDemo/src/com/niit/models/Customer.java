package com.niit.models;

public class Customer 
{
	private int custId;
	private String custName;
	private String custAddress;
	
	public Customer() {
		
	}

	public Customer(int custId,String custName,String custAddress)
	{
		super();
			this.custId = custId;
			this.custName = custName;
			this.custAddress = custAddress;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	
	
}
	

