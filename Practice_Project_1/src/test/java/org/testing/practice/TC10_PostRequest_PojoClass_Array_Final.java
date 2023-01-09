package org.testing.practice;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC10_PostRequest_PojoClass_Array_Final 
{
	public static void main(String[] args) 
	{
	TC10_PostRequest_PojoClass_Array_Inner[] ref=new TC10_PostRequest_PojoClass_Array_Inner[2];
	ref[0]=new TC10_PostRequest_PojoClass_Array_Inner();
	ref[0].setAddressType("Primary");
	ref[0].setArea("Shree Nagar");
	ref[0].setTaluka("Thane");
	ref[0].setDistrict("Thane");
	
	ref[1]=new TC10_PostRequest_PojoClass_Array_Inner();
	ref[1].setAddressType("Secondary");
	ref[1].setArea("Shivaji Nagar");
	ref[1].setTaluka("Bhiwandi");
	ref[1].setDistrict("Thane");
	
	TC10_PostRequest_PojoClass_Array_Outer ref2=new TC10_PostRequest_PojoClass_Array_Outer();
	ref2.setFirstName("SuryaKumar");
	ref2.setLastName("Yadav");
	ref2.setBattingAvg("42");
	ref2.setAddressDetails(ref);
	
	Response store=
	given()
	.contentType(ContentType.JSON)
	.body(ref2)
	.when()
	.post("http://localhost:3000/India");
	
	System.out.println("The status code is ");
	System.out.println(store.statusCode());
    }
}
