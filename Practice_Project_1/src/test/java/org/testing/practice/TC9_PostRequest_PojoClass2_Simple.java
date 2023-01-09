package org.testing.practice;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC9_PostRequest_PojoClass2_Simple 
{
	public static void main(String[] args) 
	{
		TC9_PostRequest_PojoClass1_Simple ref=new TC9_PostRequest_PojoClass1_Simple();
		
		ref.setFirstName("Sunil");
		ref.setLastName("Gavaskar");
		ref.setBattingAvg("52");
		
		Response store=
		given()
		.contentType(ContentType.JSON)
		.body(ref)
		.when()
		.post("http://localhost:3000/India");
		
		System.out.println("The status code is ");
		System.out.println(store.statusCode());
	}
}
