package org.testing.practice;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC1_GetRequest_All 
{
	public static void main(String[] args) 
	{
		Response store=
		
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/India");
		
		System.out.println("The status code is ");
		System.out.println(store.statusCode());
		System.out.println("The body data is ");
		System.out.println(store.asString());
	}
}
