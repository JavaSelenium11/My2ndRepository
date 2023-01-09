package org.testing.practice;

public class TC10_PostRequest_PojoClass_Array_Outer 
{
	private String FirstName;
	private String LastName;
	private String BattingAvg;
	private TC10_PostRequest_PojoClass_Array_Inner[] AddressDetails;
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getBattingAvg() {
		return BattingAvg;
	}
	public void setBattingAvg(String battingAvg) {
		BattingAvg = battingAvg;
	}
	public TC10_PostRequest_PojoClass_Array_Inner[] getAddressDetails() {
		return AddressDetails;
	}
	public void setAddressDetails(TC10_PostRequest_PojoClass_Array_Inner[] addressDetails) {
		AddressDetails = addressDetails;
	}
}
