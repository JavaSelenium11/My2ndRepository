package org.testing.practice;

public class TC10_PostRequest_PojoClass_Complex_Outer 
{
	private String FirstName;
	private String LastName;
	private TC10_PostRequest_PojoClass_Complex_Inner BattingAvg;
	
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
	public TC10_PostRequest_PojoClass_Complex_Inner getBattingAvg() {
		return BattingAvg;
	}
	public void setBattingAvg(TC10_PostRequest_PojoClass_Complex_Inner battingAvg) {
		BattingAvg = battingAvg;
	}
}
